package Ejercicios_Libro_2;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class EcuaciónSegundoGrado {
    
    public static void main(String[] args) {
            
         /* Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. 
         Si no existen. habrá que indicarlo.*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         double discriminante;
         double denominador;
         double solucion1;
         double solucion2;
         double a;
         double b;
         double c;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Dame un valor para la variable a: ");
         a = sc.nextDouble();
         
         System.out.println("Dame un valor para la variable b: ");
         b = sc.nextDouble();
         
         System.out.println("Dame un valor para la variable c: ");
         c = sc.nextDouble();
         
         discriminante = (b * b - 4 * a * c);
         denominador = (2 * a);
         solucion1 = (-b + sqrt(discriminante)) / (denominador);
         solucion2 = (-b - sqrt(discriminante)) / (denominador);
         
         if ((discriminante < 0) || (denominador < 0)){
             System.out.println("No existe solucion real");
         } else {
             System.out.println("Las soluciones son: " + solucion1 + " y " + solucion2);
         }
    }
}