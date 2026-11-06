package hojaEjercicios_Funciones;

import java.util.Scanner;

public class FunciónSuma_DosNúmerosReales {
    
    /* ************************** suma ************************** */
    /* Esta función calcula la suma de dos números reales         */
    /*  ENTRADA -> 2 números int
        SALIDA -> Nada
        PROCESO: Mostrar números en el rango                      */
    /* ********************************************************** */
    
    public static void suma(double num1, double num2){
        System.out.println("El resultado de su suma es: " + (num1 + num2));
    }
    
    /* ************************** main ************************** */
    /* Esta función es la función principal. */
    /*      ENTRADA -> pedir al usuario dos números int
            SALIDA -> Nada  
            PROCESO: Llamar a la función                          */
    /* ********************************************************** */
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        /* Escribe una función a la que se le pasen dos número reales y muestre
        su suma. */
        
        System.out.println("Introduce el primer numero real:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero real:");
        int num2 = sc.nextInt();
        
        suma(num1, num2);

    } 
}
