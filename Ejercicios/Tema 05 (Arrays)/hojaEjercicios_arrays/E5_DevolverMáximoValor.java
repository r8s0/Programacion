package hojaEjercicios_arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E5_DevolverMáximoValor {
    
    static int maximo(int t[], Scanner sc){
        
        int num;
        int valorMaximo = t[0];
        boolean valido;
        
        for(int i = 0; i < t.length; i++){
            
            do{
                valido = false;
                try{
                    System.out.print("Introduce el " + (i+1) + " numero: ");
                    num = sc.nextInt();
                    if(num > valorMaximo){
                        valorMaximo = num;
                    }
                    valido = true;
                }catch (InputMismatchException e){
                    System.out.println("Error: solo se admiten numeros enteros. Pruebe de nuevo.");
                    sc.nextLine();
                    System.out.println("");
                }
            }while(!valido);
            System.out.println("");
        }
        return valorMaximo;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        int cantidad = 0;
        
        do{
            try{
                System.out.print("Introduce la longitud del array: ");
                cantidad = sc.nextInt();
                if (cantidad <= 0){
                    System.out.println("Error: el array debe tener al menos un numero. Pruebe de nuevo.");
                } else{
                    valido = true;
                }
            }catch(InputMismatchException e){
                System.out.println("Error: solo se admiten numeros enteros. Pruebe de nuevo.");
                sc.nextLine();
            } 
            System.out.println("");
        }while(!valido);
        
        int[] t = new int[cantidad];
        
        int valorMaximo = maximo(t, sc);
        System.out.println("El valor maximo del array es: " + valorMaximo);
        
    }
    
}