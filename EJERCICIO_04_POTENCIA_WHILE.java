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
public class EJERCICIO_04_POTENCIA_WHILE {
    public static void main(String[] args) {
     /* Escribe un programa que pida al usuario base y exponente y calcula la potencia. Nota: no se puede usar
     ninguna función de java. */
     
     Scanner sc = new Scanner(System.in);
     
    int x, exponente, base, potencia;
     
     
     // Pedimos la base
     System.out.println("Introduce una base: ");
     base = sc.nextInt();
     
     // Pedimos y validamos exponente positivo
     do {
        System.out.println("Introduce un exponente positivo: ");
        exponente = sc.nextInt();
         
     }while (exponente < 0);
     
     // Calculamos la potencia
     potencia = 1;
     x = 1; // Empieza en 1 y termina cuando llegue a exponente
     
     while (x <= exponente) {
         potencia *= base;
         x++;
     }
     System.out.println("El resultado es: " + potencia);

}
}
