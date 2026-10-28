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
public class ACTIVIDAD_PROPUESTA_3_1_PG73 {
    public static void main(String[] args) {
     /* Diseña una aplicación que muestre la edad máxima y mínima de un grupo de alumnos. EI
        usuario introducirá las edades y terminará escribiendo un —1. */
         
     Scanner sc = new Scanner(System.in);
     
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     int edad, edadMax, edadMin;
     
     System.out.println("Introduzca una edad: ");
     edad = sc.nextInt();
     
     edadMax = edad;
     edadMin = edad;
     
     while (edad != -1){
         if (edad < 0){  // La edad no puede ser negativa.
             System.out.println("Edad incorrecta. La edad tiene que ser > 0.");
         }
         if (edadMin > edad && edad > 0){  // Solo se almacena en edadMin si la edad es > 0.
             edadMin = edad;
         }
         if (edadMax < edad && edad > 0){  // Solo se almacena en edadMax si la edad es > 0.
             edadMax = edad;
         }
         System.out.println("Introduzca otra edad: ");
         edad = sc.nextInt();
     }
     System.out.println("La edad maxima es: " + edadMax);
     System.out.println("La edad minima es: " + edadMin);
}
}
