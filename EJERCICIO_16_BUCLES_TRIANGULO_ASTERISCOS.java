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
public class EJERCICIO_16_BUCLES_TRIANGULO_ASTERISCOS {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        /* Pedir por consola un numero n y dibujar un triángulo rectángulo
        de n elementos de lado, utilizando para ello asteriscos (*). Por
        ejemplo, para n = 4:
        ****
        ***
        **
        *                                */
            
        int numero, filas, asterisco;
        
            // Nos aseguramos que el numero entero es positivo.
            do {
                System.out.println("Introduzca un numero entero positivo para dibujar un triangulo rectangulo con *: ");
                numero = sc.nextInt();
            } while (numero < 0);
        
            // Bucle for externo para controlar las filas.
            for (filas = numero; filas > 0; filas--){
                // Bucle for interno dependiente para imprimir los *.
                for (asterisco = filas; asterisco > 0; asterisco--){
                    if (asterisco > 1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.println("*");
                    }
                }
            }   
    }     
}
