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
public class EJERCICIO_01_CREADO_IA_BUCLES {
    public static void main(String[] args) {
     /* Escribe un programa que pida al usuario números enteros de forma repetida 
        hasta que introduzca el número 0 (el 0 solo sirve para terminar y no cuenta como dato). 
        Al finalizar, el programa debe mostrar:
      -Cuántos números se han introducido
      -La suma de todos ellos
      -La media
      -El número mayor y el número menor
        Si el usuario introduce el 0 como primer número, debe mostrarse un mensaje indicando que no se ha introducido ningún dato. */
         
     Scanner sc = new Scanner(System.in);
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     int numero, numeroMayor, numeroMenor, numerosIntroducidos, sumaNumeros;
     double media;
     
     numerosIntroducidos = 0;
     sumaNumeros = 0;
     
     System.out.println("Introduzca un numero entero: ");
     numero = sc.nextInt();
     numeroMayor = numero;
     numeroMenor = numero;
     
     while (numero != 0){
         numerosIntroducidos++;
         sumaNumeros += numero;
         if (numero > numeroMayor){
             numeroMayor = numero;
         }
         if (numero < numeroMenor){
             numeroMenor = numero;
         }
         System.out.println("Introduzca otro numero entero: ");
         numero = sc.nextInt();
     }
     if (numero == 0){
         System.out.println("ERROR. No se ha introducido ningun dato.");
     }
     else {
     media = (double) sumaNumeros / numerosIntroducidos;
     System.out.println("Se han introducido " + numerosIntroducidos + " numeros.");
     System.out.println("La suma de los numeros es: " + sumaNumeros);
     System.out.println("La media de los numeros es: " + media);
     System.out.println("El numero mayor es: " + numeroMayor);
     System.out.println("El numero menor es: " + numeroMenor);
     }
    }
}
