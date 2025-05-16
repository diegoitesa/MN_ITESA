# Tema 3
    Métodos de solución de sistemas de ecuaciones

## Competencia del tema
    Aplica los métodos numéricos para la solución de sistemas de ecuaciones lineales mediante  la aplicación de los métodos de solución clásicos.

## Actividades
- [T3 - E1 - Mapa Mental](/Tema%203/Evidencia%201/)
- [T3 - E2 - Problemario](/Tema%203/Evidencia%202/)
- [T3 - E3 - Programa](/Tema%203/Evidencia%203/)

# Apuntes

## Gauss con pivote

### ✅ ¿Para qué sirve?
- Para resolver sistemas de ecuaciones lineales.
- Transforma el sistema en una forma escalonada, que se puede resolver por sustitución hacia atrás.

### 🧮 Pasos generales:
- Formar la matriz aumentada del sistema.
- Para cada fila (desde arriba hacia abajo):
- Buscar el pivote (el número más grande en valor absoluto de la columna actual) y cambiar filas si es necesario (esto se llama pivoteo parcial).
- Usar el pivote para hacer ceros debajo de él, eliminando las otras entradas de la columna.
- Cuando tengas una matriz triangular superior, resuelves de abajo hacia arriba (sustitución regresiva).

### 🔎 ¿Qué es el pivoteo?
- Elegir el mayor número posible como pivote para evitar errores numéricos y mejorar la precisión.

## Método de Gauss-Jordan

### ✅ ¿Para qué sirve?
- También resuelve sistemas de ecuaciones, pero va más allá: convierte la matriz en una forma escalonada reducida.
- Es útil cuando quieres encontrar la solución directa sin sustitución regresiva.

### 🧮 Pasos generales:
1. Formar la matriz aumentada.
2. Para cada fila:
    - Asegúrate de que el pivote sea 1 (divide la fila si es necesario).
    - Usa ese pivote para hacer ceros en toda su columna (arriba y abajo).
3. Al final, tendrás una matriz identidad en la parte izquierda y la solución del sistema en la derecha.