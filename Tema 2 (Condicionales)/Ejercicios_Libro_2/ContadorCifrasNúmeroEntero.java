package Ejercicios_Libro_2;
import java.util.Scanner;

public class ContadorCifrasNúmeroEntero {
    
    public static void main(String[] args) {
        
        /* Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por
        teclado, que estará comprendido entre O y 99999.*/

        Scanner sc = new Scanner(System.in);

        //** DECLARACIÓN DE VARIABLES Y CONSTANTES**//
        int numero;

        System.out.println("Dame un numero del 0 al 99999");
        numero = sc.nextInt();

        if (numero < 10) {
            System.out.println("El numero contiene 1 cifra");
        }   else if (numero < 100){
            System.out.println("El numero contiene 2 cifra");
        }   else if (numero < 1000){
            System.out.println("El numero contiene 3 cifra");
        }   else if (numero < 10000){
            System.out.println("El numero contiene 4 cifra");
        }   else if (numero < 100000){
            System.out.println("El numero contiene 5 cifra");
        }   else if (numero >= 100000){
            System.out.println("Solo se admiten numeros de 1 a 5 cifras");
        }
    }
}


