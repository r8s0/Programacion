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
public class NewClass1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
System.out.println("Deme la primera nota entera para calcular la media aritmetica: ");
Scanner sc = new Scanner(System.in);
double primera_nota = sc.nextDouble();
primera_nota = sc.nextDouble();
System.out.println("Deme la segunda nota entera para calcular la media aritmetica: ");
double segunda_nota = sc.nextDouble();
segunda_nota = sc.nextDouble();
double media = ( primera_nota + segunda_nota ) / 2;
System.out.println("El resultado es: " + media);

}
}
