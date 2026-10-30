package hojaEjercicios_Bucles;

import java.util.Scanner;

public class ARREGLAR_EJ_CUENTA_ATRAS_2 {
    
    public static void main(String[] args) {
        
        // CREAMOS UN ESCANER PARA DETECTAR LO ESCRITO POR EL USUARIO
        Scanner scan = new Scanner(System.in); 
        
        // AQUI PEDIMOS EL NUMERO Y LO METEMOS EN LA VARIABLE QUE HEMOS CREADO
        System.out.println("Introduce cuando quieres que empiece la cuenta atras: ");
        int numero = scan.nextInt();
       
       // SI EL NUMERO QUE HEMOS PREGUNTADO ES MAYOR A 0 TIRARA LA CUENTA ATRAS
        if (numero > 0){
        while(numero > 0){
                 System.out.println("tiempo de despegue..." + numero);
                 numero--;
            } 
            
            // AQUI YA ACABA EL BUCLE Y SALTA EL MENSAJE
            System.out.println("Despegue!");
        }
        else {
            System.out.println("Numero invalido. Prueba con un numero positivo mayor que cero.");
        }
    }
}    