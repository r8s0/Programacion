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
public class EJERCICIO06_DE_PROGRAMACIÓN_EN_PSEUDOCÓDIGO {
               

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* El programa solicita un número entero (1 a 7) y muestra el día de la semana correspondiente (1 = lunes, 2 = martes,
etc.). Si el número no está comprendido entre 1 y 7, muestra "Número inválido". */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero del 1 al 7: ");
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
