package Ejercicios_iniciales;
import java.util.Scanner;

public class CalcularMayoríaDeEdad {
    
    public static void main(String[] args) {
        
        /*  Escribe un pseudocódigo para solicitar la edad a un usuario e imprimir un mensaje "eres mayor de edad" si tiene
        más de 17 años */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime su edad: ");
        
        int edad;
        edad = sc.nextInt();
        
        if (edad > 17){
            System.out.println("Eres mayor de edad");
        }
}
    }
