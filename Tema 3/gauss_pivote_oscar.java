import java.util.Random;
import java.util.Scanner;

public class gauss_pivote_oscar {
    public static void main(String[] args) {
        System.out.println("Programa de solución Gaussiana por pivote");
        System.out.println("Por: Oscar Aaron Delgadillo Fernandez");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz: ");
        int x = scanner.nextInt();
        double matriz[][] = new double[x][x]; 
        llenado(matriz);
        mostrar(matriz);
    }

    public static void llenado (double[][] m) {
        Random random = new Random();
        int x = m[0].length;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++) {
                m[i][j] = random.nextDouble() * 10;
            }
        }
        System.out.println("Matriz llenada con exito"); 
    }

    public static void mostrar (double[][] m) {
        int x = m[0].length;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++) {
                System.out.print("[ " + String.format("%.2f", m[i][j]) + "]");
            }
            System.out.println();
        }
    }
}
