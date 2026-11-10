package hojaEjercicios_Funciones;
import java.util.Scanner;

public class E10_FunciónCalculadoraConMenú_V1 {
    
    // Función que muestra el menú de operaciones disponibles.
    public static void menú(){
        System.out.println("***********CALCULADORA BASICA DE NUMEROS REALES***********");
        System.out.println("Menu de operaciones:");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicacion");
        System.out.println("4) Division");
        System.out.println("5) Salir del programa");
        System.out.println("**********************************************************");
        System.out.println("");
        System.out.println("Elige una opcion: ");
    }
    
    // Función que opera según los operandos dados y según la opción indicada.
    public static double calculadora(float num1, float num2, int opcion){
        
        double resultado = 0;
        
        switch (opcion){
            case 1 -> {
                resultado = num1 + num2;
            }
            case 2 -> {
                resultado = num1 - num2;
            } 
            case 3 -> {
                resultado = num1 * num2;
            }
            case 4 -> {
                resultado = num1 / num2;
            }
            default -> {
                System.out.println("Saliendo de la aplicacion.");
            }
                
        }
        return resultado;
    }
    
    // Función principal.
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        menú();
        opcion = sc.nextInt();
        
        // Validación de que opción está entre 1 y 5.
        
        while(opcion > 5 || opcion < 1){
            System.out.println("OPCION NO VALIDA.");  
            menú();
            opcion = sc.nextInt();
            System.out.println("");
        }
        
        if (opcion == 5){
            System.out.println("Saliendo de la aplicacion.");
        }
        else {
            
            while(opcion != 5){
                //Pedimos los operandos.
                System.out.println("Introduce el primer numero: ");
                int num1 = sc.nextInt();
                System.out.println("Introduce el segundo numero: ");
                int num2 = sc.nextInt();
                System.out.println("");
        
                // Cálculo e impresión del resultado
                calculadora(num1, num2, opcion);
                System.out.print("El resultado es: ");
                System.out.println(calculadora(num1, num2, opcion));
            }
            System.out.println("Saliendo de la aplicacion.");
        
        }
    }
}