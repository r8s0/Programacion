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
public class EJERCICIO_20_BUCLES_RELOJ {
    
    public static void main(String[] args) {
     
        /* Escribe un programa que incremente la hora de un reloj. Se pedirán por
        teclado la hora, minutos y segundos, así como cuántos segundos se desea
        incrementar la hora introducida. La plicación mostrará la nueva hora. 
        Por ejemplo, si las 13:59:51 se incrementan en 10 segundos, resultan 
        las 14:00:01. */
            
                Scanner sc = new Scanner(System.in);
        
                int horas, minutos, segundos, incrementoSegundos, segundosSumados;
            
                System.out.println("Introduzca las horas: ");
                horas = sc.nextInt(); 
                    while (horas < 0 || horas > 23){
                        System.out.println("Horas invalidas. Prueba con numeros del 0 al 23: ");
                        horas = sc.nextInt();
                    }
                
                System.out.println("Introduzca los minutos: ");
                minutos = sc.nextInt();
                    while (minutos < 0 || minutos > 59){
                        System.out.println("Minutos invalidos. Prueba con numeros del 0 al 59: ");
                        minutos = sc.nextInt();
                    }
                
                System.out.println("Introduzca los segundos: ");
                segundos = sc.nextInt();
                    while (segundos < 0 || segundos > 59){
                        System.out.println("Segundos invalidos. Prueba con numeros del 0 al 59: ");
                        segundos = sc.nextInt();
                    }
                
                System.out.println("Hora actual: " + horas + ":" + minutos + ":" + segundos + ".");
                System.out.println("Introduzca los segundos que desea incrementar: ");
                incrementoSegundos = sc.nextInt();
                
                // Bucle for para incrementar los segundos
                for (segundosSumados = 0; segundosSumados < incrementoSegundos; segundosSumados++){
                    segundos++;
                    
                    //Condición para si los segundos llegan a 60, reiniciar a 0 e incrementar minutos.
                    if (segundos == 60){
                        segundos = 0;
                        minutos++;
                        
                        //Condición para si los minutos llegan a 60, reiniciar a 0 e incrementar horas.
                        if (minutos == 60){
                            minutos = 0;
                            horas++;
                            
                            //Condición para si las horas llegan a 24, reiniciar a 0.
                            if (horas == 24){
                            horas = 0;
                            }
                            
                        }
                    }
               
                }
                System.out.println("Hora con incremento: " + horas + ":" + minutos + ":" + segundos + ".");
    }    
}
