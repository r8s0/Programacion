package Ejercicios_Libro_2;

import java.util.Scanner;

public class Nota_SwitchAntiguo {
    
    public static void main(String[] args) {
            
         /* Pedir una nota entera de O a 10 y mostrarla de la siguiente forma: insuficiente (de O a 4).
         suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int nota;
        
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("Introduzca una nota entera del 0 al 10: ");
         nota = sc.nextInt();
   
         switch (nota) {
             case 0, 1, 2, 3, 4: {
              System.out.println("Insuficiente.");
              break;
             }   
             case 5: {
              System.out.println("Suficiente.");
              break;
             }   
             case 6: {
              System.out.println("Bien.");
              break;
             }   
             case 7,8: {
              System.out.println("Notable.");
              break;
             }   
             case 9,10: {
              System.out.println("Sobresaliente.");
              break;
             }
             default:
              System.out.println("Nota incorrecta.");
         }   
    }
}
