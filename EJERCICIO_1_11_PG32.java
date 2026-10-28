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
public class EJERCICIO_1_11_PG32 {
    
        public static void main(String[] args) {
        /* Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas
y peras. por este motivo. es necesario diseñar una aplicación que solicite las ventas (en
kilos) de cada semestre para cada fruta. La aplicación mostrará el importe total sabien-
do que el precio del kilo de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 E.*/
        
        final double PRECIO_MANZ = 2.35;
        final double PRECIO_PER = 1.95;
        int ventaManz1semestre;
        int ventaManz2semestre;
        int ventaPeras1semestre;
        int ventaPeras2semestre;
        double precio_total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Primero las manzanas: ");
        System.out.println("Kilos vendidos en el primer semestre: ");
        ventaManz1semestre = sc.nextInt();
        System.out.println("Kilos venidos en el segundo semestre: ");
        ventaManz2semestre = sc.nextInt();
        
        System.out.println("Ahora las peras: ");
        System.out.println("Kilos vendidos en el primer semestre: ");
        ventaPeras1semestre = sc.nextInt();
        System.out.println("Kilos venidos en el segundo semestre: ");
        ventaPeras2semestre = sc.nextInt();
        
        precio_total = (ventaManz1semestre + ventaManz2semestre) * PRECIO_MANZ;
        precio_total += (ventaPeras1semestre + ventaPeras2semestre) * PRECIO_PER;
        
        System.out.println("El precio total es de: " + precio_total + "euros");
    }
    
}
