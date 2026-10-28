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
public class EJERCICIO_07_BUCLES_ADIVINAR_NUMERO_V2 {
    
    public static void main(String[] args) {
        
     /* el usuario dispondrá de 6 intentos para adivinar el número.*/
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000) +1;
        int intentos = 0;
        boolean acertado = false;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adivina el numero del 1 al 1000. Dispones de 6 intentos: ");
        
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
        if (acertado == true){
            System.out.println("Has acertado el numero en " + intentos + ". Enhorabuena!");
        }
        else {
            System.out.println("No te quean mas intentos. El numero era " + numeroAleatorio);
        }
    }    
}
