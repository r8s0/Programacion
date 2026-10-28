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
public class EJERCICIO_3_03_PG75_VERSION_02_AULA {
    public static void main(String[] args) {
     /* Escribe un programa en Java que genere un número aleatorio entre 1 y 1000. El usuario debe
     adivinar el número.
     Cada vez que el usuario introduzca un número, el programa le dirá si el número es demasiado bajo,
     demasiado alto o correcto.
     El programa debe continuar hasta que el usuario adivine el número correctamente. 
     El usuario dispondrá de 6 intentos para adivinar el número. */
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     final int MAX_NUM = 1000;
     final int MAX_INTENTOS = 6;
     
     Scanner sc = new Scanner(System.in);
     Random random = new Random();
     
     int numeroAleatorio = random.nextInt(1000) + 1;
     int intentos = 0;
     boolean acertado = false;
     
     while (intentos < MAX_INTENTOS){
           System.out.println("Introduce un numero del 1 al " + MAX_NUM +". Dispones de " + MAX_INTENTOS);
       int numero = sc.nextInt();
       
       if (numero < 1 || numero > MAX_NUM){
           System.out.println("ERROR. Solo se admiten numeros del 1 al " + MAX_NUM + ".");
       }
       else {
           intentos++;
           if (numero < numeroAleatorio){
               System.out.println("El numero es mayor.");
           }
           else if (numero > numeroAleatorio){
               System.out.println("El numero es menor.");
           }
           else {
               acertado = true;
           }
       }    
     }
     if (acertado){
         System.out.println("Has acertado el numero en " + intentos + "intentos.");
     }
     else {
         System.out.println("No tienes mas intentos. El numero era " + numeroAleatorio);
     }
}
}