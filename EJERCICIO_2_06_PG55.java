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
public class EJERCICIO_2_06_PG55 {
    public static void main(String[] args) {
/* Solicitar dos números distintos y mostrar cuál es el mayor. Realizar de nuevo la Actividad resuelta 2.3 considerando el caso de que los números in-
troducidos sean iguales.*/

Scanner sc = new Scanner(System.in);

//** DECLARACIÓN DE VARIABLES Y CONSTANTES**//
int num1, num2;

System.out.println("Dame un numero: ");
num1 = sc.nextInt();

System.out.println("Dame otro numero: ");
num2 = sc.nextInt();

if (num1 == num2){
    System.out.println("El numero " + num1 + " y el numero " + num2 + " son iguales");
} else{
    if (num1 > num2){
        System.out.println("El numero " + num1 + " es mayor que " + num2);
    }    else{
        System.out.println("El numero " + num2 + " es mayor que " + num1);
        } 
}
}
}

