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
public class EJERCICIO_3_01_PG74 {
        public static void main(String[] args) {
     /* Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si
      es positivo y su cuadrado. EI proceso se repetirá hasta que el número introducido sea O. */
         
     Scanner sc = new Scanner(System.in);
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     int numero, cuadrado;
     
     System.out.println("Introduzca un numero: ");
     numero = sc.nextInt();
     
     while (numero > 0){
         
         if (numero % 2 == 0) {
             System.out.println("Es par");
         }
         else {
             System.out.println("Es impar");
         }
         
         
         if (numero > 0){
             System.out.println("Es positivo");
         }
         else {
             System.out.println("Es negativo");
         }
         
         
         cuadrado = numero * numero;
         System.out.println("Su cuadrado es: " + cuadrado);
         
         System.out.println("Introduzca otro numero: ");
         numero = sc.nextInt();
     }
     System.out.println("ERROR. NUMERO <= 0. FINALIZANDO PROGRAMA");
    }
}
