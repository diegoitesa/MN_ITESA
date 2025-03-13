import java.util.Scanner;

/*
*   Programador: Diego Alonso Coronel Vargas
*   
*   Fecha: 13/03/2025
*   
*   Descripción: El programa aplica el algoritmo de Gauss-Jordan  
*   a una matriz que es generada automáticamente dependiendo del   
*   tamaño que introduzca el usuario.
*
*/

public class GaussJordanDiego
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.err.print("Tamanio de matriz: ");
        int x = read.nextInt();
        double[][] matriz = new double[x][x];

        llenarMatriz(matriz, x);
        imprimirMatriz(matriz);
        gaussJordan(matriz);
        System.err.println("");
        imprimirMatriz(matriz);
    }

    private static void llenarMatriz(double[][] m, int lon)
    {   
        Random random = new Random();

        for (int i = 0; i < lon; i++)
            for (int j = 0; j < lon; j++)
                m[i][j] = random.nextDouble(20);
    }

    private static void imprimirMatriz(double[][] m)
    {
        int x = m[0].length;
        for (int i = 0; i < x; i++){
            System.err.println("");
            for (int j = 0; j < x; j++)
                System.out.printf("[%2.1f] ", m[i][j]);
        }
                 
    }

    private static void gaussJordan(double[][] m)
    {
        // inicializar la matriz en la primer esquina
        int pivP = 0;

        // Ciclo para cubrir todos los pivotes de la matriz
        while ( pivP < m[0].length)
        {
            // convertimos el pivote en 1
            for (int i = 0; i < m[0].length; i++){
                m[pivP][i] /= m[pivP][pivP];
            }  
            
            // convertimos las filas que están sobre y debajo del pivote en 0
            for (int i = 0; i < m[0].length; i++){
                
                // Saltamos la fila donde se encuentra el pivote para no afectarla
                if (i == pivP)
                    continue;

                for (int j = 0; j < m[0].length; j++)
                    m[i][j] += (-m[i][j]) * m[pivP][j];
            }
                
            pivP++;
        }
    }
}

