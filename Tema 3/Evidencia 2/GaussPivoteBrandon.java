
import java.util.Random;
import java.util.Scanner;


public class GaussPivoteBrandon{
    

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
            

        System.out.println("Programa Gaus Pivote");
        System.out.println("Introduce el tamaño de la matriz");

        int tamano = dato.nextInt();


        double [][] matriz = new double[tamano][tamano+1]; 

       
        llenar(matriz);

        System.out.println("Matriz inicial");
        mostrar(matriz);

        gaussPivote(matriz);

        System.out.println("Matriz después de aplicar el Métoto de Gauss Pivote: ");
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
public static void pivote(double[][] matriz, int columna) {
        int n = matriz.length;
        int filaMax = columna;

        
        for (int i = columna + 1; i < n; i++) {
            if (Math.abs(matriz[i][columna]) > Math.abs(matriz[filaMax][columna])) {
                filaMax = i;
            }
        }

        
        if (filaMax != columna) {
            for (int j = 0; j < n + 1; j++) {
                double temp = matriz[columna][j];
                matriz[columna][j] = matriz[filaMax][j];
                matriz[filaMax][j] = temp;
            }
        }
    }


    
}

