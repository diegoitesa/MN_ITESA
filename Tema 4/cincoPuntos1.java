public class cincoPuntos1 {
    static double f(double x) {
        return x*x + 3*x + 4;
    }

    public static void main(String[] args) {
        double a = 0, b = 2;
        double h = (b - a) / 4.0;
        double[] x = new double[5];
        for (int i = 0; i < 5; i++) {
            x[i] = a + i * h;
        }
        double integral = (2 * h / 45.0) * (
            7 * f(x[0]) + 32 * f(x[1]) + 12 * f(x[2]) + 32 * f(x[3]) + 7 * f(x[4])
        );
        System.out.printf("Resultado aproximado: %.4f\n", integral);
    }
}
