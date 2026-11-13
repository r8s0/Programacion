package hojaEjercicios_Funciones;

public class E08_FunciónSobrecargadaSuma {
    
    /** 
     * Función "suma" V1.
     * @param num1 el primer número entero que suma
     * @param num2 el segundo número entero que suma
     * @return num1 + num2
     */
    public static int suma(int num1, int num2){
        return num1 + num2;
    }
    
    /** 
     * Función "suma" V2.
     * @param num1 el primer número real que suma
     * @param num2 el segundo número real que suma
     * @return num1 + num2
     */
    public static double suma(double num1, double num2){
        return num1 + num2;
    }
    
    /** 
     * Función "suma" V3.
     * @param num3 el primer número real que suma
     * @param num4 el segundo número real que suma
     * @param num5 el tercer número real que suma
     * @return num3 + num4 + num5
     */
    public static double suma(double num3, double num4, double num5){
        return num3 + num4 + num5;
    }
        
    // Función principal.
    public static void main(String[] args) {
        
        int num1 = 2;
        int num2 = 10;
        double num3 = 4.7;
        double num4 = 5.3;
        double num5 = 9.5;
        
        // Llamada a la función "suma" V1.
        suma(num1, num2);
        System.out.println("La suma de los dos numeros enteros es: " + suma(num1, num2));
        
        // Llamada a la función "suma" V2.
        suma(num3, num4);
        System.out.println("La suma de los dos numeros reales es: " + suma(num3, num4));
        
        // Llamada a la función "suma" V3.
        suma(num3, num4, num5);
        System.out.println("La suma de los tres numeros reales es: " + suma(num3, num4, num5));
        
    }
}