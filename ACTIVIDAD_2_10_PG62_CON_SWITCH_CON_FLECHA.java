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
public class ACTIVIDAD_2_10_PG62_CON_SWITCH_CON_FLECHA {
        public static void main(String[] args) {
            
         /* Pedir una nota entera de O a 10 y mostrarla de la siguiente forma: insuficiente (de O a 4).
         suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int nota;
        
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("Introduzca una nota entera del 0 al 10: ");
         nota = sc.nextInt();
   
         switch (nota) {
             case 0, 1, 2, 3, 4 -> {
              System.out.println("Insuficiente.");
         }   
             case 5 -> {
              System.out.println("Suficiente.");
              break;
         }   
             case 6 -> {
              System.out.println("Bien.");
              break;
         }   
             case 7,8 -> {
              System.out.println("Notable.");
              break;
         }   
             case 9,10 -> {
              System.out.println("Sobresaliente.");
              break;
         }
             default ->
              System.out.println("Nota incorrecta.");
         }   
         }
}
