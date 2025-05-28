import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas
import java.util.List; // Importa la interfaz List para manejar listas

public class AdamsBashforthConRK4 {

    // Definición de la función f(t, y) = y^3
    public static double f(double t, double y) {
        return y * y * y; // Retorna el cubo de y
    }

    public static void main(String[] args) {
        double t0 = 0.0;      // Valor inicial de t
        double y0 = 1.0;      // Valor inicial de y
        double h = 0.05;       // Tamaño del paso para la integración
        int n = 20;           // Número total de pasos a calcular

        // Listas para almacenar los valores de t y y
        List<Double> tVals = new ArrayList<>();
        List<Double> yVals = new ArrayList<>();

        // Inicializar con las condiciones iniciales
        tVals.add(t0); // Agrega el valor inicial de t
        yVals.add(y0); // Agrega el valor inicial de y

        // Usar el método de Runge-Kutta de orden 4 para obtener los primeros 3 puntos
        for (int i = 0; i < 3; i++) {
            double t = tVals.get(tVals.size() - 1); // Obtiene el último valor de t
            double y = yVals.get(yVals.size() - 1); // Obtiene el último valor de y

            // Cálculo de los coeficientes k1, k2, k3 y k4 del método de Runge-Kutta
            double k1 = f(t, y);
            double k2 = f(t + h / 2.0, y + h * k1 / 2.0);
            double k3 = f(t + h / 2.0, y + h * k2 / 2.0);
            double k4 = f(t + h, y + h * k3);

            // Calcula el siguiente valor de y usando la fórmula de Runge-Kutta
            double yNext = y + (h / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4);
            double tNext = t + h; // Calcula el siguiente valor de t

            // Agrega los nuevos valores a las listas
            tVals.add(tNext);
            yVals.add(yNext);
        }

        // Aplicar el método de Adams-Bashforth de 4 pasos
        for (int i = 3; i < n; i++) {
            double tNext = tVals.get(i) + h; // Calcula el siguiente valor de t

            // Calcula el siguiente valor de y usando la fórmula de Adams-Bashforth
            double yNext = yVals.get(i) + (h / 24.0) * (
                55 * f(tVals.get(i), yVals.get(i)) -
                59 * f(tVals.get(i - 1), yVals.get(i - 1)) +
                37 * f(tVals.get(i - 2), yVals.get(i - 2)) -
                9 * f(tVals.get(i - 3), yVals.get(i - 3))
            );

            // Agrega los nuevos valores a las listas
            tVals.add(tNext);
            yVals.add(yNext);
        }

        // Mostrar resultados numéricos de la aproximación
        System.out.println("Resultados del método Adams-Bashforth de 4 pasos para dy/dt = y^3, y(0) = 1:");
        for (int i = 0; i < tVals.size(); i++) {
            System.out.printf("t = %.2f, y = %.6f\n", tVals.get(i), yVals.get(i));
        }

        // Mostrar comparación con la solución exacta: y = 1 / sqrt(1 - 2t)
        System.out.println("\nComparación con la solución exacta y(t) = 1 / sqrt(1 - 2t):");

        for (int i = 0; i < tVals.size(); i++) {
            double t = tVals.get(i); // Obtiene el valor de t
            double yAprox = yVals.get(i); // Obtiene el valor aproximado de y
            double yExacta; // Variable para almacenar el valor exacto de y

            // Verifica la singularidad en t = 0.5
            if (t >= 0.5) {
                yExacta = Double.POSITIVE_INFINITY; // Singularidad en t = 0.5
            } else {
                yExacta = 1 / Math.sqrt(1 - 2 * t); // Calcula el valor exacto
            }

            // Imprime los resultados comparativos
            System.out.printf("t = %.2f, y_aprox = %.6f, y_exacta = %.6f\n", t, yAprox, yExacta);
        }
    }
}
