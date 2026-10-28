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
public class EJERCICIO_18_BUCLES_NUMEROS_PRIMOS {
    
    public static void main(String[] args) {
     
        /* Escribe un programa que pida al usuario dos números enteros positivos 
        mayores que 2 que representen un rango, y utilice un bucle for para 
        imprimir todos los números primos dentro de ese rango (incluyendo los 
        extremos). Un número es primo si solo es divisible por 1 y por sí mismo.
        Ejemplo: 
                Entrada: 10 y 30
                Salida: Numeros primos en el rango: 11, 13, 17, 19, 23, 29. */
            
                Scanner sc = new Scanner(System.in);
        
                int rangoInicial, rangoFinal;
                boolean esPrimo;
                boolean esPrimero = false;
            
                System.out.println("Introduzca un numero entero positivo por el que empiece el rango: ");
                rangoInicial = sc.nextInt(); 
                    while (rangoInicial < 2){
                        System.out.println("Numero Invalido. Prueba con numeros enteros positivos mayores que 2: ");
                        rangoInicial = sc.nextInt();
                    }
                
                System.out.println("Introduzca un numero entero positivo por el que finalice el rango: ");
                rangoFinal = sc.nextInt(); 
                    while (rangoFinal < 2){
                        System.out.println("Numero Invalido. Prueba con numeros enteros positivos mayores que 2: ");
                        rangoFinal = sc.nextInt();
                    }
                
                System.out.print("Numeros primos en el rango: ");
                
                // Bucle externo para controlar el rango
                for (int numero = rangoInicial; numero <= rangoFinal; numero++){
                    esPrimo = true;
                    
                    // Bucle interno para comprobar si el número es primo
                    for (int divisor = 2; divisor < numero; divisor++){
                        if (numero % divisor == 0) {
                            esPrimo = false;
                        }
                    }
                
                    // Condición para mostrar los numeros primos.
                    if (esPrimo){
                        
                        // Condición para mostrar el primer número primo sin coma delante.
                        if (esPrimero == false){
                           System.out.print(numero);
                           esPrimero = true;
                        }
                        else{
                            System.out.print(", " + numero);
                        }
                        
                    }
                }
                // Imprimir punto al final de los números primos.
                System.out.print(".");
    }   
}
