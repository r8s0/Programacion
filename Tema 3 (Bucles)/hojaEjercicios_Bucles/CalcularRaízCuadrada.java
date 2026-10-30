package hojaEjercicios_Bucles;

import java.util.Scanner;

public class CalcularRaízCuadrada {
    
    public static void main(String[] args) {
     
        /* Calcular la raíz cuadrada de un número natural mediante aproximaciones. 
        En el caso de que no sea exacta, muestra el resto. Por ejemplo, para 
        calcular la raiz cuadrada de 23, probamos 1^2 = 1, 2^2 = 4, 3^2 = 9, 
        4^2 = 16, 5^2 = 25 (nos pasamos), resultando 4 la raíz cuadrada de 23 
        con un resto (23 - 16) de 7. */
            
                Scanner sc = new Scanner(System.in);
        
                int numero, cuadrado, raíz, resto;
                
                //Bucle para asegurarnos de que el numero es mayor que 0.
                do {
                    System.out.println("Introduzca un numero natural positivo: ");
                    numero = sc.nextInt();
                    
                    if (numero <= 0){
                        System.out.println("Numero invalido. Prueba de nuevo: ");
                    }
                } while (numero <= 0);
                
                raíz = 1;
                
                // Bucle while que verifica que el cuadrado de un numero no se pase.
                while ((raíz + 1) * (raíz + 1) <= numero){
                    raíz++;
                }
                cuadrado = raíz * raíz;
                resto = (numero - cuadrado);
                
                System.out.println("La raiz cuadrada de " + numero + " es: " + raíz);
                
                if (resto > 0){        
                    System.out.println("Resto: " + resto);
                }
                
    }    
}
