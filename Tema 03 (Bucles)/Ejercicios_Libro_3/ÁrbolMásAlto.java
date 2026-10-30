package Ejercicios_Libro_3;

import java.util.Scanner;

public class ÁrbolMásAlto {
    
    public static void main(String[] args) {
        
        /* Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el
        árbol más alto. Para ello se introducirá por teclado la altura (en centrmetros) de cada
        árbol (terminando la introducción de datos cuando se utilice —1 corno altura). Los árboles
        se identifican mediante etiquetas con números únicos correlativos, comenzando en O. Di•
        señar una aplicación que resuelva el problema planteado. */
         
        Scanner sc = new Scanner(System.in);
     
        //DECLARACIÓN DE VARIABLES Y CONSTANTES
        int altura, etiquetaArbolMasAlto, alturaArbolMasAlto, etiqueta;
     
        etiquetaArbolMasAlto = 0;
        alturaArbolMasAlto = 0;
        etiqueta = 0;
     
        System.out.println("Introduzca la altura del arbol (" + etiqueta + ") en cm: ");
        altura = sc.nextInt();
   
        while (altura != -1){
            if (alturaArbolMasAlto < altura){
                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta ++;
            System.out.println("Introduzca la altura del arbol (" + etiqueta + ") en cm: ");
            altura = sc.nextInt();
        }
     
        if (alturaArbolMasAlto == -1) {
            System.out.println("No hay ningun arbol.");
        }
        else {
            System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
            System.out.println("Etiqueta del arbol mas alto: " + etiquetaArbolMasAlto);
        }
     
    }
}
