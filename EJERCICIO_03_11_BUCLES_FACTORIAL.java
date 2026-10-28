/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EJERCICIO_03_11_BUCLES_FACTORIAL {
    
    public static void main(String[] args) {
     
        /* Pedir un número y calcular su factorial. Por ejemplo, el factorial de 
        5 se denota 5! y es igual a 5 x 4 x 3 x 2 x 1 = 120. */
            
                Scanner sc = new Scanner(System.in);
        
                int numero;
                long factorial;
                
                
                
                //Bucle para asegurarnos de que el numero esté comprendido entre 0 y 20.
                do {
                    System.out.println("Introduzca un numero entre 0 y 20 para calcular su factorial: ");
                    numero = sc.nextInt();
                    
                    if (numero < 0 || numero > 20){
                        System.out.println("Numero invalido. Prueba de nuevo: ");
                    }
                } while (numero < 0 || numero > 20);
                
                /* Asigno 1 porque va a multiplicar, y si el usuario me introduce 0, 
                cuyo factorial vale 1, se imprimiría este valor. */
                factorial = 1;
                
                // Bucle for para calcular el factorial
                for (int i = numero; i > 0; i--){
                    factorial *= i; // Es lo mismo que factorial = factorial * i
                }
                System.out.println("Factorial de " + numero + " es " + factorial);
    }    
}
