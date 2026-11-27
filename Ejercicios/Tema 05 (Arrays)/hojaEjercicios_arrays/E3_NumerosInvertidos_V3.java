package hojaEjercicios_arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E3_NumerosInvertidos_V3 {
    
    static int leerNumero(Scanner sc){
        
        int elementos = 0;
        boolean valido = false;
        
        do{
            try{
                elementos = sc.nextInt();
                while(!valido){
                    if(elementos <= 0){
                        System.out.println("Error: tiene que haber al menos un numero en los elementos.");
                        System.out.println("Introduce cuantos numeros deseas introducir: ");
                        elementos = sc.nextInt();
                    }
                    else{
                        valido = true; 
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("Error: solo se admiten numeros. Pruebe de nuevo.");
                sc.nextLine();
            }
        }while (!valido);
        return elementos;   
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce cuantos numeros deseas introducir: ");
        
        int [] numeros = new int [leerNumero(sc)];
        
        for(int i = 0; i < numeros.length; i++){
            
            boolean valido = false;
            
            do{
                try{
                    System.out.print("Introduce el elemento " + (i + 1) + ":");
                    numeros[i] = sc.nextInt();  
                    valido = true;
                } catch (InputMismatchException e){
                    System.out.println("Error: solo se admiten numeros. Pruebe de nuevo.");
                    sc.nextLine();
                }
            }while(!valido); 
            
        }
        System.out.println("");
        
        System.out.println("Contenidos del array invertidos: ");
        for(int i = (numeros.length - 1); i >= 0; i--){
            
            System.out.println("enteros [" + i + "] = " + numeros[i]);
        }
        
    }
            
}