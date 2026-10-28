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
public class ACTIVIDAD_RESUELTA_2_13_PG65 {
         public static void main(String[] args) {
            
         /* Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
         EI programa debe mostrar qué hora será un segundo más tarde.*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int horas,minutos,segundos;
                
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Introduzca las horas: ");
         horas = sc.nextInt();
         
         System.out.println("Introduzca los minutos: ");
         minutos = sc.nextInt();
         
         System.out.println("Introduzca los segundos: ");
         segundos = sc.nextInt();
         
         segundos++;
         if (segundos > 59) {
             segundos = 00;
             minutos++;
         }
         if (minutos > 59){
             minutos =00;
             horas++;
         }
         if (horas == 24) {
             horas = 00;
         }
         
         if (horas > 24 || minutos > 60 || segundos > 60){
             System.out.println("La hora es INCORRECTA");
         }
         if (horas>=0 && horas <24 && minutos >= 0 && minutos <=59 && segundos >= 0 && segundos <=59 )
             System.out.println("La hora +1 segundo es: " + horas + ":" + minutos + ":" + segundos);
         
    }
}
