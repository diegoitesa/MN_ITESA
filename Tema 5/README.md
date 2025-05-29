# Tema 5
    Interpolación y ajuste de funciones

## Competencia del tema
    Aplica los métodos numéricos con el objetivo aproximar y ajustar funciones mediante el método los métodos de interpolación y regresión clásicos.

## Actividades
- [T5 - E3 - Exposición](/Tema%205/Evidencia%201/)
- [T5 - E2 - Problemario](./Evidencia%202/)
- [T5 - E3 - Programa](./Evidencia%203/)

# Apuntes

## 📌 ¿Qué es la interpolación lineal?

    Es una técnica de aproximación que permite estimar el valor de una función f(x) entre dos puntos conocidos (x0, y0) y (x1, y1), asumiendo que el comportamiento de la función entre ellos es lineal.

### 📐 Fórmula general
La fórmula de interpolación lineal es:

![alt text](image.png)

Dondes: 
- (x0, y0) y (x1, y1) son los puntos conocidos. 
- x es el valor intermedio entre x0 y x1.
- y es el valor estimado de la función en x.

### 🧠 Pasos para aplicar la interpolación lineal
1. Identificar los puntos conocidos (x0, y0) y (x1, y1)
2. Verificar que x esté entre x0 y x1.
3. Sustituir los valores en la fórmula de interpolación lineal.
4. Calcular el valor aproximado de y.

### 📝 Ventajas
- Método simple y rápido.
- Buena aproximación si los puntos están cercanos y la función es suave.

### ⚠️ Desventajas
- No es exacto si la función no es lineal en el intervalo.
- Puede generar errores significativos si se aplica fuera del intervalo (extrapolación).

### 📚 Aplicaciones comunes
- Ingeniería y física para obtener datos faltantes.
- Tablas de valores (como logaritmos, funciones trigonométricas).
- Gráficas y simulaciones numéricas.

---

## 📌 ¿Qué es la interpolación polinómica de Newton?

Es una técnica que permite aproximar el valor de una función mediante un polinomio, usando varios puntos conocidos.  
A diferencia de la interpolación lineal, **usa más de dos puntos** para mejorar la precisión de la estimación.

🧠 **Idea clave**: Usa diferencias divididas para construir un polinomio que pase por todos los puntos conocidos.

### 📐 Fórmula general del polinomio de Newton

P(x) = f[x₀]  
     + f[x₀,x₁](x - x₀)  
     + f[x₀,x₁,x₂](x - x₀)(x - x₁)  
     + f[x₀,x₁,x₂,x₃](x - x₀)(x - x₁)(x - x₂)  
     + ...  
     + f[x₀,x₁,...,xₙ](x - x₀)(x - x₁)...(x - xₙ₋₁)

Donde:
- f[x₀], f[x₀,x₁], f[x₀,x₁,x₂], etc., son diferencias divididas.
- Los factores (x - xi) se multiplican en forma progresiva.

### 🔢 ¿Cómo se calculan las diferencias divididas?

- Primera diferencia:  
  `f[x₀,x₁] = (f(x₁) - f(x₀)) / (x₁ - x₀)`

- Segunda diferencia:  
  `f[x₀,x₁,x₂] = (f[x₁,x₂] - f[x₀,x₁]) / (x₂ - x₀)`

- Tercera diferencia y siguientes se calculan de la misma forma.

🧠 Cada nueva diferencia usa las anteriores y un punto nuevo.

### 🧠 Pasos para aplicar la interpolación de Newton

1. Anotar todos los puntos conocidos: (x₀, y₀), (x₁, y₁), (x₂, y₂), ...
2. Calcular las diferencias divididas en una tabla.
3. Sustituir los valores en la fórmula del polinomio.
4. Evaluar el polinomio para el valor de x deseado.

### 📝 Ventajas

- Más preciso que el método lineal si se usan más puntos.
- Útil para construir tablas de interpolación y polinomios personalizados.

### ⚠️ Desventajas

- El cálculo de diferencias divididas puede ser laborioso a mano.
- Puede volverse inestable si se usan muchos puntos muy separados.

### 📚 Aplicaciones comunes

- Aproximación de funciones complejas con pocos puntos conocidos.
- Simulación numérica en física, química e ingeniería.
- Cálculo de valores intermedios en bases de datos experimentales.

---


