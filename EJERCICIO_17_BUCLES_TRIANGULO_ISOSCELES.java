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
public class EJERCICIO_17_BUCLES_TRIANGULO_ISOSCELES {
    
    public static void main(String[] args) {
     
        /* Solicita al usuario un número n y dibuja un triángulo de base y altura
        n, de la forma (para n igual a 4): 
            *
           * *
          * * *
         * * * *         */
            
            Scanner sc = new Scanner(System.in);
        
            int numero, filas, espacios, asteriscos;
        
            // Nos aseguramos que el numero entero es positivo.
            do {
                System.out.println("introduzca un numero entero positivo para dibujar un triangulo isosceles con *: ");
                numero = sc.nextInt();  
            } while (numero <= 0);
            
            // Bucle for para controlar las filas.
            
            for (filas = 1; filas <= numero; filas++){
                
                // Bucle for interno para controlar los espacios.
                for (espacios = (numero - filas); espacios > 0; espacios--) {
                   System.out.print(" ");
                }
               
                // Bucle for interno para controlar los "*".
                for (asteriscos = 1; asteriscos <= filas; asteriscos++){
                   System.out.print("* ");    
                }
                System.out.println("");
            }   
    }   
}    

