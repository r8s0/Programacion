package Ejercicios_iniciales;

import java.util.Scanner;

public class CalcularNumeroPositivoNegativoCero {
            
    public static void main(String[] args) {
        
        /* Pide un número entero al usuario e indica si es positivo, negativo o cero. */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero: ");
        
        int numero;
        numero = sc.nextInt();
        
        if (numero > 0){
            System.out.println("Postivo");
        }
        if (numero < 0){
            System.out.println("Negativo");
        }
        if (numero == 0){
            System.out.println("Cero");
        }
    }
}
