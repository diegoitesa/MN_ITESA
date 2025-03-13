import java.util.Scanner;

public class GaussJordanDiego
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.err.print("Tamanio de matriz: ");
        int x = read.nextInt();
        double[][] matriz = new double[x][x];
    }

    private static void llenarMatriz(double[][] m, int lon)
    {   
        Random random = new Random();

        for (int i = 0; i < lon; i++)
            for (int j = 0; j < lon; j++)
                m[i][j] = random.nextDouble(20);
    }
}

