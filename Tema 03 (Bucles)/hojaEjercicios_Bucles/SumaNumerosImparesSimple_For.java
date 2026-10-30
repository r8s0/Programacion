package hojaEjercicios_Bucles;

import java.util.Scanner;

public class SumaNumerosImparesSimple_For {
        public static void main(String[] args) {
        
     /* Escribe un programa en Java que pida al usuario un número entero positivo y luego calcule la suma de
      todos los números impares desde 1 hasta ese número (incluyendo el propio número si es impar) */
         
        int numero, x, suma;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo: ");
        numero = sc.nextInt();
        
        suma = 0;
        
        for (x = 1; x <= numero; x++){
            suma += x;
            x ++;
            System.out.println("La suma de los impares desde 1 hasta " + numero + " es: " + suma);
        }
        if (numero < 0){
            System.out.println("Numero invalido. El numero tiene que ser entero y positivo.");  // Muestra el error si el numero es negativo.
        } 
    }
}