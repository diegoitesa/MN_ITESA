public class Simpson38 {

    // f(x):
    public static double f(double x) {
        return Math.cos(x);
    }

    public static double simpson38(double a, double b) {
        double h = (b - a) / 3.0;
        double x0 = a;
        double x1 = a + h;
        double x2 = a + 2 * h;
        double x3 = b;

        double result = (3 * h / 8.0) * (f(x0) + 3 * f(x1) + 3 * f(x2) + f(x3));
        return result;
    }

    public static void main(String[] args) {
        double a = 0;  // Límite inferior
        double b = 2;  // Límite superior

        if ((b - a) % 3 != 0) {
            System.out.println("Error: El intervalo no es divisible en 3 subintervalos.");
        } else {
            double integral = simpson38(a, b);
            System.out.printf("Resultado aproximado: %.4f%n", integral);
        }
    }
}