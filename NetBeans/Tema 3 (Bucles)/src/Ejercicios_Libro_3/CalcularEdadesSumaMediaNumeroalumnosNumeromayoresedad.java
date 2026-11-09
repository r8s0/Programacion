package Ejercicios_Libro_3;

import java.util.Scanner;

public class CalcularEdadesSumaMediaNumeroalumnosNumeromayoresedad {
    
    public static void main(String[] args) {
     
        /* Implementar una aplicación para calcular datos estadísticos de las edades de los alum•
        nos de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y
        se mostrará: la suma de todas las edades introducidas, la media, el número de alumnos
        y cuántos son mayores de edad */
         
        Scanner sc = new Scanner(System.in);
     
        //DECLARACIÓN DE VARIABLES Y CONSTANTES
        int edad, sumEdades, numAlumnos, mayoresEdad;
        double medEdades;
        System.out.println("Introduzca una edad: ");
        edad = sc.nextInt();
     
        sumEdades = 0;
        numAlumnos = 0;
        mayoresEdad = 0;
     
     
        if(edad < 0){
            System.out.println("ERROR. EDAD NEGATIVA");
        }
     
        while (edad >= 0){
            sumEdades += edad;
            numAlumnos ++;
            if (edad >= 18){
                mayoresEdad ++;
            }
            System.out.println("Introduzca otra edad: ");
            edad = sc.nextInt();
        }
        medEdades = (double) (sumEdades) / (numAlumnos);
        System.out.println("La suma de edades es: " + sumEdades);
        System.out.println("La media de edad es: " + medEdades);
        System.out.println("El numero de alumnos es de: " + numAlumnos);
        System.out.println("El numero de alumnos mayores de edad es de: " + mayoresEdad);
    }
}
