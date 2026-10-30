package hojaEjercicios_Bucles;

public class TablasMultiplicar1al10 {
    
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
