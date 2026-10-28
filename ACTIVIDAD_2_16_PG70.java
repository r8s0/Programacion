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
public class ACTIVIDAD_2_16_PG70 {
    public static void main(String[] args) {
            
         /* Utiliza el operador ternario para calcular el valor absoluto de un
            número que se solicita al usuario por teclado.*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int numero, valorAbsoluto;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Introduzca un numero: ");
         numero = sc.nextInt();
         
         valorAbsoluto = Math.abs(numero);
         
         numero = numero < 0 ?  numero : valorAbsoluto;
         
          if (numero < 0){
             System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
          }
          else{
             System.out.println("El valor absoluto de " + numero + " es: " + numero);
          }
    }
}
