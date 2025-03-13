import java.util.Scanner;
import java.util.Random;

/**
 * Aplicación que implementa el algoritmo de eliminación de Gauss-Jordan.
 * La matriz se genera automáticamente con valores aleatorios en función del tamaño ingresado por el usuario.
 * 
 * @author Diego Alonso Coronel Vargas
 * @version 4.0
 * @since 2025-03-13
 */

public class GaussJordanDiego
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        System.err.print("Tamaño de la matriz: ");
        int size = read.nextInt();

        double[][] matrix = new double[size][size];

        llenarMatriz(matrix, size);
        System.out.println("Matriz original:");
        imprimirMatriz(matrix);

        gaussJordan(matrix);

        System.out.println("\nMatriz después de aplicar Gauss Jordan:");
        imprimirMatriz(matrix);
    }

    /**
     * Llena una matriz con valores aleatorios entre 0 y 20.
     * 
     * @param matrix Matriz a llenar.
     * @param size Tamaño de la matriz (size x size).
     */
    private static void llenarMatriz(double[][] matrix, int size)
    {   
        Random random = new Random();

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = random.nextDouble(20);
    }

    /**
     * Imprime una matriz en formato legible.
     * 
     * @param matrix Matriz a imprimir.
     */
    private static void imprimirMatriz(double[][] matrix)
    {
        int size = matrix[0].length;

        for (int i = 0; i < size; i++){
            System.err.println();
            for (int j = 0; j < size; j++)
                System.out.printf("[%5.2f] ", matrix[i][j]);
        }
        System.out.println();
                 
    }

    /**
     * Aplica el método de eliminación de Gauss-Jordan a la matriz.
     * 
     * @param matrix Matriz a transformar en su forma escalonada reducida.
     */
    private static void gaussJordan(double[][] matrix)
    {
        int size = matrix.length;

        for (int pivotRow = 0; pivotRow < size; pivotRow++) {
            double pivot = matrix[pivotRow][pivotRow];

            // Normalizar la fila del pivote (convertir pivote en 1)
            for (int j = 0; j < size; j++) {
                matrix[pivotRow][j] /= pivot;
            }

            // Convertir en ceros las demás filas en la columna del pivote
            for (int i = 0; i < size; i++) {
                if (i == pivotRow) {
                    continue; // Saltar la fila del pivote
                }

                double factor = matrix[i][pivotRow]; // Factor de eliminación
                for (int j = 0; j < size; j++) {
                    matrix[i][j] -= factor * matrix[pivotRow][j];
                }
            }
        }
    }
}

