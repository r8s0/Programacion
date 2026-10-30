package Ejercicios_Libro_2;

import java.util.Scanner;

public class CalcularÁreaTriángulo {
    
    public static void main(String[] args) {
            
         /* Escribir una aplicación que solicite por consola dos números reales
            que correspondan a la base y la altura de un triángulo. Deberá mostrarse
            su área, comprobando que los números introducidos por el usuario no son negativos,
            algo que no tendría sentido.*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         double base,altura,area;
         
                
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Introduzca la base del triangulo: ");
         base = sc.nextInt();
         
         System.out.println("Introduzca la altura del triangulo: ");
         altura = sc.nextInt();
         
         area = (base * altura) / 2;
         
         if (base < 0 || altura < 0){
             System.out.println("DATOS INCORRECTOS. La base y la altura del triangulo deben ser positivas.");
         }
         else {
             System.out.println("El area del triangulo es: " + area);
         }
    }
}
