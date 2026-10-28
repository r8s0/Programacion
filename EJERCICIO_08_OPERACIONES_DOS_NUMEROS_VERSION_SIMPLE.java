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
public class EJERCICIO_08_OPERACIONES_DOS_NUMEROS_VERSION_SIMPLE {
    public static void main(String[] args) {
     /* Mostrar en pantalla el siguiente menú de opciones. Solicitar al usuario dos números y también que escoja una
     de las opciones. Finalizar si la opción no es una de las indicadas, en otro caso, mostrar el resultado de la
     operación escogida.
     1. Sumar.
     2. Restar.
     3. Multiplicar. */
         
     Scanner sc = new Scanner(System.in);
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     int opcion, numero1, numero2;
     
     
     System.out.println("Introduzca una opcion del 1 al 3: ");
     System.out.println("1) Sumar dos numeros ");
     System.out.println("2) Restar dos numeros ");
     System.out.println("3) Multiplicar dos numeros ");
     opcion = sc.nextInt();
     
        if (opcion >= 1 && opcion <=3){
          System.out.println("Introduzca un numero: ");
          numero1 = sc.nextInt();
          System.out.println("Introduzca otro numero: ");
          numero2 = sc.nextInt();
         
          switch (opcion) {
             case 1 ->
                 System.out.println("El resultado es: " + (numero1 + numero2));
             case 2 ->
                 System.out.println("El resultado es: " + (numero1 - numero2));
             default ->
                 System.out.println("El resultado es: " + (numero1 * numero2));
          }
        }
        else {
            System.out.println("ERROR. Opcion no valida. Saliendo de la aplicacion");
        }   
    }    
}
