package hojaExcepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E1_ExcepcionInputMismatchException_V1 {
    
    /**
     * Función leeNumero
     * @return num
     */
    static int leeNumero(){
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean numero = false;
        
        while(!numero){
            
            try{
                
                num = sc.nextInt();
                numero = true;
                
            } catch (InputMismatchException e){
                
                System.out.println("Error. Introduce solo numeros enteros: ");
                sc.nextLine(); // Evita el bucle infinito al descartar el dato incorrecto
                
            }
            
        }
        return num;
        
    }
    
    /**
     * Función principal
     * @param args 
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce un numero entero: ");
        int num1 = leeNumero();
        
        System.out.println("Introduce otro numero entero: ");
        int num2 = leeNumero();
        System.out.println("");
        
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma); 
        
    } 
}