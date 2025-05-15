# EJERCICIO 1: Error por Truncamiento

import math  # Importación del módulo math para usar truncamiento

# Definición del saldo inicial con decimales exactos
saldo = 10000.257

# Conversión de la tasa anual a decimal
tasa_anual = 3.75 / 100

# Cálculo de la tasa mensual dividiendo la anual entre 12
tasa_mensual = tasa_anual / 12

# Cálculo del interés mensual real (sin truncamiento)
interes_real = saldo * tasa_mensual

# Truncamiento del interés mensual a dos decimales (sin redondear)
interes_truncado = math.trunc(interes_real * 100) / 100

# Cálculo del error absoluto entre el valor real y el truncado
error_absoluto = abs(interes_real - interes_truncado)

# Cálculo del error relativo como proporción respecto al interés real
error_relativo = error_absoluto / abs(interes_real)

# Cálculo del error de precisión como proporción respecto al interés truncado
# Se usa una condición para evitar división entre cero
error_precision = abs(error_absoluto / interes_truncado) if interes_truncado != 0 else float('inf')

# Impresión de los resultados
print("Ejercicio 1: Error por Truncamiento")
print(f"Interés real: {interes_real}")
print(f"Interés truncado: {interes_truncado}")
print(f"Error absoluto: {error_absoluto}")
print(f"Error relativo: {error_relativo}")
print(f"Error de precisión: {error_precision}")


# EJERCICIO 2: Truncamiento en cálculo de áreas

import math  # Se importa el módulo math para utilizar constantes y funciones matemáticas

# Definición del radio del terreno en metros (con alta precisión)
radio = 7.823

# Cálculo del área real del círculo usando la fórmula A = π * r²
area_real = math.pi * (radio ** 2)

# Truncamiento del área a dos cifras decimales (sin redondear)
area_truncada = math.trunc(area_real * 100) / 100

# Cálculo del error absoluto como la diferencia entre el área real y la truncada
error_absoluto = abs(area_real - area_truncada)

# Cálculo del error relativo como la proporción del error respecto al valor real
error_relativo = error_absoluto / abs(area_real)

# Cálculo del error de precisión como la proporción del error respecto al valor truncado
# Se previene una división por cero con una condición
error_precision = abs(error_absoluto / area_truncada) if area_truncada != 0 else float('inf')

# Impresión de los resultados obtenidos
print("Ejercicio 2: Truncamiento en cálculo de áreas")
print(f"Área real: {area_real}")
print(f"Área truncada: {area_truncada}")
print(f"Error absoluto: {error_absoluto}")
print(f"Error relativo: {error_relativo}")
print(f"Error de precisión: {error_precision}")


# EJERCICIO 3: Truncamiento en conversión de temperatura

import math  # Importación del módulo math para realizar truncamiento

# Definición de la temperatura en grados Celsius
celsius = 37.857

# Cálculo exacto de la temperatura en grados Fahrenheit usando la fórmula F = (C × 9/5) + 32
fahrenheit_real = (celsius * 9/5) + 32

# Truncamiento de la temperatura a dos cifras decimales (sin redondear)
fahrenheit_truncado = math.trunc(fahrenheit_real * 100) / 100

# Cálculo del error absoluto entre el valor real y el truncado
error_absoluto = abs(fahrenheit_real - fahrenheit_truncado)

# Cálculo del error relativo con respecto al valor real
error_relativo = error_absoluto / abs(fahrenheit_real)

# Cálculo del error de precisión con respecto al valor truncado
# Se evalúa si el valor truncado es distinto de cero para evitar errores de división
error_precision = abs(error_absoluto / fahrenheit_truncado) if fahrenheit_truncado != 0 else float('inf')

# Impresión de los resultados
print("Ejercicio 3: Truncamiento en conversión de temperatura")
print(f"Temperatura real: {fahrenheit_real}")
print(f"Temperatura truncada: {fahrenheit_truncado}")
print(f"Error absoluto: {error_absoluto}")
print(f"Error relativo: {error_relativo}")
print(f"Error de precisión: {error_precision}")


# EJERCICIO 4: Truncamiento en velocidad

import math  # Importación del módulo math para realizar truncamientos

# Velocidad medida con precisión completa (en metros por segundo)
velocidad_real = 12.987

# Truncamiento de la velocidad a dos decimales (sin redondeo)
velocidad_truncada = math.trunc(velocidad_real * 100) / 100

# Cálculo del error absoluto entre la velocidad real y la truncada
error_absoluto = abs(velocidad_real - velocidad_truncada)

# Cálculo del error relativo con respecto al valor real
error_relativo = error_absoluto / abs(velocidad_real)

# Cálculo del error de precisión con respecto al valor truncado
# Se evalúa si el valor truncado es distinto de cero para evitar divisiones por cero
error_precision = abs(error_absoluto / velocidad_truncada) if velocidad_truncada != 0 else float('inf')

# Impresión de los resultados del análisis
print("Ejercicio 4: Truncamiento en velocidad")
print(f"Velocidad real: {velocidad_real}")
print(f"Velocidad truncada: {velocidad_truncada}")
print(f"Error absoluto: {error_absoluto}")
print(f"Error relativo: {error_relativo}")
print(f"Error de precisión: {error_precision}")


# EJERCICIO 5: Truncamiento en densidad

import math  # Se importa el módulo math para realizar truncamiento

# Densidad medida con precisión completa en g/cm³
densidad_real = 0.99876

# Truncamiento de la densidad a tres cifras decimales (sin redondeo)
densidad_truncada = math.trunc(densidad_real * 1000) / 1000

# Cálculo del error absoluto como diferencia entre el valor real y truncado
error_absoluto = abs(densidad_real - densidad_truncada)

# Cálculo del error relativo como proporción del error respecto al valor real
error_relativo = error_absoluto / abs(densidad_real)

# Cálculo del error de precisión con respecto al valor truncado
# Se previene la división por cero con una condición
error_precision = abs(error_absoluto / densidad_truncada) if densidad_truncada != 0 else float('inf')

# Impresión de los resultados del análisis
print("Ejercicio 5: Truncamiento en densidad")
print(f"Densidad real: {densidad_real}")
print(f"Densidad truncada: {densidad_truncada}")
print(f"Error absoluto: {error_absoluto}")
print(f"Error relativo: {error_relativo}")
print(f"Error de precisión: {error_precision}")

