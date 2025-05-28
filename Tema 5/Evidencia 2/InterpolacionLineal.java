// Clase que implementa la interpolación lineal
public class InterpolacionLineal { 
    // Método estático para interpolar un valor y dado dos puntos (x0, y0) y (x1, y1)
    public static double interpolar(double x0, double y0, double x1, double y1, double x) { 
        // Calcula la pendiente (m) de la línea que conecta los dos puntos
        double m = (y1 - y0) / (x1 - x0); 
        // Devuelve el valor interpolado usando la fórmula de la recta
        return y0 + m * (x - x0); 
    } 
} 

// Clase principal que contiene el método main
class Main { 
    // Método principal que se ejecuta al iniciar el programa
    public static void main(String[] args) { 
        // Llama al método de interpolación con los puntos (2, 4) y (6, 10), y el valor x = 3
        double resultado = InterpolacionLineal.interpolar(2, 4, 6, 10, 3); 
        // Imprime el resultado en la consola
        System.out.println("Valor interpolado: " + resultado); 
    } 
}
