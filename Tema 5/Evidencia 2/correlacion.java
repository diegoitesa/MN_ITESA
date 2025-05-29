import java.util.Scanner; // Importa la clase Scanner para leer datos del usuario

// Clase principal llamada 'correlacion'
public class correlacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        int n; // Número de datos a ingresar
        double xi, yi; // Variables temporales para los valores X y Y
        // Variables para almacenar sumas necesarias para los cálculos
        double sumaX = 0, sumaY = 0, sumaXY = 0, sumaX2 = 0, sumaY2 = 0;
        // Variables para la pendiente, el intercepto y el coeficiente de correlación
        double coefPendiente, coefIntercepto, r;

        // Solicita al usuario el número de datos que desea ingresar
        System.out.print("Ingrese el número de datos: ");
        n = scanner.nextInt();

        // Arreglos para almacenar los valores de X y Y
        double[] datosX = new double[n];
        double[] datosY = new double[n];

        // Bucle para leer los valores de X y Y, y calcular las sumas necesarias
        for (int i = 0; i < n; i++) {
            System.out.println("Dato " + (i + 1));
            System.out.print("Ingrese X[" + (i + 1) + "]: ");
            xi = scanner.nextDouble();
            System.out.print("Ingrese Y[" + (i + 1) + "]: ");
            yi = scanner.nextDouble();

            // Guarda los valores en los arreglos
            datosX[i] = xi;
            datosY[i] = yi;

            // Actualiza las sumas necesarias para los cálculos
            sumaX += xi;
            sumaY += yi;
            sumaXY += xi * yi;
            sumaX2 += xi * xi;
            sumaY2 += yi * yi;
        }

        // Cálculo de la pendiente de la recta de regresión
        coefPendiente = (n * sumaXY - sumaX * sumaY) / (n * sumaX2 - sumaX * sumaX);
        // Cálculo del intercepto (ordenada al origen) de la recta de regresión
        coefIntercepto = (sumaY - coefPendiente * sumaX) / n;
        // Cálculo del coeficiente de correlación 'r'
        r = (n * sumaXY - sumaX * sumaY) /
            Math.sqrt((n * sumaX2 - sumaX * sumaX) * (n * sumaY2 - sumaY * sumaY));

        // Imprime la ecuación de la recta y el coeficiente de correlación
        System.out.println("-----------------------------------------");
        System.out.printf("Ecuación de regresión: Y = %.2f + %.2f * X%n", coefIntercepto, coefPendiente);
        System.out.printf("Coeficiente de correlación r = %.2f%n", r);

        // Interpreta el valor de 'r'
        System.out.println("Interpretación:");
        if (r > 0) {
            System.out.println("Relación positiva."); // Cuando r > 0, la relación entre X y Y es directa
        } else if (r < 0) {
            System.out.println("Relación negativa."); // Cuando r < 0, la relación entre X y Y es inversa
        } else {
            System.out.println("No hay correlación."); // Cuando r = 0, no hay relación lineal entre X y Y
        }

        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}