# Tema 6
    Solución de ecuaciones diferenciales

## Competencia del tema
    Utiliza los métodos de transformación numérica para solución de ecuaciones diferenciales, valiéndose de los métodos clásicos  y caracteriza sus aplicaciones y limitaciones.

## Actividades
- [T6 - E1 - Exposición](./Evidencia%201/)
- [T6 - E2 - Problemario](./Evidencia%202/)

# Apuntes

## Métodos de Varios Pasos

### 📌 ¿Qué son?

    Los métodos de varios pasos (o multistep methods) son técnicas numéricas que utilizan más de un punto anterior para aproximar la solución de una ecuación diferencial ordinaria (EDO).
    Se diferencian de los métodos de un solo paso (como Euler o Runge-Kutta) porque aprovechan información previa para mejorar la precisión sin aumentar el número de evaluaciones de la función en cada paso.

### 📐 Forma general
Para una EDO de la forma:

![alt text](image.png)

El método de varios pasos tiene una forma general:

![alt text](image-1.png)

Donde:

- y_(n+1) es el valor aproximado de la solución en el paso siguiente.
- fi = f(xi, yi)
- h es el tamaño del paso.
- los coeficientes ai, bi definen el método.


### 🔢 Métodos comunes

#### ✅ Método de Adams-Bashforth (explícito)
- Usa solo valores ya conocidos.
- Fórmula (2 pasos):

![alt text](image-2.png)

#### ✅ Método de Adams-Moulton (implícito)
- Involucra el valor f_(n+1), requiere resolver una ecuación.
- Fórmula (2 pasos):

![alt text](image-3.png)

### 🧠 Ventajas
- Mayor eficiencia: reutilizan información previa, reduciendo evaluaciones.
- Alta precisión con pasos más grandes en comparación con métodos de un solo paso.

### ⚠️ Desventajas
- Requieren de valores iniciales previos (usualmente obtenidos con Runge-Kutta).
- Los métodos implícitos pueden ser computacionalmente costosos.

### 📚 Aplicaciones típicas
- Modelado de sistemas físicos (movimiento, circuitos, reacciones químicas).
- Simulación de procesos en tiempo real donde se busca precisión acumulada.

---

## Métodos de Un Solo Paso

### 📌 ¿Qué son?

Los métodos de un solo paso (o one-step methods) son técnicas numéricas que calculan la solución de una ecuación diferencial ordinaria (EDO) usando solo el punto actual y su derivada.  
No dependen de múltiples puntos anteriores, lo que los hace simples pero menos precisos si se usa un paso grande.

### 📐 Forma general

Para una EDO de la forma:

dy/dx = f(x, y), y(x₀) = y₀

La forma general de un método de un solo paso es:

yₙ₊₁ = yₙ + h · φ(xₙ, yₙ, h)

Donde:

- `h` es el tamaño del paso.
- `φ` es una función que estima el cambio en `y` a partir de la derivada.

---

### 🔢 Métodos comunes

#### ✅ Método de Euler (explícito)
El más simple. Usa la pendiente en el punto actual para avanzar.

yₙ₊₁ = yₙ + h · f(xₙ, yₙ)


#### ✅ Método de Euler Mejorado (Heun)
Promedia la pendiente en el punto actual y el siguiente estimado.

k₁ = f(xₙ, yₙ)
k₂ = f(xₙ + h, yₙ + h · k₁)
yₙ₊₁ = yₙ + (h/2) · (k₁ + k₂)

#### ✅ Método de Runge-Kutta de 4to orden (RK4)
Muy preciso. Utiliza una combinación de varias pendientes.

k₁ = f(xₙ, yₙ)
k₂ = f(xₙ + h/2, yₙ + h·k₁/2)
k₃ = f(xₙ + h/2, yₙ + h·k₂/2)
k₄ = f(xₙ + h, yₙ + h·k₃)
yₙ₊₁ = yₙ + (h/6) · (k₁ + 2·k₂ + 2·k₃ + k₄)

---

### 🧠 Ventajas
- Simples de implementar.
- Útiles para obtener valores iniciales para métodos de varios pasos.
- No requieren almacenar mucha información previa.

### ⚠️ Desventajas
- Menor precisión comparado con métodos de varios pasos (con el mismo `h`).
- Se necesita un paso pequeño para mayor exactitud, lo que implica más cálculos.

### 📚 Aplicaciones típicas
- Simulación de trayectorias en física.
- Problemas de valor inicial sencillos.
- Sistemas dinámicos con condiciones iniciales claras.
