/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EJERCICIO_2_BASICO_JAVA_VERSION_2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Teclee el num1: ");
        
        int num1 = sc.nextInt();
        
        System.out.println("Teclee el num2: ");
        
        int num2 = sc.nextInt();
        int resta1 = num1 - num2;
        int multiplicacion1 = num1 * num2;
        int cdivision1 = num1 / num2;
        int rdivision1 = num1 % num2;
        
        System.out.println("Num1 es igual a: " + num1);
        System.out.println("Num2 es igual a: " + num2);
        System.out.println("Resta es igual a: " + resta1);
        System.out.println("Multiplicacion es igual a :" + multiplicacion1);
        System.out.println("Cociente de la division es igual a: " + cdivision1);
        System.out.println("Resto de la division es igual a: " + rdivision1);
        System.out.println("Ahora invertido. Teclee el num2: ");
        
        double num3 = sc.nextInt();
        System.out.println("Ahora teclee el num1: ");
        double num4 = sc.nextInt();
        double resta2 = num3 - num4;
        double multiplicacion2 = num3 * num4;
        double cdivision2 = num3 / num4;
        double rdivision2 = num3 % num4;
        
        System.out.println("Con los valores invertidos: ");
        System.out.println("Num1 es igual a: " + num3);
        System.out.println("Num2 es igual a: " + num4);
        System.out.println("Resta es igual a: " + resta2);
        System.out.println("Multiplicacion es igual a :" + multiplicacion2);
        System.out.println("Cociente de la division es igual a: " + cdivision2);
        System.out.println("Resto de la division es igual a: " + rdivision2);
}
    }
