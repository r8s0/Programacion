/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EJERCICIO_07_BUCLES_ADIVINAR_NUMERO_V3 {
    
    public static void main(String[] args) {
        
     /* Al comienzo del programa preguntamos al usuario cuántos
     intentos desea tener para adivinar el número (mínimo 4 y máximo 10).*/
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000) +1;
        int intentos = 0;
        boolean acertado = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adivina el numero del 1 al 1000. Cuantos intentos deseas tener?");
        int intentosDeseados = sc.nextInt();
        
        if (intentosDeseados < 4 || intentosDeseados > 10){
            System.out.println("Numero de intentos invalido. Solo se admiten de 4 a 10 intentos.");
        }
        else {
            switch (intentosDeseados){
                case 4 -> {
                    
                    while (intentos < 4 && !acertado){
                      System.out.println("Introduce un numero: ");
                      int numero = sc.nextInt();
            
                        if (numero < 1 || numero > 1000){
                            System.out.println("Numero invalido. Solo se admiten numeros del 1 al 1000");
                        }
                        else {
                          intentos++;
                          if (numero < numeroAleatorio){
                            System.out.println("Demasiado bajo");
                          }
                          else if (numero > numeroAleatorio){
                            System.out.println("Demasiado alto");
                          }
                          else{
                            acertado = true;
                          }
                        }        
                    }
                }
                case 5 -> {
                    
                    while (intentos < 5 && !acertado){
                      System.out.println("Introduce un numero: ");
                      int numero = sc.nextInt();
            
                        if (numero < 1 || numero > 1000){
                            System.out.println("Numero invalido. Solo se admiten numeros del 1 al 1000");
                        }
                        else {
                          intentos++;
                          if (numero < numeroAleatorio){
                            System.out.println("Demasiado bajo");
                          }
                          else if (numero > numeroAleatorio){
                            System.out.println("Demasiado alto");
                          }
                          else{
                            acertado = true;
                          }
                        }        
                    }
                }
                case 6 -> {
                    
                    while (intentos < 6 && !acertado){
                      System.out.println("Introduce un numero: ");
                      int numero = sc.nextInt();
            
                        if (numero < 1 || numero > 1000){
                            System.out.println("Numero invalido. Solo se admiten numeros del 1 al 1000");
                        }
                        else {
                          intentos++;
                          if (numero < numeroAleatorio){
                            System.out.println("Demasiado bajo");
                          }
                          else if (numero > numeroAleatorio){
                            System.out.println("Demasiado alto");
                          }
                          else{
                            acertado = true;
                          }
                        }        
                    }
                }
                case 7 -> {
                    
                    while (intentos < 7 && !acertado){
                      System.out.println("Introduce un numero: ");
                      int numero = sc.nextInt();
            
                        if (numero < 1 || numero > 1000){
                            System.out.println("Numero invalido. Solo se admiten numeros del 1 al 1000");
                        }
                        else {
                          intentos++;
                          if (numero < numeroAleatorio){
                            System.out.println("Demasiado bajo");
                          }
                          else if (numero > numeroAleatorio){
                            System.out.println("Demasiado alto");
                          }
                          else{
                            acertado = true;
                          }
                        }        
                    }
                }
                case 8 -> {
                    
                    while (intentos < 8 && !acertado){
                      System.out.println("Introduce un numero: ");
                      int numero = sc.nextInt();
            
                        if (numero < 1 || numero > 1000){
                            System.out.println("Numero invalido. Solo se admiten numeros del 1 al 1000");
                        }
                        else {
                          intentos++;
                          if (numero < numeroAleatorio){
                            System.out.println("Demasiado bajo");
                          }
                          else if (numero > numeroAleatorio){
                            System.out.println("Demasiado alto");
                          }
                          else{
                            acertado = true;
                          }
                        }        
                    }
                }
                case 9 -> {
                    
                    while (intentos < 9 && !acertado){
                      System.out.println("Introduce un numero: ");
                      int numero = sc.nextInt();
            
                        if (numero < 1 || numero > 1000){
                            System.out.println("Numero invalido. Solo se admiten numeros del 1 al 1000");
                        }
                        else {
                          intentos++;
                          if (numero < numeroAleatorio){
                            System.out.println("Demasiado bajo");
                          }
                          else if (numero > numeroAleatorio){
                            System.out.println("Demasiado alto");
                          }
                          else{
                            acertado = true;
                          }
                        }        
                    }
                }
                case 10 -> {
                    
                    while (intentos < 10 && !acertado){
                      System.out.println("Introduce un numero: ");
                      int numero = sc.nextInt();
            
                        if (numero < 1 || numero > 1000){
                            System.out.println("Numero invalido. Solo se admiten numeros del 1 al 1000");
                        }
                        else {
                          intentos++;
                          if (numero < numeroAleatorio){
                            System.out.println("Demasiado bajo");
                          }
                          else if (numero > numeroAleatorio){
                            System.out.println("Demasiado alto");
                          }
                          else{
                            acertado = true;
                          }
                        }        
                    }
                }
            }
            if (acertado == true){
                System.out.println("Has acertado el numero en " + intentos + ". Enhorabuena!");
            }
            else {
                System.out.println("No te quean mas intentos. El numero era " + numeroAleatorio);
            }
        }    
    }    
}
