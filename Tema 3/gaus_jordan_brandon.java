class EliminacionGaussJordan {
    public static void main(String[] args) {
        double[][] sistema = {{2, 4, 4, 5}, {6, 6, 9, 8}, {8, 10, 12, 3}};

        mostrarMatriz(sistema);
        aplicarGaussJordan(sistema);
        System.out.println("\nMatriz reducida:");
        mostrarMatriz(sistema);
    }

    public static void aplicarGaussJordan(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int pivoteFila = 0;

        while (pivoteFila < filas) {
            if (matriz[pivoteFila][pivoteFila] == 0) {
                cambiarFilas(matriz, pivoteFila, filas);
            }

            if (matriz[pivoteFila][pivoteFila] != 0) {
                normalizarPivote(matriz, columnas, pivoteFila);
                eliminarElementos(matriz, columnas, filas, pivoteFila);
            }

            pivoteFila++;
        }
    }

    private static void normalizarPivote(double[][] matriz, int columnas, int pivoteFila) {
        double valorPivote = matriz[pivoteFila][pivoteFila];
        for (int i = 0; i < columnas; i++) {
            matriz[pivoteFila][i] /= valorPivote;
        }
    }

    private static void eliminarElementos(double[][] matriz, int columnas, int filas, int pivoteFila) {
        for (int i = 0; i < filas; i++) {
            if (i == pivoteFila) continue;
            double factor = matriz[i][pivoteFila];
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] -= factor * matriz[pivoteFila][j];
            }
        }
    }

    private static void cambiarFilas(double[][] matriz, int pivoteFila, int filas) {
        for (int r = pivoteFila + 1; r < filas; r++) {
            if (matriz[r][pivoteFila] != 0) {
                double[] aux = matriz[pivoteFila];
                matriz[pivoteFila] = matriz[r];
                matriz[r] = aux;
                break;
            }
        }
    }

    public static void mostrarMatriz(double[][] matriz) {
        for (double[] fila : matriz) {
            for (double valor : fila) {
                System.out.print("[" + valor + "] ");
            }
            System.out.println();
        }
    }
}