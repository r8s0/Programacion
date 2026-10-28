/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Alumno
 */
public class EJERCICIO_13_BUCLES_TABLAS_MULTIPLICAR {
    
    public static void main(String[] args) {
     
        /* Mostrar en pantalla las tablas de multiplicar del 1 al 10.*/

            // Bucle for externo: controla las tablas
            for (int tabla = 1; tabla <= 10; tabla++){
                System.out.println("Tabla del " + tabla + ":");
                
                // Bucle for interno: controla las multiplicaciones
                for (int numero = 1; numero <= 10; numero++){
                    System.out.println(tabla + " x " + numero + " = " + (tabla*numero));
                }
                System.out.println();
            }  
    }
    
}
