import java.util.Random;
import java.util.Scanner;

public class gauss_pivote
{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.err.print("Tamanio de matriz: ");
        int x = read.nextInt();
        double[][] matriz = new double[x][x];

        llenarMatriz(matriz, x);
        imprimirMatriz(matriz);
        gaussPivote(matriz);
        imprimirMatriz(matriz);
    }

    //impersion, llenado, solución

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
                System.out.printf("[%2.3f] ", m[i][j]);
        }
                 
    }

    public static void gaussPivote(double[][] m)
    {
        // inicializar la matriz en la primer esquina
        int pivP = 0;

        while ( pivP < m[0].length)
        {
            // convertimos el pivote en 1
            for (int i = 0; i < m[0].length; i++)
                m[pivP][i] /= m[pivP][pivP];
            
            // convertimos las filas debajo del pivote en 0
            for (int i = pivP + 1; i < m[0].length; i++){
                for (int j = 0; j < m[0].length; j++)
                    m[i][j] += (-m[j][i]) * m[pivP][j];
            }
                
            pivP++;
        }
            
    }


}