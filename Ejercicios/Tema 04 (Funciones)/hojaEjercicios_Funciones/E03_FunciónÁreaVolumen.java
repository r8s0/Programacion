package hojaEjercicios_Funciones;

import java.util.Scanner;

public class E03_FunciónÁreaVolumen {
    
    /* ************************** menuOpciones ************************** */
    /* Esta función muestra el menú de opciones.          */
    /*  ENTRADA -> 1 número int
        SALIDA -> Nada
        PROCESO -> Leer elección del usuario y calcular el área/volumen 
                   dependiendo de la elección                             */
    /* ****************************************************************** */
    
    public static void menuOpciones(int opcion){
        
        Scanner sc = new Scanner(System.in);
        
        double altura, radio;
        
        if (opcion == 1){
            double area;
            System.out.println("OPCION 1 SELECCIONADA.");
            System.out.println("");
            System.out.println("Introduzca el radio del cilindro: ");
            radio = sc.nextDouble();
            System.out.println("");
            System.out.println("Introduzca la altura del cilindro: ");
            altura = sc.nextDouble();
            System.out.println("");
            
            area = (2 * Math.PI) * radio * (altura + radio);
            System.out.println("El area del cilindro es: " + area + " unidades.");  
        }
        else {
            double volumen;
            System.out.println("OPCION 2 SELECCIONADA.");
            System.out.println("");
            System.out.println("Introduzca el radio del cilindro: ");
            radio = sc.nextDouble();
            System.out.println("");
            System.out.println("Introduzca la altura del cilindro: ");
            altura = sc.nextDouble();
            System.out.println("");
            
            volumen = Math.PI * (radio * radio) * altura;
            System.out.println("El volumen del cilindro es: " + volumen + " unidades.");
        }
    }
    
    /* ************************** main ************************** */
    /* Esta función es la función principal.                      */
    /*      ENTRADA -> pedir al usuario dos números int
            SALIDA -> Nada  
            PROCESO: Llamar a la función                          */
    /* ********************************************************** */
    
    public static void main(String[] args) {
        
        /* Realizar una función que calcule y muestre el área o el volumen de un cilindro. según se
        especifique. Para distinguir un caso de otro se le pasará como opción un número; 1 (para
        el área) 0 2 (para el volumen). Además. hay que pasarle a la función el radio de la base
        y la altura. */
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do{ 
            System.out.println("*********Menu de opciones*********");
            System.out.println("1) Calcular area del cilindro");
            System.out.println("2) Calcular volumen del cilindro");
            System.out.println("**********************************");
            System.out.println("Introduzca una opcion: ");
            opcion = sc.nextInt();
            System.out.println("");
            
            if (opcion < 1 || opcion > 2){
                System.out.println("Numero invalido. Introduce un numero dispoinible en el menu de opciones: ");
                System.out.println("");
            }
        } while (opcion < 1 || opcion > 2);

        menuOpciones(opcion);
    }
}
