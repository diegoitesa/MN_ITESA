import sympy as sp

# 1. Ingresar tamaño del sistema
n = int(input("Ingrese el número de ecuaciones del sistema: "))

# 2. Nombres de variables
print("\nIngrese los nombres de las variables (ejemplo: x y z):")
var_names = input().strip().split()

if len(var_names) != n:
    print(f"Error: debe ingresar exactamente {n} nombres.")
    exit()

# 3. Ecuaciones
funciones = []
print("\nIngrese las ecuaciones (use t y las variables indicadas):")
for i in range(n):
    eq = input(f"d{var_names[i]}/dt = ")
    # Crear variables simbólicas
    variables = ['t'] + var_names
    symbols = sp.symbols(variables)
    expr = sp.sympify(eq, locals=dict(zip(variables, symbols)))
    funciones.append(expr)

# 4. Condiciones iniciales
condiciones_iniciales = []
print("\nIngrese las condiciones iniciales:")
for var in var_names:
    val = float(input(f"{var}(0) = "))
    condiciones_iniciales.append(val)

# 5. Parámetros de simulación
h = float(input("\nIngrese el paso de tiempo (h): "))
t_final = float(input("Ingrese el tiempo final de simulación: "))

pasos = int(round(t_final / h)) + 1
solucion = [[0.0 for _ in range(pasos)] for _ in range(n)]
tiempo = [i * h for i in range(pasos)]

# Inicializar condiciones iniciales
for i in range(n):
    solucion[i][0] = condiciones_iniciales[i]

# 6. Método de Euler
for i in range(1, pasos):
    t = tiempo[i - 1]
    anteriores = [solucion[j][i - 1] for j in range(n)]

    for j in range(n):
        expr = funciones[j]
        # Diccionario de variables actuales
        valores = {'t': t}
        for k in range(n):
            valores[var_names[k]] = anteriores[k]
        derivada = float(expr.evalf(subs=valores))
        solucion[j][i] = anteriores[j] + h * derivada

# 7. Imprimir resultados
print("\nResultados numéricos:")
print("t\t", end="")
for var in var_names:
    print(f"{var}(t)\t\t", end="")
print()

for i in range(pasos):
    print(f"{tiempo[i]:.2f}\t", end="")
    for j in range(n):
        print(f"{solucion[j][i]:.6f}\t", end="")
    print()
