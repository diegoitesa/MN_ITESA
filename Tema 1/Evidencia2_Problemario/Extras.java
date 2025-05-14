// EJERCICIO 1

public class extras {
    public static void main(String[] args) {
        
        // Definición del capital prestado
        double capital = 15250.789;

        // Definición de la tasa de interés anual como valor decimal
        double tasaAnual = 5.25 / 100;

        // Cálculo del interés mensual sin redondear
        double interesSinRedondeo = (capital * tasaAnual) / 12;

        // Redondeo del interés mensual a dos decimales (equivalente a centavos)
        double interesRedondeado = Math.round(interesSinRedondeo * 100.0) / 100.0;

        // Cálculo del error absoluto entre el valor real y el redondeado
        double errorAbsoluto = Math.abs(interesSinRedondeo - interesRedondeado);

        // Cálculo del error relativo como proporción del error respecto al valor real
        double errorRelativo = errorAbsoluto / Math.abs(interesSinRedondeo);

        // Impresión del resultado sin redondear
        System.out.println("Interés sin redondeo: " + interesSinRedondeo);

        // Impresión del resultado redondeado
        System.out.println("Interés redondeado: " + interesRedondeado);

        // Impresión del error absoluto
        System.out.println("Error absoluto: " + errorAbsoluto);

        // Impresión del error relativo
        System.out.println("Error relativo: " + errorRelativo);
    }
}

// EJERCICIO 2

/* 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Precio original del producto
        double precio = 259.975;

        // Porcentaje de descuento expresado como decimal
        double descuentoPorcentaje = 12.5 / 100;

        // Cálculo del descuento sin redondear
        double descuentoSinRedondeo = precio * descuentoPorcentaje;

        // Redondeo del descuento a dos cifras decimales
        double descuentoRedondeado = Math.round(descuentoSinRedondeo * 100.0) / 100.0;

        // Cálculo del error absoluto entre el descuento real y el redondeado
        double errorAbsoluto = Math.abs(descuentoSinRedondeo - descuentoRedondeado);

        // Cálculo del error relativo como proporción respecto al descuento real
        double errorRelativo = errorAbsoluto / Math.abs(descuentoSinRedondeo);

        // Impresión del descuento sin redondear
        System.out.println("Descuento sin redondeo: " + descuentoSinRedondeo);

        // Impresión del descuento redondeado
        System.out.println("Descuento redondeado: " + descuentoRedondeado);

        // Impresión del error absoluto
        System.out.println("Error absoluto: " + errorAbsoluto);

        // Impresión del error relativo
        System.out.println("Error relativo: " + errorRelativo);
    }
}

// EJERCICIO 3


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Monto en dólares que desea cambiar el turista
        double dolares = 150.875;

        // Tasa de cambio de 1 dólar a euros
        double tasaCambio = 0.9234;

        // Cálculo de la conversión sin redondear
        double eurosSinRedondeo = dolares * tasaCambio;

        // Redondeo del valor en euros a dos cifras decimales
        double eurosRedondeados = Math.round(eurosSinRedondeo * 100.0) / 100.0;

        // Cálculo del error absoluto entre el valor sin redondear y el redondeado
        double errorAbsoluto = Math.abs(eurosSinRedondeo - eurosRedondeados);

        // Cálculo del error relativo como proporción respecto al valor sin redondear
        double errorRelativo = errorAbsoluto / Math.abs(eurosSinRedondeo);

        // Impresión del valor convertido sin redondeo
        System.out.println("Euros sin redondeo: " + eurosSinRedondeo);

        // Impresión del valor convertido con redondeo
        System.out.println("Euros redondeados: " + eurosRedondeados);

        // Impresión del error absoluto
        System.out.println("Error absoluto: " + errorAbsoluto);

        // Impresión del error relativo
        System.out.println("Error relativo: " + errorRelativo);
    }
}
*/