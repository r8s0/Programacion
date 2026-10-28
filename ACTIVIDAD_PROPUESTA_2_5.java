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
public class ACTIVIDAD_PROPUESTA_2_5 {
        public static void main(String[] args) {
            
         /* Escribir un programa que calcule el dinero recaudado en un concierto.
            La aplicación solicitará el aforo máximo del local, el precio por 
            entrada (suponemos que todas las entradas tienen el mismo precio) y el
            número de entradas vendidas. Hay que tener en cuenta que si el número 
            de entradas vendidas no supera el 20% del aforo del local, se cancela
            el concierto. Si el número de entradas vendidas no supera el 50% del
            aforo del local, se realiza una rebaja del 25% del precio de la entrada.*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int aforo_maximo;
         int numero_entradas;
         double PRECIO_ENTRADA;
         double recaudacion_rebajada;
         double recaudacion_normal;
        
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("Introduzca el aforo maximo del local: ");
         aforo_maximo = sc.nextInt();
         
         System.out.println("Introduzca el precio por entrada: ");
         PRECIO_ENTRADA = sc.nextDouble();
         
         System.out.println("Introduzca el numero de entradas vendidas: ");
         numero_entradas = sc.nextInt();
         
         recaudacion_normal = (PRECIO_ENTRADA * numero_entradas);
         recaudacion_rebajada = (recaudacion_normal * 0.75);
        
         if (numero_entradas < (0.2 * aforo_maximo)){
             System.out.println("Se cancela el concierto.");
         }   else if (numero_entradas < (0.5 * aforo_maximo)){
             System.out.println("Se realizara una rebaja del 25% del precio de cada entrada.");
             System.out.println("Se han recaudado " + recaudacion_rebajada + " euros.");
         }   else if (numero_entradas > 0.5 * aforo_maximo){
             System.out.println("Se han recaudado " + recaudacion_normal + " euros.");
                }
        }
}
