# Evidencia 2
    Problemario

## Instrucciones
    1.- Conformarán en equipos 
    2.- Desarrollar 5 ejercicios pertinentes por método;
    3.- Desarrollar la solución en un lenguaje de programación y correr las pruebas de caja negra.
    4.- Conformar el Problemario con los ejercicios  y actualziarlso en el GITHUB   

## Actividad
- [T6 - E2 - Problemario](./T6%20-%20E2%20-%20Problemario.pdf)

## Integrantes del github
- Diego Alonso Coronel Vargas
    - [Códigos del método de Varios Pasos](./AdamsBashforthConRK4.java)
- Oscar Aaron Delgadillo Fernandez
    - [Código de Euler en Java](/Tema%206/Evidencia%202/EulerODESolver.java)
    - [Código de Euler en Python](/Tema%206/Evidencia%202/ejercicio.py)
- Brandon García Ordaz
    - [Código de Euler en Java](/Tema%206/Evidencia%202/EulerCafe.java)

## Método de Varios Pasos (Adams-Bashforth)

### ¿Qué es?

    El método de varios pasos es una técnica numérica para resolver ecuaciones diferenciales ordinarias (EDO) utilizando varios valores anteriores ya calculados de la función y sus derivadas.

- Adams-Bashforth de 4 pasos es un método explícito que usa los 4 valores anteriores de la derivada para estimar el siguiente valor de la solución:

$$
y_{n+1}=y_n + \frac{h}{24}[55f_n - 59 f_{n-1} + 37f_{n-2} - 9f_{n-3}]
$$

    Es eficiente, pero necesita valores iniciales previos, que suelen obtenerse con Runge-Kutta.


### 📋 Pseudocódigo

    Entrada: f(t, y), t0, y0, h, n (número de pasos)
    1. Calcular los primeros 3 valores usando Runge-Kutta de orden 4
    2. Para i = 3 hasta n-1 hacer:
        tNext = t_i + h
        yNext = y_i + h/24 * (55*f(t_i, y_i) - 59*f(t_{i-1}, y_{i-1}) + 
                            37*f(t_{i-2}, y_{i-2}) - 9*f(t_{i-3}, y_{i-3}))
        Guardar tNext y yNext en listas
    3. Fin

### 💻 Código en Java

- Usa Runge-Kutta 4 para calcular los primeros 3 puntos.
- Aplica el método de Adams-Bashforth de 4 pasos para los siguientes.
- Calcula y compara con la solución exacta  y(t) = 1/\sqrt{1-2t}

[Código en Java del método de Varios Pasos](./AdamsBashforthConRK4.java)

#### Breve explicación del flujo del código:

    // f(t, y) = y^3
    // Condiciones iniciales: t0 = 0, y0 = 1
    // Paso h = 0.05
    // Se calculan 20 puntos (t desde 0.0 hasta 0.95)

    Runge-Kutta de orden 4:
    - Se calculan y1, y2, y3 a partir de y0

    Adams-Bashforth:
    - Desde i = 3 hasta n = 20
    - Se aplica la fórmula explícita para y_{i+1}

    Comparación:
    - Se imprime y_aprox y y_exacta para cada t


### 📌 Caso de prueba

EDO:

$$
dy/dt = y^3,  y(0) = 1
$$

Solución exacta:
$$
y(t) = \frac{1}{\sqrt{1-2t}}
$$

#### Objetivo:
Aproximar la solución en el intervalo t ∈ [0,0.95] con paso h = 0.05

#### Resultado de la ejecución (extracto):

    t = 0.00, y_aprox = 1.000000, y_exacta = 1.000000
    t = 0.05, y_aprox = 1.063215, y_exacta = 1.063014
    t = 0.10, y_aprox = 1.136513, y_exacta = 1.136364
    ...
    t = 0.45, y_aprox = 2.339927, y_exacta = 2.345208
    t = 0.50, y_aprox = 2.756446, y_exacta = Infinity
    ...

🔎 Se observa que la solución exacta se vuelve infinita en 𝑡 = 0.5, y el método numérico lo aproxima correctamente antes de ese punto.

### 🧠 Conclusión
- El método de varios pasos reduce el costo computacional (reutiliza cálculos anteriores).
- Es eficiente y preciso, pero requiere buenas estimaciones iniciales.
- En este caso, el método combina Runge-Kutta (para iniciar) con Adams-Bashforth (para continuar).
- Muy útil en simulaciones prolongadas donde la eficiencia es clave.


## Euler
¿Que es?
El método de Euler es una técnica numérica sencilla y directa para resolver ecuaciones diferenciales ordinarias (EDO) de primer orden. Se basa en una aproximación por pasos que utiliza la pendiente de la función en un punto inicial para estimar el valor de la función en puntos sucesivos.

### Forma General
   -[Forma](/Tema%206/formaEuler.png)
### Formula
-[Formula](/Tema%206/formulaEuler.png)
### Codigo en Java
-[Codigo](/Tema%206/Evidencia%202/EulerODESolver.java)
### Pseudocodigo
```pascal
Algoritmo Euler2EDOs
        Definir pasos, i Como Entero
        Definir h, tFinal, t, dx, dy Como Real
        Definir x0, y0 Como Real
        Dimension tiempo[1000]
        Dimension solucionX[1000]
        Dimension solucionY[1000]
        Escribir "Ingrese x(0):"
        Leer x0
        Escribir "Ingrese y(0):"
        Leer y0
        Escribir "Ingrese el paso de tiempo h:"
        Leer h
        Escribir "Ingrese el tiempo final de simulación:"
        Leer tFinal
        pasos <- trunc(tFinal / h) + 1
        tiempo[0] <- 0
        solucionX[0] <- x0
        solucionY[0] <- y0
        Para i <- 1 Hasta pasos - 1
            tiempo[i] <- tiempo[i - 1] + h
            t <- tiempo[i - 1]
            // Derivadas del sistema
            dx <- solucionX[i - 1] + t
            dy <- -solucionY[i - 1] + t
            // Método de Euler
            solucionX[i] <- solucionX[i - 1] + h * dx
            solucionY[i] <- solucionY[i - 1] + h * dy
        FinPara
        // Imprimir tabla de resultados
        Escribir "t", " x(t) y(t)"
        Para i <- 0 Hasta pasos - 1
            Escribir tiempo[i], " ", solucionX[i], " ", solucionY[i]
    FinPara
FinAlgoritmo
```
### Caso de prueba
En una habitación con temperatura ambiente de 22 °C, se coloca una taza de café caliente.
La temperatura del café disminuye con el tiempo según la ley de enfriamiento de Newton:

### Resultado esperado
| t (min) | y (°C)   |
|--------|----------|
| 0      | 90.0000  |
| 1      | 83.2000  |
| 2      | 77.0800  |
| 3      | 71.5720  |
| 4      | 66.6148  |
| 5      | 62.1533  |
| 6      | 58.1380  |
| 7      | 54.5242  |
| 8      | 51.2718  |
| 9      | 48.3446  |
| 10     | 45.7101  |

### Interpretacion de los resultados
Se muestra una tabla donde se observa el comportamiento de la temperatura del café en
función del tiempo. Se parte de un valor inicial de 90 °C al minuto 0 y se aprecia cómo la
temperatura desciende progresivamente.
En el minuto 1 ya se ha enfriado a 83.2 °C y al minuto 10 alcanza los 45.71 °C. Esto indica
que el café pierde calor más rápidamente cuando la diferencia con la temperatura ambiente
(22 °C) es mayor, y se enfría más lentamente conforme se aproxima a dicha temperatura.
Este comportamiento es característico de un proceso de enfriamiento natural, donde la
razón de cambio es proporcional a la diferencia entre la temperatura actual y la temperatura
del entorno.


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

- [Código de java](MetodoHeun.java)

## 🧪 Caso de Prueba

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
