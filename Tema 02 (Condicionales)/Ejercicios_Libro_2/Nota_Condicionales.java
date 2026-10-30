package Ejercicios_Libro_2;
import java.util.Scanner;

public class Nota_Condicionales {
    
    public static void main(String[] args) {
            
         /* Pedir una nota entera de O a 10 y mostrarla de la siguiente forma: insuficiente (de O a 4).
         suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int nota;
        
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("Introduzca una nota entera del 0 al 10: ");
         nota = sc.nextInt();
   
         if ((nota == 0 ) || (nota == 1) || (nota == 2) || (nota == 3) ||(nota == 4)){
             System.out.println("Insuficiente.");
         }   
         else if (nota == 5){
             System.out.println("Suficiente.");
         }   
         else if (nota == 6){
             System.out.println("Bien.");
         }
         else if ((nota == 7) || (nota == 8)){
             System.out.println("Notable.");
         }   
         else if ((nota == 9) || (nota == 10)){
             System.out.println("Sobresaliente.");
         }   
         else{
             System.out.println("Nota incorrecta.");
         }
    }
}
