public class cuadraturaGaussiana2 {
    public static void main(String[] args) {
        double a = -1, b = 2;
        double[] x = {-1/Math.sqrt(3), 1/Math.sqrt(3)};
        double[] w = {1, 1};
        double integral = 0;
        for (int i = 0; i < 2; i++) {
            double xi = ((b - a) / 2) * x[i] + (a + b) / 2;
            double fx = 3*Math.pow(xi,3) - 2*Math.pow(xi,2) + xi + 5;
            integral += w[i] * fx;
        }
        integral *= (b - a) / 2;
        System.out.printf("Resultado aproximado: %.4f\n", integral);
    }
}
