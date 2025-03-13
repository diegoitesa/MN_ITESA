import java.util.Random;
import java.util.Scanner;

/**
 * Clase que implementa el método de eliminación Gaussiana por pivoteo.
 * Este programa permite al usuario introducir el tamaño de una matriz
 * y muestra la matriz original y la matriz transformada después de aplicar
 * el método de Gauss.
 * 
 * Autor: Oscar Aaron Delgadillo Fernandez
 */
public class GaussPivoteOscar {
    
    /**
     * Método principal que ejecuta el programa.
     * Este método solicita al usuario el tamaño de la matriz,
     * llena la matriz con valores aleatorios, muestra la matriz original,
     * aplica el método de eliminación Gaussiana por pivoteo y muestra
     * la matriz resultante.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.println("Programa de solución Gaussiana por pivote");
        System.out.println("Por: Oscar Aaron Delgadillo Fernandez");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz: ");
        
        int x = scanner.nextInt();
        double matriz[][] = new double[x][x]; 

        llenado(matriz);
        System.out.println("Matriz original:");
        mostrar(matriz);

        gaussPivote(matriz);
        System.out.println("Matriz después del gaussPivote:");
        mostrar(matriz);
        
        scanner.close(); // Cerrar el scanner para evitar fugas de recursos
    }

    /**
     * Llena la matriz con valores aleatorios entre 0 y 10.
     * Este método utiliza la clase Random para generar números
     * aleatorios y los asigna a cada elemento de la matriz.
     * 
     * @param m Matriz a llenar con valores aleatorios.
     *          La matriz debe ser de tipo double y tener dimensiones
     *          previamente definidas por el usuario.
     */
    public static void llenado(double[][] m) {
        Random random = new Random();
        int x = m[0].length;
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                m[i][j] = random.nextDouble() * 10; // Asigna un valor aleatorio entre 0 y 10
            }
        }
        System.out.println("Matriz llenada con éxito"); 
    }

    /**
     * Muestra la matriz en la consola formateada a dos decimales.
     * Este método recorre cada elemento de la matriz y lo imprime
     * en la consola, organizando los elementos en filas y columnas.
     * 
     * @param m Matriz a mostrar.
     *          La matriz debe ser de tipo double y puede tener
     *          cualquier dimensión, aunque se espera que sea cuadrada.
     */
    public static void mostrar(double[][] m) {
        int x = m[0].length;
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("[ " + String.format("%.2f", m[i][j]) + "]"); // Formato a dos decimales
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    /**
     * Aplica el método de eliminación Gaussiana por pivoteo a la matriz.
     * Este método transforma la matriz de entrada en su forma escalonada
     * reducida utilizando el método de pivoteo, lo que facilita la resolución
     * de sistemas de ecuaciones lineales.
     * 
     * @param m Matriz sobre la cual se aplicará el método.
     *          La matriz debe ser cuadrada y de tipo double.
     *          Se modifica directamente la matriz original.
     */
    public static void gaussPivote(double[][] m) {
        int n = m.length;
        
        for (int pivote = 0; pivote < n; pivote++) {
            double factor = m[pivote][pivote]; // Elemento pivote
            
            // Normaliza la fila del pivote
            for (int j = 0; j < n; j++)
                m[pivote][j] /= factor;

            // Elimina los elementos por debajo del pivote
            for (int i = pivote + 1; i < n; i++) {
                double coef = m[i][pivote]; // Coeficiente de la fila actual
                for (int j = 0; j < n; j++)
                    m[i][j] -= coef * m[pivote][j]; // Resta la fila del pivote
            }
        }
    }
}
