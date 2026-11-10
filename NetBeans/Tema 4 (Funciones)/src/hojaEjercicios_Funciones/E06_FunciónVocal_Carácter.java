package hojaEjercicios_Funciones;

import java.util.Scanner;

public class E06_FunciónVocal_Carácter {
        
    /* ************************** menuOpciones ************************** */
    /* Esta función muestra el menú de opciones.          */
    /*  ENTRADA -> 1 número int
        SALIDA -> Nada
        PROCESO -> Leer elección del usuario.                            */
    /* ****************************************************************** */
    
    public static boolean esVocal(char letra){
        boolean esVocal;
        
        switch(letra) {
            if (letra) {
                case a, e, i, o, u -> {
                esVocal = true;
            }
            else {
                esVocal;
            }
                
        }
        
    }
    
    /* ************************** calculaArea *************************** */
    /* Esta función calcula el área de un cilindro.                       */
    /*  ENTRADA -> 2 número int
        SALIDA -> Resultado
        PROCESO -> Leer num1 y num2 escrita por el usuario y calcular el
        mayor.                                                            */
    /* ****************************************************************** */
    
    public static void main(String[] args) {
        
        /* Crear una función que, mediante un booleano, indique si el carácter que se pasa como parámetro de
        entrada corresponde con una vocal. */
        
        Scanner sc = new Scanner(System.in);
        char letra;
        
        System.out.println("Introduzca una letra: ");
        letra = sc.next();
        
        esVocal(letra);
    }    
}
