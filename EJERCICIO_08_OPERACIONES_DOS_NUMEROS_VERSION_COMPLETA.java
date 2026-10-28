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
public class EJERCICIO_08_OPERACIONES_DOS_NUMEROS_VERSION_COMPLETA {
    public static void main(String[] args) {
     /* Modificar el programa para que aparezca en el menú la opción “Salir” del siguiente modo:
         1 - Sumar.
         2 - Restar.
         3 - Multiplicar.
         4 - Salir
     El programa seguirá ejecutándose (preguntando la opción y dos nuevos números) hasta que el usuario
     elija la opción Salir. */
         
     Scanner sc = new Scanner(System.in);
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     int opcion, numero1, numero2;
     
     do{
     System.out.println("Introduzca una opcion del 1 al 4: ");
     System.out.println("1) Sumar dos numeros ");
     System.out.println("2) Restar dos numeros ");
     System.out.println("3) Multiplicar dos numeros ");
     System.out.println("4) Salir ");
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
        
        else if (opcion != 4){
            System.out.println("ERROR. Opcion no valida. Elija un numero del 1 al 4.");
        }
        
     } while (opcion != 4);
     
     System.out.println("Saliendo de la aplicacion.");     
    }
}
