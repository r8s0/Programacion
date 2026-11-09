package hojaEjercicios;
import java.util.Scanner;

public class CalidadSalarios {
    
        public static void main(String[] args) {
            
         /* Escribir un programa que muestre en pantalla los siguientes mensajes dependiendo del valor del
         salario de una persona. Para ello establecemos cuatro tramos (utilizar if-else anidados):
         ● “MUY MALO” <1000
         ● “MALO” >=1000
         ● “BUENO” >=1500
         ● “MUY BUENO” >=3000 */
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         double salario;
        
         Scanner sc = new Scanner(System.in);
        
         System.out.println("Introduzca su salario: ");
         salario = sc.nextDouble();
         
         if (salario >= 3000) 
            System.out.println("MUY BUENO");
         else if (salario >= 1500)
            System.out.println("BUENO");
         else if (salario >= 1000)
            System.out.println("MALO");
         else if (salario < 1000)
            System.out.println("MUY MALO");
    }
}
