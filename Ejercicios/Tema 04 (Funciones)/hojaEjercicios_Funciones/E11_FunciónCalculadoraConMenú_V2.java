package hojaEjercicios_Funciones;
import java.util.Scanner;

public class E11_FunciónCalculadoraConMenú_V2 {
    
    // Función que muestra el menú de operaciones disponibles.
    public static int escribeMenu(){
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
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
        opcion = sc.nextInt();

        return opcion;
        
    }
    
    public static double suma(double num1, double num2){
        return num1 + num2;
    }
    
    public static double resta(double num1, double num2){
        return num1 - num2;
    }
    
    public static double multiplicacion(double num1, double num2){
        return num1 * num2;
    }
    
    public static double division(double num1, double num2){
        return num1 / num2;
    }
    
    // Función que opera según los operandos dados y según la opción indicada.
    public static double calculadora(double num1, double num2, int opcion){
        
        double resultado = 0;
        
        switch (opcion){
            case 1 -> {
                resultado = suma(num1, num2);
            }
            case 2 -> {
                resultado = resta(num1, num2);
            } 
            case 3 -> {
                resultado = multiplicacion(num1, num2);
            }
            case 4 -> {
                if (num2 == 0){
                    System.out.println("No se puede dividir por 0.");
                }
                else{
                    resultado = division(num1, num2);  
                }
            }   
        }
        return resultado;
    }
    
        
    // Función principal.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion = escribeMenu();
        
        while (opcion != 5){
            
            switch (opcion){
                case 1,2,3 -> {
                    System.out.println("Introduce el primer operando: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Introduce el segundo operando: ");
                    double num2 = sc.nextDouble();
                    System.out.println("");
            
                    double resultado = calculadora(num1, num2, opcion);
                    System.out.print("El resultado es: ");
                    System.out.println(resultado);
                    
                }
                case 4 -> {
                    System.out.println("Introduce el primer operando: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Introduce el segundo operando: ");
                    double num2 = sc.nextDouble();
                    System.out.println("");
            
                    double resultado = calculadora(num1, num2, opcion);
                    
                    if (num2!=0){
                        System.out.print("El resultado es: ");
                        System.out.println(resultado);
                    }
                }
                default -> {
                    System.out.println("OPCION NO VALIDA");
                }
            }
            opcion = escribeMenu();
        }
        System.out.println("FIN DEL PROGRAMA");           
    }
}