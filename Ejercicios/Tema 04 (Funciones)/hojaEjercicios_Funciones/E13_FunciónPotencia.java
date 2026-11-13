
package hojaEjercicios_Funciones;

import java.util.Scanner;

public class E13_FunciónPotencia {
    
    public static int exponencial(int base, int exponente){
        int potencia;
        int x;
        
        for (potencia = 1, x = 1; x <= exponente; x++){
            potencia *= base;
        }
        return potencia;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
     
        int exponente, base;
     
     
        // Pedimos la base
        System.out.println("Introduce una base: ");
        base = sc.nextInt();
     
        // Pedimos y validamos exponente positivo
        do {
            System.out.println("Introduce un exponente positivo: ");
            exponente = sc.nextInt();
        }while (exponente < 0);
     
        // Calculamos la potencia
        System.out.println("La potencia de " + base + " elevado a " + exponente + " es: " + exponencial(base, exponente));
    }
}