# EJERCICIO 1: Error por Desbordamiento

import math  # Se importa el módulo math para usar math.factorial()

# Definición de una función recursiva para calcular el factorial
def factorial(n):
    """Calcula n! recursivamente para observar desbordamiento."""
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

# Se intenta calcular el factorial de 500 de forma recursiva
try:
    fact_recursivo = factorial(500)
except RecursionError:
    # Si ocurre un error de desbordamiento (stack overflow), se guarda el mensaje
    fact_recursivo = "Error por desbordamiento recursivo"

# Cálculo del factorial usando la función integrada de Python (más segura y optimizada)
fact_math = math.factorial(500)

# Evaluación de errores solo si la función recursiva funcionó correctamente
if isinstance(fact_recursivo, int):
    # Cálculo del error absoluto entre ambos resultados
    error_absoluto = abs(fact_math - fact_recursivo)

    # Cálculo del error relativo con respecto al resultado de math.factorial
    error_relativo = error_absoluto / abs(fact_math)

    # Cálculo del error de precisión con respecto al resultado recursivo
    error_precision = abs(error_absoluto / fact_recursivo)
else:
    # En caso de error, no se pueden calcular los errores
    error_absoluto = error_relativo = error_precision = "No se puede calcular debido a desbordamiento"

# Impresión de los resultados obtenidos
print("Ejercicio 2: Error por Desbordamiento")
print(f"Factorial (math.factorial): {fact_math}")
print(f"Factorial (recursivo): {fact_recursivo}")
print(f"Error absoluto: {error_absoluto}")
print(f"Error relativo: {error_relativo}")
print(f"Error de precisión: {error_precision}")


# EJERCICIO 2: Desbordamiento en progresión geométrica

# Definición de la función recursiva para calcular la suma geométrica (incorrectamente)
def suma_geometrica(n, r):
    # Caso base: cuando n = 0, el primer término es 1 (r^0)
    if n == 0:
        return 1
    # Paso recursivo: se multiplica r por el resultado de la llamada anterior
    return r * suma_geometrica(n - 1, r)

# Intento de ejecutar la función recursiva con n = 200 y r = 2
try:
    suma = suma_geometrica(200, 2)
except RecursionError:
    # En caso de exceder el límite de recursión, se atrapa el error
    suma = "Error por desbordamiento"

# Impresión del resultado (o del error)
print("Ejercicio 2: Desbordamiento en progresión geométrica")
print(f"Suma de la serie: {suma}")


# EJERCICIO 3: Desbordamiento en energía

# Definición de la masa en kilogramos (valor extremadamente grande)
m = 10**30

# Definición de la velocidad de la luz al cuadrado (en m/s)
c = 3 * 10**8

# Intento de calcular la energía con manejo de posibles errores por desbordamiento
try:
    energia = m * c**2  # Cálculo directo de E = m * c²
except OverflowError:
    # En caso de desbordamiento, se captura el error
    energia = "Error por desbordamiento"

# Impresión del resultado o del error
print("Ejercicio 3: Desbordamiento en energía")
print(f"Energía liberada: {energia}")


# EJERCICIO 4: Desbordamiento en la serie de Fibonacci

# Definición recursiva clásica de Fibonacci
def fibonacci(n):
    # Caso base 1: F(0) = 0
    if n == 0:
        return 0
    # Caso base 2: F(1) = 1
    elif n == 1:
        return 1
    # Paso recursivo: F(n) = F(n-1) + F(n-2)
    return fibonacci(n - 1) + fibonacci(n - 2)

# Intento de calcular el término 1000 de la serie de Fibonacci
try:
    fib_1000 = fibonacci(1000)
except RecursionError:
    # Si ocurre un error por demasiadas llamadas recursivas (stack overflow)
    fib_1000 = "Error por desbordamiento"

# Impresión del resultado o del error
print("Ejercicio 4: Desbordamiento en la serie de Fibonacci")
print(f"Fibonacci(1000): {fib_1000}")


# EJERCICIO 5: Desbordamiento en sumatoria financiera

import sys  # Se importa para acceder a sys.maxsize (valor entero máximo típico del sistema)

# Se crea una lista de 10 millones de transacciones, cada una con el valor máximo permitido por el sistema
transacciones = [sys.maxsize] * 10_000_000

# Intento de sumar todos los valores de la lista
try:
    total = sum(transacciones)
except OverflowError:
    # En caso de que el sistema no pueda manejar la suma total, se captura el error
    total = "Error por desbordamiento"

# Impresión del resultado o del error
print("Ejercicio 5: Desbordamiento en sumatoria financiera")
print(f"Total de transacciones: {total}")
