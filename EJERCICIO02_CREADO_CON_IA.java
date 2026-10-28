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
public class EJERCICIO02_CREADO_CON_IA {
    public static void main(String[] args) {
     /* Pide al usuario que introduzca por consola la temperatura actual en grados Celsius. El programa debe catalogar el clima según las siguientes condiciones:
        • Si es menor o igual a 10: "Hace mucho frío ❄️"
        • Si está entre 11 y 20 (inclusive): "El clima está templado 🌤️"
        • Si está entre 21 y 30 (inclusive): "Hace buen día o calorcito ☀️"
        • Si es mayor de 30: "¡Hace demasiado calor! 🔥" */
         
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     double temperatura;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Introduzca la temperatura: ");
     temperatura = sc.nextDouble();
     
     if (temperatura > 30){
         System.out.println("Hace demasiado calor!");
     }
     else if (temperatura >= 21){
         System.out.println("Hace buen dia o calorcito");
     }
     else if (temperatura >= 11){
         System.out.println("El clima esta templado");
     }
     else {
         System.out.println("Hace mucho frio!");
     }
    }
}
