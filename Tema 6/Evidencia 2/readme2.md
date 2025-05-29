# 📘 Métodos de un paso

## ✅ Método de Heun Simple

### 📌 ¿Qué es?

El método de **Heun** es una mejora del método de Euler. También se le conoce como "Euler mejorado" o "predictor-corrector de segundo orden".  
Sirve para aproximar soluciones de una **ecuación diferencial ordinaria (EDO)** de primer orden.  
Este método calcula una predicción con la pendiente inicial (como Euler), pero luego la corrige promediando la pendiente inicial y la pendiente calculada en el punto predicho.

---

### 📐 Fórmula

Dada una EDO de la forma:

dy/dx = f(x, y)


El método de Heun simple se aplica así:

1. Calcular pendiente inicial:  
   `k₁ = f(xₙ, yₙ)`

2. Calcular valor predicho de `y` usando Euler:  
   `y_predict = yₙ + h · k₁`

3. Calcular pendiente en el punto predicho:  
   `k₂ = f(xₙ + h, y_predict)`

4. Calcular pendiente promedio:  
   `pendiente_promedio = (k₁ + k₂) / 2`

5. Calcular el nuevo valor de `y`:  
   `yₙ₊₁ = yₙ + h · pendiente_promedio`

---

### 🧾 Pseudocódigo

```pascal
Proceso MetodoHeunSimple
    Definir x, y, h, k1, k2, yPredic, pendientePromedio, yNuevo Como Real
    // Condiciones iniciales
    x <- 0
    y <- 1
    h <- 0.1

    Escribir "x:", x
    Escribir "y:", y

    // Paso 1: calcular pendiente inicial
    k1 <- x + y

    // Paso 2: calcular valor predicho de y
    yPredic <- y + h * k1

    // Paso 3: calcular pendiente en el punto predicho
    k2 <- (x + h) + yPredic

    // Paso 4: calcular la pendiente promedio
    pendientePromedio <- (k1 + k2) / 2

    // Paso 5: nuevo valor de y corregido
    yNuevo <- y + h * pendientePromedio

    // Paso 6: actualizar x e y
    x <- x + h
    y <- yNuevo

    // Mostrar resultado
    Escribir "x:", x
    Escribir "y:", y
    Esc

---

    Código en Java

    