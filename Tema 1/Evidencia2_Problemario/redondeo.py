# EJERCICIO 1

# Definición del capital inicial en moneda
capital = 10000.257 

# Definición de la tasa de interés anual como un decimal
tasa_anual = 3.75 / 100 

# Cálculo del interés mensual sin redondeo
interes_sin_redondeo = (capital * tasa_anual) / 12

# Redondeo del interés mensual a dos decimales
interes_redondeado = round(interes_sin_redondeo, 2) 

# Cálculo del error absoluto entre el interés sin redondeo y el interés redondeado
error_absoluto = abs(interes_sin_redondeo - interes_redondeado) 

# Cálculo del error relativo como la proporción del error absoluto respecto al interés sin redondeo
error_relativo = error_absoluto / abs(interes_sin_redondeo) 

# Impresión del interés mensual sin redondeo
print(f"Interés sin redondeo: {interes_sin_redondeo}") 

# Impresión del interés mensual redondeado
print(f"Interés redondeado: {interes_redondeado}") 

# Impresión del error absoluto calculado
print(f"Error absoluto: {error_absoluto}") 

# Impresión del error relativo calculado
print(f"Error relativo: {error_relativo}")



#EJERCICIO 2

# Definición de la temperatura en grados Celsius
C = 36.123

# Cálculo de la temperatura exacta en grados Fahrenheit utilizando la fórmula de conversión
F_exacto = (9/5) * C + 32

# Redondeo de la temperatura en Fahrenheit a un decimal
F_redondeado = round(F_exacto, 1)

# Cálculo del error absoluto entre la temperatura exacta y la temperatura redondeada
error_absoluto = abs(F_exacto - F_redondeado)

# Cálculo del error relativo como la proporción del error absoluto respecto a la temperatura exacta
error_relativo = error_absoluto / abs(F_exacto)

# Impresión del encabezado para la conversión de temperatura
print("Conversión de °C a °F")

# Impresión de la temperatura exacta en Fahrenheit
print(f"Temperatura exacta: {F_exacto}")

# Impresión de la temperatura redondeada en Fahrenheit
print(f"Temperatura redondeada: {F_redondeado}")

# Impresión del error absoluto calculado
print(f"Error absoluto: {error_absoluto}")

# Impresión del error relativo calculado
print(f"Error relativo: {error_relativo}")



#EJERCICIO 3

# Definición del precio exacto de un artículo
precio_exacto = 5.6789

# Redondeo del precio exacto a dos decimales
precio_redondeado = round(precio_exacto, 2)

# Cálculo del error absoluto entre el precio exacto y el precio redondeado
error_absoluto = abs(precio_exacto - precio_redondeado)

# Cálculo del error relativo como la proporción del error absoluto respecto al precio exacto
error_relativo = error_absoluto / abs(precio_exacto)

# Impresión del encabezado para el precio del artículo
print("Precio de un artículo")

# Impresión del precio exacto
print(f"Precio exacto: {precio_exacto}")

# Impresión del precio redondeado
print(f"Precio redondeado: {precio_redondeado}")

# Impresión del error absoluto calculado
print(f"Error absoluto: {error_absoluto}")

# Impresión del error relativo calculado
print(f"Error relativo: {error_relativo}")



#EJERCICIO 4

# Definición de la distancia exacta en unidades de medida
distancia_exacta = 123.4567

# Redondeo de la distancia exacta a un decimal
distancia_redondeada = round(distancia_exacta, 1)

# Cálculo del error absoluto entre la distancia exacta y la distancia redondeada
error_absoluto = abs(distancia_exacta - distancia_redondeada)

# Cálculo del error relativo como la proporción del error absoluto respecto a la distancia exacta
error_relativo = error_absoluto / abs(distancia_exacta)

# Impresión del encabezado para la medición de distancia
print("Medición de distancia")

# Impresión de la distancia exacta
print(f"Distancia exacta: {distancia_exacta}")

# Impresión de la distancia redondeada
print(f"Distancia redondeada: {distancia_redondeada}")

# Impresión del error absoluto calculado
print(f"Error absoluto: {error_absoluto}")

# Impresión del error relativo calculado
print(f"Error relativo: {error_relativo}")



#EJERCICIO 5

# Definición de la cantidad de euros a convertir
euros = 50.987

# Definición del tipo de cambio de euros a dólares
tipo_cambio = 1.12

# Cálculo de la cantidad exacta de dólares resultante de la conversión
dolares_exactos = euros * tipo_cambio

# Redondeo de la cantidad de dólares a dos decimales
dolares_redondeados = round(dolares_exactos, 2)

# Cálculo del error absoluto entre los dólares exactos y los dólares redondeados
error_absoluto = abs(dolares_exactos - dolares_redondeados)

# Cálculo del error relativo como la proporción del error absoluto respecto a la cantidad exacta de dólares
error_relativo = error_absoluto / abs(dolares_exactos)

# Impresión del encabezado para la conversión de moneda
print("Conversión de moneda (Euros a Dólares)")

# Impresión de la cantidad exacta de dólares
print(f"Dólares exactos: {dolares_exactos}")

# Impresión de la cantidad redondeada de dólares
print(f"Dólares redondeados: {dolares_redondeados}")

# Impresión del error absoluto calculado
print(f"Error absoluto: {error_absoluto}")

# Impresión del error relativo calculado
print(f"Error relativo: {error_relativo}")