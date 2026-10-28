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
public class EJERCICIO_03_CUENTA_ATRAS {
    public static void main(String[] args) {
     /* Escribe un programa en java que pida al usuario un número entero positivo y luego imprima una cuenta atrás
     desde ese número hasta 0, uno por uno. Después de llegar a 0, el programa debe imprimir "¡Despegue!". Usa
     un bucle while o do-while según lo que prefieras. Pista: El bucle while debería detenerse cuando el contador
     llega a 0. */
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Introduce un numero entero positivo: ");
     int numero = sc.nextInt();
     
     if (numero > 0) {
         while (numero >= 0){
         System.out.println(numero);
         numero--;
        }
         System.out.println("¡Despegue!");
     }
     else {
         System.out.println("Solo se admiten numeros positivos.");
     }
}
}


//OTRA OPCIÓN MEJOR

// Bucle de validación de numero positivo
/* do {
       System.out.println("Introduce un numero entero positivo: ");
       numero= sc.nextInt()
   } while (numero < 0)
*/

// Procesamiento del numero positivo validado
/* if (numero > 0) {
    while (numero >= 0){
     System.out.println(numero);
     numero--;
    }
     System.out.println("¡Despegue!");
   }
   else {
     System.out.println("Solo se admiten numeros positivos.");
*/