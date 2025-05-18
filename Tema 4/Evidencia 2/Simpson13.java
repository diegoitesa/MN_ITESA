public class Simpson13{

    public static double f(double x) {
        return x * x + 1;
    }

    public static double simpson13(double a, double b) {
        double h = (b - a) / 2.0;
        double x0 = a;
        double x1 = a + h;
        double x2 = b;

        double result = (h / 3.0) * (f(x0) + 4 * f(x1) + f(x2));
        return result;
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 2;

        double integral = simpson13(a, b);
        System.out.printf("Resultado aproximado: %.6f\n", integral);
    }
}