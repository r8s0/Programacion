package hojaEjercicios_Bucles;
import java.util.Scanner;

public class SumaNumerosImparesSimple_While {
    public static void main(String[] args) {
        
     /* Escribe un programa en Java que pida al usuario un número entero positivo y luego calcule la suma de
      todos los números impares desde 1 hasta ese número (incluyendo el propio número si es impar) */
         
        int numero, x, suma;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo: ");
        numero = sc.nextInt();
       
        
        if (numero > 0){
             suma = 0;
             x = 1; // De esta forma la suma empieza en el primer número impar.
             while (x <= numero){  // Bucle para sumar los números impares.
                 suma += x;  // Así se suma el valor actual de x.  ES IGUAL A PONER LO SIGUIENTE: suma = suma + x
                 x += 2;  // Sumamos 2 a x para sumar solo los impares.
             }
             System.out.println("La suma de los impares desde 1 hasta " + numero + " es: " + suma);  // Muestra el resultado.
        }
        else {
            System.out.println("Numero invalido. El numero tiene que ser entero y positivo.");  // Muestra el error si el numero es negativo.
        }
    }
}        

/*         OTRA FORMA DE RESOLVERLO DE FORMA MAS FACIL

        if (numero > 0){
             suma = 0;
             x = 1; // De esta forma la suma empieza en el primer número impar.
             while (x <= numero){  // Bucle para sumar los números impares.
                 if (x % 2 != 0){
                  suma += x; // Así se suma el valor actual de x.
                 }
                 x ++;  // Incrementamos x.
             }
             System.out.println("La suma de los impares desde 1 hasta " + numero + " es: " + suma);  // Muestra el resultado.
        }
        else {
            System.out.println("Numero invalido. El numero tiene que ser entero y positivo.");  // Muestra el error si el numero es negativo.
        } 

*/