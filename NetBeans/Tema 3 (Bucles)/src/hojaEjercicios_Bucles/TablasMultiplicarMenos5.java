package hojaEjercicios_Bucles;

public class TablasMultiplicarMenos5 {
    
    public static void main(String[] args) {
     
        /* Hacer un programa en java que imprima las tablas de multiplicar 
         desde la 1 a la 10, exceptuando la del 5. Utilizar bucles for 
         convencionales anidados y la sentencia continue (vuelve a la cabecera 
         del for, saltando un paso). */

            // Bucle for externo: controla las tablas
            for (int tabla = 1; tabla <= 10; tabla++){
                
                // Si es la tabla del 5, salta a la siguiente.
                if (tabla == 5) {
                    continue;
                }
                
                System.out.println("Tabla del " + tabla + ":");
                
                // Bucle for interno: controla las multiplicaciones
                for (int numero = 1; numero <= 10; numero++){
                    System.out.println(tabla + " x " + numero + " = " + (tabla*numero));
                }
                System.out.println();
            }  
    }    
}
