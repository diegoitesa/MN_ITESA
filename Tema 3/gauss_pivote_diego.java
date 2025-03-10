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
        double pivote = m[pivP][pivP];

        while ( pivP != m[0].length)
        {
            pivote = m[pivP][pivP];
            
            // convertimos el pivote en 1
            for (int i = 0; i < m[0].length; i++)
                m[pivP][i] /= pivote;
            
            

            for (int i = pivP; i <= m[0].length; i++){
                pivote = m[pivP][pivP] /= pivote;
                for (int j = pivP + 1; j <= m[0].length; j++)
                    m[j][i] += (-m[j][i]) * pivote;
            }
                
            
            pivP++;
        }
            
    }


}