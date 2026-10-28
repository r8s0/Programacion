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
public class EJERCICIO04_DE_PROGRAMACIÓN_EN_PSEUDOCÓDIGO {
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Escribe un pseudocódigo que solicite un número entero al usuario e indique mediante un valor booleano (true o
false) si el número es par (true si es par y false si es impar)*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero: ");
        int numero;
        numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
