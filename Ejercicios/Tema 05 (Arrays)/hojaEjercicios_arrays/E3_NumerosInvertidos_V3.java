package hojaEjercicios_arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E3_NumerosInvertidos_V3 {
    
    static int leerNumero(){
        Scanner sc = new Scanner(System.in);
        int elementos = 0;
        boolean valido = false;
        
        do{
            
            try{
                elementos = sc.nextInt();
                while(!valido){
                    if(elementos <= 0){
                        System.out.println("Error. Tiene que haber al menos un numero.");
                    }
                    else{
                        valido = true; 
                    }
                    elementos = sc.nextInt();
                }
                
            }catch(InputMismatchException e){
                System.out.println("Error. Solo se admiten numeros. Pruebe de nuevo.");
                sc.nextLine();
            }
            
        }while (!valido);
        
        return elementos;        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce cuantos numeros deseas introducir: ");
        
        int [] numeros = new int [leerNumero()];
        
        for(int i = 0; i < numeros.length; i++){
            
            boolean valido = false;
            
            do{
                try{
                    System.out.print("Introduce el elemento " + (i + 1) + ":");
                    numeros[i] = sc.nextInt();  
                    valido = true;
                } catch (InputMismatchException e){
                    System.out.println("Error. Solo se admiten numeros. Pruebe de nuevo.");
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