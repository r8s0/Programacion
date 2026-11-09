package hojaEjercicios_Funciones;

import java.util.Scanner;

public class E05_FunciónMáximo_DosNúmerosInt {
        
    /* ************************** menuOpciones ************************** */
    /* Esta función muestra el menú de opciones.          */
    /*  ENTRADA -> 1 número int
        SALIDA -> Nada
        PROCESO -> Leer elección del usuario.                            */
    /* ****************************************************************** */
    
    public static void maximo(int num1, int num2){
        
        int numMayor;
        
        if (num1==num2){
            System.out.println("Los numeros son iguales.");
        }
        else if (num1 > num2){
            numMayor = num1;
            System.out.println("El maximo de los dos numeros es: " + numMayor);
        }
        else if (num1 < num2){
            numMayor = num2;
            System.out.println("El maximo de los dos numeros es: " + numMayor);
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
        
        /* Diseñar una función que recibe como parámetros dos números enteros y 
           devuelve el máximo de ambos.*/
        
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Introduzca el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        num2 = sc.nextInt();
        
        maximo(num1, num2);
    }
}
