/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EJERCICIO05_DE_PROGRAMACIÓN_EN_PSEUDOCÓDIGO {
            

    /**
     * @param args the command line arguments
     */
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
