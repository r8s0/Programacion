package hojaEjercicios_Bucles;

import java.util.Scanner;

public class SumaNumerosImparesAvanzado_While {
    public static void main(String[] args) {
        
     /* Versión avanzada: el programa debe continuar pidiendo números hasta que el usuario
     introduzca un número negativo, momento en el cual debe finalizar. Pista: Usa un bucle while
     para sumar los números impares y otro para seguir solicitando más números al usuario (bucles
     anidados). */
         
        int numero, x, suma;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo: ");
        numero = sc.nextInt();
        
            
        if (numero <= 0) {
            System.out.println("Numero invalido. El numero tiene que ser entero y positivo.");
        }
        else{
            while (numero > 0){  // El número dado es positivo.
              suma = 0;  // Reinicia la suma a 0 para cada nuevo número.
              x = 1; // Variable de control para el bucle.
      
                while (x <= numero){  // Bucle while anidado para sumar los impares.
                    if (x % 2 != 0){
                      suma += x; // Así se suma el valor actual de x.
                    } 
                    x ++;  // Incrementamos x.
                }
               System.out.println("La suma de los impares desde 1 hasta " + numero + " es: " + suma);  // Muestra el resultado.
              
              // Solicita el siguiente número al final del bucle
              System.out.println("Introduce otro numero entero positivo: "); 
              numero = sc.nextInt();
            }
            System.out.println("Programa finalizado. Saliendo.");  // Si se introduce un numero >= 0 después de entrar en el bucle el programa finaliza.
        }
    }
   
}        