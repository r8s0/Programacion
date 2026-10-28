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
public class PRUEBA_EJERCICIO_BUCLE_FOR {

public static void main (String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Introduzca un numero: ");
int n = sc.nextInt();

for (int i = n; i >= 1; i--){
    System.out.println(i);
}
}    
}
