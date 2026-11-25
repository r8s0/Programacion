package hojaEjercicios_arrays;
import java.util.Scanner;

public class E3_NumerosInvertidos_V1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int elementos;
        
        do{
            
            System.out.print("Introduce cuantos numeros deseas introducir: ");
            elementos = sc.nextInt();
            
            if(elementos <= 0){
                System.out.println("Error. Tiene que haber al menos un numero.");
            }
            
        }while (elementos <= 0);
        
        int [] numeros = new int [elementos];
        
        for(int i = 0; i < numeros.length; i++){
            
            System.out.print("Introduce el elemento " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        
        }
        System.out.println("");
        
        System.out.println("Contenidos del array invertidos: ");
        for(int i = (numeros.length - 1); i >= 0; i--){
            
            System.out.println("enteros [" + i + "] = " + numeros[i]);
        
        }
        
    }
            
}