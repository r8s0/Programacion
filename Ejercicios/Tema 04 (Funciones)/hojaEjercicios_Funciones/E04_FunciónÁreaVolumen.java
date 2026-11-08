package com.mycompany.tema_04;

import java.util.Scanner;

public class E04_FunciónÁreaVolumen {
    
    /* ************************** menuOpciones ************************** */
    /* Esta función muestra el menú de opciones.          */
    /*  ENTRADA -> 1 número int
        SALIDA -> Nada
        PROCESO -> Leer elección del usuario.                            */
    /* ****************************************************************** */
    
    public static void menuOpciones(){
        
        System.out.println("*********Menu de opciones*********");
        System.out.println("1) Calcular area del cilindro");
        System.out.println("2) Calcular volumen del cilindro");
        System.out.println("3) Salir");
        System.out.println("**********************************");
        
    }
    
    /* ************************** calculaArea *************************** */
    /* Esta función calcula el área de un cilindro.          */
    /*  ENTRADA -> 2 número int
        SALIDA -> Nada
        PROCESO -> Leer radio y altura escrita por el usuario.                            */
    /* ****************************************************************** */
    
    public static void calculaArea(){
        
        Scanner sc = new Scanner(System.in);
        int radio, altura, area;
        
        System.out.println("Introduzca el radio del cilindro: ");
        radio = sc.nextInt();
        System.out.println("");
        System.out.println("Introduzca la altura del cilindro: ");
        altura = sc.nextInt();
        System.out.println("");
        
        
        area = (int) ((2 * Math.PI) * radio * (altura + radio));
        
        System.out.println("El area del cilindro es " + area + " unidades.");
        System.out.println(""); 
        
    }
    
    /* ************************** calculaVolumen ************************** */
    /* Esta función calcula el volumen de un cilindro.          */
    /*  ENTRADA -> 2 número int
        SALIDA -> Nada
        PROCESO -> Leer radio y altura escrita por el usuario.                            */
    /* ******************************************************************** */
    
    public static void calculaVolumen(){
        
        Scanner sc = new Scanner(System.in);
        int radio, altura, volumen;
        
        System.out.println("Introduzca el radio del cilindro: ");
        radio = sc.nextInt();
        System.out.println("");
        System.out.println("Introduzca la altura del cilindro: ");
        altura = sc.nextInt();
        System.out.println("");
        
        volumen = (int) (Math.PI * (radio * radio) * altura);
        
        System.out.println("El volumen del cilindro es " + volumen + " unidades.");
        System.out.println(""); 
        
    }
    
    /* ************************** main ************************** */
    /* Esta función es la función principal.                      */
    /*      ENTRADA -> pedir al usuario 1 número int entre 1 y 3
            SALIDA -> Nada  
            PROCESO: Llamar a la función necesaria en cada opción 
            seleccionada                                          */
    /* ********************************************************** */
    
    public static void main(String[] args) {
        
        /* Escribe un programa que presente el siguiente menú:
                Menu de opciones:
                    1. Área de un cilindro
                    2. Volumen de un cilindro
                    3. Salir
        El programa pide al usuario que introduzca una opción, y a continuación le pide el valor del radio de la
        base y la altura del cilindro, y presenta el resultado (área para opción 1 o volumen para opción 2). El
        programa se repite hasta que el usuario elige la opción 3.
        Se deben implementar las funciones calculaArea() y calculaVolumen() para calcular y mostrar el
        resultado de cada opción. También se debe controlar que la opción introducida sea un valor válido. */
        
        Scanner sc = new Scanner(System.in);
        
        menuOpciones();
        
        int opcion;
        
        // Do-while para validar la opción.
        do{
                System.out.println("Introduzca una opcion: ");
                opcion = sc.nextInt();
                System.out.println("");   
            
                if (opcion > 3 || opcion < 1){
                System.out.println("Numero invalido. Introduce un numero dispoinible en el menu de opciones: ");
                } 
                
        }while (opcion > 3 || opcion < 1);
        
        // Switch para elegir calcular el área o el volumen del cilindro según corresponda.
        switch (opcion){ 
            
            case 1 -> 
                calculaArea();
            case 2 ->
                calculaVolumen();
               
        }
        
        // Impreso para cuando se seleccione la opción 3 o se acabe de calcular el área/volumen.
        System.out.println("Saliendo de la aplicacion.");
        
    }    
}
