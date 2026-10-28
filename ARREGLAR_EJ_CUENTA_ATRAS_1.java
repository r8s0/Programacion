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
public class ARREGLAR_EJ_CUENTA_ATRAS_1 {
    public static void main(String[] args) {
        
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo: ");
        numero = teclado.nextInt();
        
        if (numero > 0){
         while(numero != 0){
             System.out.println(numero);
             numero--;
         }
         System.out.println("¡Despegue!");
        }
        else {
            System.out.println("Numero invalido. Introduce un numero entero positivo.");
        }
        
    }    
        
}    