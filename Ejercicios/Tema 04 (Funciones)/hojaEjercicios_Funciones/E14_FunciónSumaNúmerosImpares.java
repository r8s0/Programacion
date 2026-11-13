package hojaEjercicios_Funciones;

import java.util.Scanner;

public class E14_FunciónSumaNúmerosImpares {
    
    /**
     * Función sumaImpares
     * @param numero
     * @return suma
     */
    public static int sumaImpares(int numero){
        
        int x, suma;
        suma = 0;
             
        for (x = 1; x <= numero; x++){  // Bucle for para sumar los impares.
            if (x % 2 != 0){
                suma += x; // Así se suma el valor actual de x.
            } 
            x ++;  // Incrementamos x.
        }
        return suma; 
    }
        
    /**
     * Función principal
     * @param args 
     */
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo: ");
        int numero = sc.nextInt(); 
        
        while (numero <= 0){
            System.out.println("Numero invalido. El numero tiene que ser entero y positivo.");
            System.out.println("Introduce un numero entero positivo: ");
            numero = sc.nextInt();
        }
        System.out.println("La suma de los impares desde 1 hasta " + numero + " es: " + sumaImpares(numero));
    }
}
