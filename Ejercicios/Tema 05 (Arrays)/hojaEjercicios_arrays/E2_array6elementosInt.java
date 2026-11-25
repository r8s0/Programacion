package hojaEjercicios_arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E2_array6elementosInt {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int[] enteros = new int [6];
        
        for(int i = 0; i < enteros.length; i++){
            
            boolean valido = false;
            
            while (!valido){
                
                try{
                    
                    System.out.print("Introduce el elemento " + (i + 1) + ":");
                    enteros[i] = sc.nextInt();
                    valido = true;
                    System.out.println("");
                    
                } catch (InputMismatchException e){
                    
                    System.out.println("Error. Solo se admiten numeros. Pruebe de nuevo.");
                    sc.nextLine();
                    
                }
                
            }
              
        }
        
        System.out.println("");
        
        System.out.println("Contenido del array: ");
        for(int i = 0; i < enteros.length; i++){
            
            System.out.println("enteros [" + i + "] = " + enteros[i]);
        
        }
    }
    
}
