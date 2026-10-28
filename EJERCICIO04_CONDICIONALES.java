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
public class EJERCICIO04_CONDICIONALES {
        public static void main(String[] args) {
            
         /* Crear un programa en java que compruebe la temperatura del aula, dividiendo esta en
         un total de 4 zonas: MUCHO FRIO (<12), FRIO (<22), CALOR (<32), MUCHO CALOR
         (>=32). */
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         double temperatura;
        
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Introduzca la temperatura del aula: ");
         temperatura = sc.nextDouble();
        
         if (temperatura >= 32) 
            System.out.println("MUCHO CALOR");
         else if (temperatura >= 22)
            System.out.println("CALOR");
         else if (temperatura >= 12)
            System.out.println("FRIO");
         else
            System.out.println("MUCHO FRIO");
    }
}
