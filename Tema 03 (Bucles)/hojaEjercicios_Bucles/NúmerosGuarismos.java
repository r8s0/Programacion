
package hojaEjercicios_Bucles;

import java.util.Scanner;

public class NúmerosGuarismos {
    public static void main(String[] args) {
     /* Implementa un programa que pida al usuario un número positivo y lo 
        muestre guarismo a guarismo. Por ejemplo, para el número 123, debe 
        mostrar primero el 3, a continuación el 2 y por último el 1.*/
     
        Scanner sc = new Scanner(System.in);  
     
        int numero, digito;
     
        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();  
     
     
        while (numero <= 0) {
           System.out.println("Numero invalido. Solo positivos enteros mayores que cero. Dame otro numero: ");
           numero = sc.nextInt();
        }
        
        if (numero > 0){
            while (numero > 0){
                  digito = numero % 10;
                  System.out.print(digito);
                  numero = numero / 10;
                  if (numero > 0){
                      System.out.print(",");
                  }
            }
            System.out.println("");
            System.out.println("Proceso terminado. Finalizando programa.");
        }
    }
}
