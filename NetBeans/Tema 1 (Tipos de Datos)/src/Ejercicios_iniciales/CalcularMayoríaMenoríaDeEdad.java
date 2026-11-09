package Ejercicios_iniciales;

import java.util.Scanner;

public class CalcularMayoríaMenoríaDeEdad { 
    
    public static void main(String[] args) {
        
        /*  Escribe un pseudocódigo para solicitar la edad a un usuario e imprimir un mensaje "eres mayor de edad" si tiene
        más de 17 años o imprimir el mensaje "eres menor de edad" si tiene menos de 18 años. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime su edad: ");
        
        int edad;
        edad = sc.nextInt();
        
        if (edad > 17){
            System.out.println("Eres mayor de edad");
        }
        if (edad <= 17){
            System.out.println("Eres menor de edad");
        }
}
    }
