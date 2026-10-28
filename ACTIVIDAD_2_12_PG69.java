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
public class ACTIVIDAD_2_12_PG69 {
    public static void main(String[] args) {
            
         /* Diseña una aplicación en la que, dado un número de DNI, calcule la 
            letra que le corresponde. Observa que un número de 8 dígitos está dentro del rango del tipo int.*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int nDNI,mDNI;
         final String letraDNI;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Dime un numero de 8 digitos: ");
         nDNI = sc.nextInt();
         
         mDNI = nDNI % 23;
         
         switch (mDNI){
             case 0 -> {
                 letraDNI = "T";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }
             case 1 -> {
                 letraDNI = "R";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }
             case 2 -> {
                 letraDNI = "W";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             } 
             case 3 -> {
                 letraDNI = "A";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 4 -> {
                 letraDNI = "G";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 5 -> {
                 letraDNI = "M";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 6 -> {
                 letraDNI = "Y";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 7 -> {
                 letraDNI = "F";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 8 -> {
                 letraDNI = "P";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 9 -> {
                 letraDNI = "D";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 10 -> {
                 letraDNI = "X";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 11 -> {
                 letraDNI = "B";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 12 -> {
                 letraDNI = "N";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 13 -> {
                 letraDNI = "J";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 14 -> {
                 letraDNI = "Z";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 15 -> {
                 letraDNI = "S";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 16 -> {
                 letraDNI = "Q";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 17 -> {
                 letraDNI = "V";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 18 -> {
                 letraDNI = "H";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 19 -> {
                 letraDNI = "L";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 20 -> {
                 letraDNI = "C";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 21 -> {
                 letraDNI = "K";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }  
             case 22 -> {
                 letraDNI = "E";
                 System.out.println("El DNI es: " + nDNI + letraDNI);
             }
             default -> {
                 System.out.println("Numero INCORRECTO");
             }
         } 
    }
}