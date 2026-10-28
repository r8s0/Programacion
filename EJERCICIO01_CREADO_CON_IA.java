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
public class EJERCICIO01_CREADO_CON_IA {
    public static void main(String[] args) {
     /* Crea un programa que pida al usuario el precio base de un producto. El programa debe calcular y mostrar por pantalla: 
        1. El descuento aplicado (un 15% sobre el precio base).
        2. El precio con el descuento aplicado.
        3. El precio final sumándole el IVA (21%) al precio descontado. */
         
     //DECLARACIÓN DE VARIABLES Y CONSTANTES
     double precio_base, descuento_aplicado, IVA, precio_final;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Introduce el precio base (en euros) de un producto: ");
     precio_base = sc.nextDouble();
     
     descuento_aplicado = precio_base * 0.85;
     System.out.println("El precio del producto con un descuento del 15% es de: " + descuento_aplicado + " euros");
     
     IVA = descuento_aplicado * 0.21;
     precio_final = descuento_aplicado + IVA;
     System.out.println("El precio final con IVA es de: " + precio_final + " euros");
    }
}
