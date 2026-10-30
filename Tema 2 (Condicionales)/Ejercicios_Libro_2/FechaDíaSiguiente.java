package Ejercicios_Libro_2;
import java.util.Scanner;

public class FechaDíaSiguiente {
    
    public static void main(String[] args) {
            
         /* Crear una aplicación que solicite al usuario una fecha (día, mes y año) y muestre la fecha
         correspondiente al día siguiente.*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int dia,mes,anyo;
         boolean esBisiesto;
         boolean fechaCorrecta = false;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Introduzca un dia: ");
         dia = sc.nextInt();
         
         System.out.println("Introduzca un mes: ");
         mes = sc.nextInt();
         
         System.out.println("Introduzca un anyo: ");
         anyo = sc.nextInt();
         
         if (anyo > 0 && mes >= 1 && mes <= 12){
         switch (mes) {
                 case 4,6,9,11 -> {
                     if (dia >= 1 && dia <= 30)
                         fechaCorrecta = true;
                     if (dia > 29){
                         dia = 1;
                         mes++;
                     } else {
                         dia++;
                     }
                 }
                 case 1,3,5,7,8,10,12 -> {
                     if (dia >= 1 && dia <= 31)
                         fechaCorrecta = true;
                     if (dia > 30){
                         dia = 1;
                         mes++;
                     } else {
                         dia++;
                       }
                     if (dia == 31 && mes >= 12){
                         mes = 1;
                         anyo++;
                     }
                 }
                 case 2 -> {
                     esBisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
                     if (esBisiesto) {
                         if (dia >= 1 && dia <= 29){
                             fechaCorrecta = true;
                             if (dia == 29){
                                 dia = 1;
                                 mes++;
                             } 
                             if (dia >= 1 && dia > 29) {
                                 dia++;
                             }
                         }
                     } 
                     else {
                         if (dia >= 1 && dia <= 28){
                             fechaCorrecta = true;
                             if (dia == 28) {
                                 dia = 1;
                                 mes++;
                             } else {
                                 dia++;
                             } 
                         }
                     }   
                 }
        }
        }
         if (fechaCorrecta) {
             System.out.println("Fecha +1 dia: " + dia + ":" + mes + ":" + anyo);
         } else {
             System.out.println("Fecha INCORRECTA");
         }
    }
}