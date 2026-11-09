package Ejercicios_Libro_3;

import java.util.Scanner;

public class CalcularNúmeroParPositivoCuadrado {
    
    public static void main(String[] args) {
            
        /* Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si
        es positivo y su cuadrado. EI proceso se repetirá hasta que el número introducido sea O. */
         
        Scanner sc = new Scanner(System.in);
     
        //DECLARACIÓN DE VARIABLES Y CONSTANTES
        int numero, cuadrado;
     
        System.out.println("Introduzca un numero: ");
        numero = sc.nextInt();
     
        while (numero > 0){
         
            if (numero % 2 == 0) {
                System.out.println("Es par");
            }
            else {
                System.out.println("Es impar");
            }
         
         
            if (numero > 0){
                System.out.println("Es positivo");
            }
            else {
                System.out.println("Es negativo");
            }
         
         
            cuadrado = numero * numero;
            System.out.println("Su cuadrado es: " + cuadrado);
         
            System.out.println("Introduzca otro numero: ");
            numero = sc.nextInt();
        }
        System.out.println("ERROR. NUMERO <= 0. FINALIZANDO PROGRAMA");
    }
}
