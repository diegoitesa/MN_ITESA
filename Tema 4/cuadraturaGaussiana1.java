public class cuadraturaGaussiana1 {
    public static void main(String[] args) {
        double a = 0, b = 1;
        double[] x = {-1/Math.sqrt(3), 1/Math.sqrt(3)};
        double[] w = {1, 1};
        double integral = 0;
        for (int i = 0; i < 2; i++) {
            double xi = ((b - a) / 2) * x[i] + (a + b) / 2;
            double fx = xi*xi + 2*xi + 1;
            integral += w[i] * fx;
        }
        integral *= (b - a) / 2;
        System.out.printf("Resultado aproximado: %.4f\n", integral);
    }
}
