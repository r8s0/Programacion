package hojaEjercicios_Funciones;

import java.util.Scanner;

public class FunciónRango_DosNúmerosEnteros {
    
    /* ************************** muestraRango ************************** */
    /* Esta función calcula los números en el rango establecido.          */
    /*  ENTRADA -> 2 números int
        SALIDA -> Nada
        PROCESO: Mostrar números en el rango                              */
    /* ****************************************************************** */
    
    public static void muestraRango(int minimo, int maximo){
        for (int numero = minimo; numero <= maximo; numero++){
        System.out.println(numero);
        }
    }
    
    /* ************************** main ************************** */
    /* Esta función es la función principal.                      */
    /*      ENTRADA -> pedir al usuario dos números int
            SALIDA -> Nada  
            PROCESO: Llamar a la función                          */
    /* ********************************************************** */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /* Escribe una función a la que se le pasen dos enteros y muestre todos 
        los números comprendidos entre ellos. */
        
        System.out.println("Introduce el primer numero entero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero entero:");
        int num2 = sc.nextInt();
        
        System.out.println("Los numeros del rango entre " + num1 + " y " + num2 + " son: ");
        muestraRango(num1, num2);

    } 
}
