public class GaussJordan {
    public static void main(String[] args) {
        System.out.println("Programita para resolver los Gauss - Jordan");
        System.out.println("Programado por: Oscar Aaron Delgadillo Fernandez");

        double[][] matriz = {
            {1, 2, 3, 10},
            {4, 5, 6, 15},
            {7, 8, 9, 21}
        };

        resolverGaussJordan(matriz);
    }

    public static void resolverGaussJordan(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {

            if (matriz[i][i] == 0) {
                System.out.println("La matriz es singular y no tiene solución única.");
                return;
            }

            double pivote = matriz[i][i];
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] /= pivote;
            }
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = 0; j < matriz[k].length; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                }
            }
        }

        System.out.println("\nMatriz reducida:");
        imprimirMatriz(matriz);

        System.out.println("\nSolución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.2f%n", i + 1, matriz[i][n]);
        }
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.printf("%.2f\t", valor);
            }
            System.out.println();
        }
    }
}
