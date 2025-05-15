import numpy as np

def f(x):
    """ 
    Define la función f(x) = e^(-x) - x. 
    Esta función se utiliza para encontrar la raíz en el intervalo dado.
    """
    return np.exp(-x) - x

def regla_falsa(f, a, b, tol=1e-6, max_iter=100):
    """ 
    Implementa el método de la regla falsa para encontrar la raíz de la función f en el intervalo [a, b].

    Parámetros:
    f : función
        La función para la cual se busca la raíz.
    a : float
        Límite inferior del intervalo.
    b : float
        Límite superior del intervalo.
    tol : float, opcional
        Tolerancia para la convergencia (por defecto es 1e-6).
    max_iter : int, opcional
        Número máximo de iteraciones permitidas (por defecto es 100).

    Retorna:
    float
        La aproximación de la raíz de la función f.

    Lanza:
    ValueError
        Si f(a) * f(b) >= 0, indicando que no hay cambio de signo en el intervalo.
    """
    # Verificación de que hay un cambio de signo en el intervalo
    if f(a) * f(b) >= 0:
        raise ValueError(f"El intervalo [{a}, {b}] no cambia de signo. f(a)={f(a)}, f(b)={f(b)}")

    # Iteración hasta alcanzar la tolerancia o el número máximo de iteraciones
    for _ in range(max_iter):
        # Cálculo del punto xr usando la fórmula de la regla falsa
        xr = (a * f(b) - b * f(a)) / (f(b) - f(a))

        # Verificación de si se ha alcanzado la tolerancia deseada
        if abs(f(xr)) < tol:
            return xr

        # Actualización de los límites del intervalo
        if f(a) * f(xr) < 0:
            b = xr  # La raíz está en el intervalo [a, xr]
        else:
            a = xr  # La raíz está en el intervalo [xr, b]

    return xr  # Retorna la última aproximación de la raíz

# Usamos el intervalo dado [0, 1]
raiz = regla_falsa(f, 0, 1)

# Aplicamos formato para mostrar 4 cifras significativas
print(f"La raíz aproximada es: {raiz:.3g}")
