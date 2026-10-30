package hojaEjercicios_Bucles;

import java.util.Scanner;

public class TablasMultiplicarNal10 {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        /* Mostrar en pantalla las tablas de multiplicar desde un número 
         comprendido entre 1 y 10 solicitado al usuario y
         el 10. Por ejemplo, si el usuario nos da el número 7 mostraremos 
         las tablas del 7, 8, 9 y 10.*/

        int tablaSol;
        
        do {
            
            System.out.println("Introduzca una tabla del 1 al 10: ");
            tablaSol = sc.nextInt();
            
            if (tablaSol < 1 || tablaSol > 10){
                System.out.println("Numero invalido. Prueba del 1 al 10: ");
            }
            System.out.println();
        } while (tablaSol < 1 || tablaSol > 10);

        
        
        // Bucle for externo: controla las tablas
           
        for (int tabla = tablaSol; tabla <= 10; tabla++){
            System.out.println("Tabla del " + tabla + ":");
                
            // Bucle for interno: controla las multiplicaciones
            for (int numero = 1; numero <= 10; numero++){
                System.out.println(tabla + " x " + numero + " = " + (tabla*numero));
            }
            System.out.println();
        }  
    }    
}
