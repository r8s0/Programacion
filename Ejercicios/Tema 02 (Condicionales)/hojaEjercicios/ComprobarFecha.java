package hojaEjercicios;

import java.util.Scanner;

public class ComprobarFecha {
    
        public static void main(String[] args) {
            
         /* Realizar el ejercicio utilizando una estructura switch para los meses, y teniendo en cuenta los
         posibles años bisiestos (un año es bisiesto si es divisible entre 4, pero no entre 100, a menos
         que también sea divisible entre 400).*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int dia,mes,anyo;
         boolean fechaCorrecta = false;
         boolean esBisiesto;
                
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Introduzca un dia: ");
         dia = sc.nextInt();
         
         System.out.println("Introduzca un mes: ");
         mes = sc.nextInt();
         
         System.out.println("Introduzca un anyo: ");
         anyo = sc.nextInt();
         
         if (anyo <= 0) {
             System.out.println("El anyo no puede ser menor a 1.");
        } else if (mes <= 0 || mes >12){
             System.out.println("El mes no puede ser menor a 1 ni mayor a 12.");
        }
        
         if (anyo > 0 && mes >= 1 && mes <= 12) {
           switch (mes) {
              case 2 -> {
               esBisiesto = (anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0);
                if (esBisiesto){
                   if (dia >= 1 && dia <= 29)
                       fechaCorrecta = true;
                }
                else {
                   if (dia >= 1 && dia <=28)
                       fechaCorrecta = true;
                }
              }
              case 1,3,5,7,8,10,12 -> {
               if (dia >= 1 && dia <= 31)
                   fechaCorrecta = true;
              }   
              case 4,6,9,11 -> {
               if (dia >= 1 && dia <= 30)
                   fechaCorrecta = true;
              }
           }
        }
         if (fechaCorrecta){
             System.out.println("La fecha es CORRECTA");
         }
         else {
             System.out.println("La fecha es INCORRECTA");
         }
    }
}