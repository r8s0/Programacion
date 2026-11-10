package hojaEjercicios_Funciones;
import java.util.Scanner;

public class E09_FunciónCalculadora {
    
    public static double calculadora(float num1, float num2, int opcion){
        
        double resultado;
        
        switch (opcion){
            case 1 -> {
                resultado = num1 + num2;
            }
            case 2 -> {
                resultado = num1 - num2;
            } 
            case 3 -> {
                resultado = num1 * num2;
            }
            default -> {
                resultado = num1 / num2;
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("");
        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("");
        System.out.println("***********Menu de operaciones***********");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        System.out.println("*****************************************");
        System.out.println("");
        System.out.println("Introduce la operacion deseada: ");
        int opcion = sc.nextInt();
        System.out.println("");
        
        calculadora(num1, num2, opcion);
        System.out.print("El resultado es: ");
        System.out.println(calculadora(num1, num2, opcion));
    }
}