
package pruebas;

import java.util.Scanner;

public class CalcularPotencias_Funciones {
    
    /* ************************** potencia ************************** */
    /* Esta función calcula la potencia de base elevado a exponente*/
    /* ************************************************************** */
    
    static int potencia(int base, int exponente){
            
        int resultado = 1;
        
        for (int x = 1; x <= exponente; x++){
        resultado *= base; // Es lo mismo que poner resultado = resultado * base.
        }
        return resultado;
        
    }
    
    public static void main(String[] args) {
        
        /* Escribe un programa que pida al usuario base y exponente y calcula la potencia. Nota: no se puede usar
        ninguna función de java. */
     
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
        potencia(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es " + potencia(base, exponente));

    } 
}
