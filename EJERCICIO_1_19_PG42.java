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
public class EJERCICIO_1_19_PG42 {
    
    public static void main(String[] args) {
/* Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a
calcular eI importe que hay que cobrar en la taquilla por la compra de una serie de entra-
das (cuyo número será introducido por el usuario). Existen dos tipos de entrada: infanti-
les, que cuestan 15,50 €; y de adultos, que cuestan 20 €. En el caso de que el importe total sea igual o superior a 100€, se aplicará automática-
mente un bono descuento del 5 %.*/

Scanner sc = new Scanner(System.in);

//** DECLARACIÓN DE VARIABLES Y CONSTANTES**//
final double ENTRADA_INF = 15.50;
final double ENTRADA_ADULTO = 20;
int numero_entradas_inf;
int numero_entradas_adulto;
double precio_inf;
double precio_adulto;
double precio_total;
double descuento;
double precioFinal;

System.out.println("Cuantas entradas infantiles necesitas?: ");
numero_entradas_inf = sc.nextInt();
precio_inf = numero_entradas_inf * ENTRADA_INF;

System.out.println("Cuantas entradas adultas necesitas?: ");
numero_entradas_adulto = sc.nextInt();
precio_adulto = numero_entradas_adulto * ENTRADA_ADULTO;

precio_total = precio_inf + precio_adulto;

if (precio_total >= 100) {
    descuento = precio_total * 0.05;
    precioFinal = precio_total - descuento;
    System.out.println("El precio total al ser igual o superior a 100 euros se le aplicara un descuento del 5%.");
    System.out.println("El precio total sin el descuento es de: " + precio_total);
    System.out.println("El precio total con el descuento es de: " + precioFinal);
}   else {
    System.out.println("El precio total es de: " + precio_total + " euros");
    }
}
}