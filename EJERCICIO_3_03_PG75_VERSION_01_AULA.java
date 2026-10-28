/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EJERCICIO_3_03_PG75_VERSION_01_AULA {
    public static void main(String[] args) {
     /* Escribe un programa en Java que genere un número aleatorio entre 1 y 1000. El usuario debe
     adivinar el número.
     Cada vez que el usuario introduzca un número, el programa le dirá si el número es demasiado bajo,
     demasiado alto o correcto.
     El programa debe continuar hasta que el usuario adivine el número correctamente. */
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     Scanner sc = new Scanner(System.in);
     Random random = new Random();
     int numero_aleatorio, numero;
     numero_aleatorio = random.nextInt(1000) + 1;
     
     System.out.println("Introduce un numero del 1 al 1000:");
     numero = sc.nextInt();
     
     if (numero < 1 || numero > 1000){
         System.out.println("ERROR. Solo se admiten numeros del 1 al 1000.");
     }
     else{
      while (numero != numero_aleatorio){

         if (numero < numero_aleatorio){
             System.out.println("El numero es mayor.");
         }
         else if (numero > numero_aleatorio){
             System.out.println("El numero es menor.");
         }
         System.out.println("introduce otro numero del 1 al 1000.");
         numero = sc.nextInt();
      }
      System.out.println("Has acertado el numero!");
     }
     
    
}
}
