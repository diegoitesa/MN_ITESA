public class TrapecioSimple{
    public static double f(double x) {
        return 2 * x + 3;
    }

    public static double trapecioSimple(double a, double b) {
        return (b - a) / 2.0 * (f(a) + f(b));
    }

    public static void main(String[] args) {
        double a = 0, b = 1;
        double integral = trapecioSimple(a, b);
        System.out.printf("Ejercicio 1 - Resultado aproximado: %.6f\n", integral);
    }
}
