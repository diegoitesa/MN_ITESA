class gauss_jordan_diego {
    public static void main(String[] args) {
        double[][] matriz = {{2, 4, 4, 5}, {6, 6, 9, 8}, {8, 10, 12, 3}};

        imprimirMatriz(matriz);
        gaussJ(matriz);
        System.out.println("\n");
        imprimirMatriz(matriz);
    }

    public static void gaussJ(double[][] m) {
        int rlon = m.length;
        int clon = m[0].length;
        int pivotP = 0;

        while (pivotP < rlon) {
            if (m[pivotP][pivotP] == 0) {
                intercambiarFilas(m, pivotP, rlon);
            }

            if (m[pivotP][pivotP] != 0) {
                getPivot(m, clon, pivotP);
                getZeros(m, clon, rlon, pivotP);
            }

            pivotP++;
        }
    }

    private static void getPivot(double[][] m, int clon, int pivotP) {
        double pivot = m[pivotP][pivotP];
        for (int i = 0; i < clon; i++) {
            m[pivotP][i] /= pivot;
        }
    }

    private static void getZeros(double[][] m, int clon, int rlon, int pivotP) {
        for (int i = 0; i < rlon; i++) {
            if (i == pivotP) continue;
            double factor = m[i][pivotP];
            for (int j = 0; j < clon; j++) {
                m[i][j] -= factor * m[pivotP][j];
            }
        }
    }

    private static void intercambiarFilas(double[][] m, int pivotP, int rlon) {
        for (int r = pivotP + 1; r < rlon; r++) {
            if (m[r][pivotP] != 0) {
                double[] temp = m[pivotP];
                m[pivotP] = m[r];
                m[r] = temp;
                break;
            }
        }
    }

    public static void imprimirMatriz(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("[" + m[i][j] + "] ");
            }
            System.out.println();
        }
    }
}
