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
    Escribir "Aproximación final de y en x =", x, ": ", y
FinProceso

```
### 🧾 Código en Java


## 🧪 Caso de Prueba: Ejercicio 1

### 📘 Enunciado

Una pequeña población de bacterias crece en un medio nutriente donde la tasa de crecimiento depende tanto del tiempo como del tamaño actual de la población. Este fenómeno puede modelarse mediante la siguiente ecuación diferencial ordinaria:

**Ecuación diferencial:**

    dy/dx = x + y

Donde:
- `x` representa el tiempo en horas,
- `y` representa la cantidad de bacterias (en miles),
- `dy/dx` es la tasa de cambio del tamaño de la población respecto al tiempo.

Se sabe que al inicio del experimento (cuando `x = 0`), hay exactamente 1000 bacterias, es decir:

**Condición inicial:**

    y(0) = 1.0

Se desea estimar el número de bacterias al cabo de 0.1 horas utilizando el método de un solo paso de Heun simple con:

**Paso de integración:**

    h = 0.1

---

### 🧾 Datos de Entrada

- **Ecuación:** `dy/dx = x + y`
- **Condición inicial:** `x0 = 0.0`, `y0 = 1.0`
- **Paso:** `h = 0.1`

---

### ✅ Resultado

| x    | y     |
|------|-------|
| 0.0  | 1.00  |
| 0.1  | 1.11  |

**Aproximación final de y en x = 0.10:**

    y(0.1) ≈ 1.11

---

### 📌 Interpretación

- Después de **0.1 horas** (o **6 minutos**), la población pasó de **1000 bacterias** a aproximadamente **1110 bacterias**.
- Esto representa un crecimiento del **11%** en apenas 6 minutos.
- La forma de la ecuación:

    dy/dx = x + y

sugiere un crecimiento acelerado, ya que depende tanto del tiempo como de la cantidad actual de bacterias.

