public class TrapecioCompuesto {
    public static double f(double x) {
        return x * x + 2;
    }

    public static double trapecioCompuesto(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            sum += 2 * f(xi);
        }

        return (h / 2.0) * sum;
    }

    public static void main(String[] args) {
        double a = 0, b = 2;
        int n = 4;
        double integral = trapecioCompuesto(a, b, n);
        System.out.printf("Ejercicio 1 - Resultado aproximado: %.4f\n", integral);
    }
}
