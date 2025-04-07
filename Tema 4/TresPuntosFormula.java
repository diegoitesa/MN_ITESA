public class TresPuntosFormula {

    // f(x)
    public static double f(double x) {
        return x * x;
    }

    public static double formulaTresPuntos(double a, double b) {
        double h = (b - a) / 2.0;
        double x0 = a;
        double x1 = (a + b) / 2.0;
        double x2 = b;

        double result = h * ((1.0 / 3.0) * f(x0) + (4.0 / 3.0) * f(x1) + (1.0 / 3.0) * f(x2));
        return result;
    }

    
}