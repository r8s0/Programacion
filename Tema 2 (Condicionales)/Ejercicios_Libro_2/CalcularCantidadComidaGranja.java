package Ejercicios_Libro_2;

import java.util.Scanner;

public class CalcularCantidadComidaGranja {
    
    public static void main(String[] args) {
        
    /* En una granja se compra diariamente una cantidad (comidaDiaria) de comida
    para los animales. El número de animales que alimentar es numAnimales,
    y sabemos que cada animal come una media de kilosPorAnimal. Diseña un programa
    que solicite al usuario los valores anteriores y determine si disponemos de 
    alimento suficiente para cada animal. En caso negativo, ha de calcular cuál 
    es la ración que corresponde a cada uno de los animnales.
    Nota: Evitar que la aplicación realice divisiones por 0.*/
         
         //DECLARACIÓN DE VARIABLES Y CONSTANTES
         int numAnimales;
         double comidaDiaria,kilosPorAnimal,racion;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Dime la cantidad de comida comprada diariamente (en kg): ");
         comidaDiaria = sc.nextDouble();
         
         System.out.println("Dime el numero de animales a los que hay que alimentar: ");
         numAnimales = sc.nextInt();
         
         System.out.println("Dime la media de kilos que come un solo animal: ");
         kilosPorAnimal = sc.nextDouble();
         
         racion = (comidaDiaria / numAnimales);
         
         if ((comidaDiaria / numAnimales) >= kilosPorAnimal){
             System.out.println("Hay suficiente comida para cada uno.");
         } else {
             System.out.println("No hay suficiente comida para cada uno. A cada uno le corresponde: " + racion + " kg");
         }
    }
}
