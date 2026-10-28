/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
    
/**
 *
 * @author Alumno
 */
public class EJERCICIO_3_03_PG75_VERSION_MIA {
    public static void main(String[] args) {
     /* Codificar el juego •el número secreto•, que consiste en acertar un número entre 1 y 100
     (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para
     los que se indica: •mayor• o •menor•, según sea mayor o menor con respecto al núme-
     ro secreto. EI proceso termina cuando eI usuario acierta 0 cuando se rinde (introducien-
     do un —1). */
         
     Scanner sc = new Scanner(System.in);
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     int numero_secreto, numero;
     System.out.println("Introduzca un numero del 1 al 100: ");
     numero = sc.nextInt();
     
     
     numero_secreto = (int) (Math.random() * 100) + 1;
     
     
     while (numero != numero_secreto && numero != -1){
         if (numero_secreto > numero){
             System.out.println("El numero secreto es mayor.");
         }
         else {
         System.out.println("El numero secreto es menor.");
         }
         System.out.println("Introduzca otro numero: ");
         numero = sc.nextInt();
     }
     
     
     if (numero == numero_secreto){
         System.out.println("Has acertado el numero. Enhorabuena!");
     }
     if (numero == -1){
         System.out.println("Te has rendido. El numero secreto era: " + numero_secreto);
     }
}
}
