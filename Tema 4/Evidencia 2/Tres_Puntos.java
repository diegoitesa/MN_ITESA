import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

public class Tres_Puntos { // Clase principal que contiene el método main

    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        // Solicitar los coeficientes de la función cuadrática: ax^2 + bx + c
        System.out.println("Ingrese el coeficiente a (para ax^2):"); 
        double coefA = scanner.nextDouble(); // Lee el coeficiente a

        System.out.println("Ingrese el coeficiente b (para bx):"); 
        double coefB = scanner.nextDouble(); // Lee el coeficiente b

        System.out.println("Ingrese el coeficiente c:"); 
        double coefC = scanner.nextDouble(); // Lee el coeficiente c

        // Solicitar el punto donde se quiere calcular la derivada
        System.out.println("Ingrese el punto x en donde desea calcular la derivada:"); 
        double x = scanner.nextDouble(); // Lee el valor de x

        // Solicitar el valor de h
        System.out.println("Ingrese el valor de h (por ejemplo, 0.001):"); 
        double h = scanner.nextDouble(); // Lee el valor de h

        // Verificar que h sea mayor que 0
        if (h <= 0) { 
            System.out.println("El valor de h debe ser mayor que 0."); // Mensaje de error
            return; // Termina el programa si h no es válido
        }

        // Aplicación del método de 3 puntos para calcular la derivada
        double fxMenos = evaluarFuncion(coefA, coefB, coefC, x - h); // Evalúa la función en x - h
        double fxMas = evaluarFuncion(coefA, coefB, coefC, x + h); // Evalúa la función en x + h

        // Calcula la derivada usando la aproximación de 3 puntos
        double derivada = (fxMas - fxMenos) / (2 * h); 

        // Imprime el resultado de la derivada aproximada
        System.out.printf("La aproximación de la derivada es: %.6f\n", derivada); 
    }

    // Método que evalúa la función cuadrática ax^2 + bx + c en un punto x
    private static double evaluarFuncion(double a, double b, double c, double x) { 
        // Calcula y devuelve el valor de la función cuadrática
        return a * x * x + b * x + c; 
    }
}
