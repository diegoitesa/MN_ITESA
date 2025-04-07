public class TresPuntosFormula {

    // f(x)
    public static double f(double x) {
        return x * x;
        if (x == 0) throw new ArithmeticException("División por cero en f(x)");
    }

    public static double formulaTresPuntos(double a, double b) {
        double h = (b - a) / 2.0;
        double x0 = a;
        double x1 = (a + b) / 2.0;
        double x2 = b;

        double result = h * ((1.0 / 3.0) * f(x0) + (4.0 / 3.0) * f(x1) + (1.0 / 3.0) * f(x2));
        return result;
    }

    public static void main(String[] args) {
        double a = 0;  // Límite inferior
        double b = 2;  // Límite superior

        double integral = formulaTresPuntos(a, b);
        System.out.printf("Resultado aproximado: %.4f%n", integral);
    }
}