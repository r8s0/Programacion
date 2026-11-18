package HojaExcepciones;
import java.util.Scanner;

public class E3_ExcepcionDivisionCero_V1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Declaración de variables
        int numerador, denominador, resultado = 0;
        boolean valido = false;
        // Bucle para validar la división
        while (!valido){
            
            System.out.println("Introduce el numerador: ");
            numerador = sc.nextInt();
            System.out.println("Introduce el denominador: ");
            denominador = sc.nextInt();
            
            try{
                resultado = numerador / denominador; // Puede causar ArithmeticException
                valido = true; // Si no surge la excepción, se valida la división y se sale del bucle para imprimir el resultado
            } catch (ArithmeticException e){
                System.out.println("No se puede dividir entre cero."); // Mensaje de error que se muestra si hay una excepcion
            }
            System.out.println("");
            
        }
        System.out.println("El resultado de la division es: " + resultado);
        
    }
}
