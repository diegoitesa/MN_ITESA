
import java.util.Random;
import java.util.Scanner;


public class gaus_pivote_brandon{
    

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
            

        System.out.println("Programa Gaus Pivote");
        System.out.println("Introduce el tamaño de la matriz");

        int tamano = dato.nextInt();


        double [][] matriz = new double[tamano][tamano+1]; 

       
        llenar(matriz);

        System.out.println("Matriz inicial");
        mostrar(matriz);


    }

    public static void llenar (double[][] matriz) 
    {
            Random random = new Random();

            int tamano = matriz.length;

            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    matriz[i][j]=random.nextInt(10);
                }
            }
    }

    public static void mostrar(double[][] matriz)
    {
      
        int tamano = matriz.length;
        for (int i = 0; i < tamano; i++) {
                for (int j = 0; j < tamano; j++) {
                    System.out.print("[ " + String.format("%.2f", matriz[i][j]) + "] ");

                }
            System.out.println("");
            }

    }

    public static void gaussPivote(double[][] matriz) {
        int n = matriz.length;

        for (int pivote = 0; pivote < n; pivote++) {
            
            pivote(matriz, pivote);

            double factor = matriz[pivote][pivote];

           
            for (int j = 0; j < n + 1; j++) {
                matriz[pivote][j] /= factor;
            }

           
            for (int i = pivote + 1; i < n; i++) {
                double coef = matriz[i][pivote];
                for (int j = 0; j < n + 1; j++) {
                    matriz[i][j] -= coef * matriz[pivote][j];
                }
            }
        }
    }

    
}

