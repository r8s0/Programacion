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
public class EJERCICIO02_DE_PROGRAMACIÓN_EN_PSEUDOCÓDIGO { 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Escribe un pseudocódigo para solicitar la edad a un usuario e imprimir un mensaje "eres mayor de edad" si tiene
más de 17 años o imprimir el mensaje "eres menor de edad" si tiene menos de 18 años. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime su edad: ");
        int edad;
        edad = sc.nextInt();
        if (edad > 17){
            System.out.println("Eres mayor de edad");
        }
        if (edad <= 17){
            System.out.println("Eres menor de edad");
        }
}
    }
