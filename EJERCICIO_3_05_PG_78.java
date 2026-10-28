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
public class EJERCICIO_3_05_PG_78 {
    public static void main(String[] args) {
     /* Desarrollar un juego que ayude a mejorar el cálculo mental de la Suma. EI jugador tendrá
     que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y
     100. Mientras la solución introducida sea correcta. el juego continuará. En caso contra•
     rio, el programa terminará y mostrará el número de operaciones realizadas correctamente. */
         
     Scanner sc = new Scanner(System.in);
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     int numero1, numero2, suma, resultado, operacionesCorrectas;
     
     
     numero1 = (int) (Math.random() * 100) + 1;
     numero2 = (int) (Math.random() * 100) + 1;
     suma = numero1 + numero2;
     operacionesCorrectas = 0;
     
     
     System.out.println("Introduzca el resultado de " + numero1 + "+" + numero2 + ":");
     resultado = sc.nextInt();
   
     
     do {
         operacionesCorrectas ++;
    
         numero1 = (int) (Math.random() * 100) + 1;
         numero2 = (int) (Math.random() * 100) + 1;
         suma = numero1 + numero2;
         
         System.out.println("Introduzca el resultado de " + numero1 + "+" + numero2 + ":");
         resultado = sc.nextInt();
     } while (resultado == suma);
     
     
     if (suma != resultado) {
         System.out.println("Has fallado. El resultado era " + suma + ".");
         System.out.println("Numero de operaciones realizadas correctamente: " + operacionesCorrectas);
     }
    }
}
