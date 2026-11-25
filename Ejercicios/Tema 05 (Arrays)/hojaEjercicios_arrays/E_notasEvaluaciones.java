package hojaEjercicios_arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E_notasEvaluaciones {
    /* escribir un programa en java que solicite al usuario las notas de las 
    tres evaluaciones de un alumno, las almacene en un array y si la media 
    aritmética de las calificaciones es superior a 8, modifique el array 
    sumando 1 punto a cada una de las notas almacenadas. */
    
    static void leerNotas(double[] notas, Scanner sc){
        
        for(int i = 0; i < notas.length; i++){
            
            boolean valido = false;
            
            while (!valido){
                
                try{
                    System.out.print("Introduce la nota " + (i + 1) + ":");
                    notas[i] = sc.nextDouble();
                    if (notas[i] >= 0 && notas[i] <= 10){
                        valido = true;
                    }
                    else{
                        System.out.println("La nota tiene que ser entre 0 y 10.");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Error. Solo se admiten numeros. Pruebe de nuevo.");
                    sc.nextLine();
                }
                
            }
            
        }
        System.out.println("");
    }
    
    static double calcularMedia(double[] notas){
        
        double sumaNotas = 0;
        
        for(int i = 0; i < notas.length; i++){
            sumaNotas += notas[i];
        }
        return sumaNotas / notas.length;
        
    }
    
    static void subirNotas(double[] notas){
        
        for(int i = 0; i < notas.length; i++){
            
            if(notas[i] <= 9){
                notas[i]++;
            }
            else{
                notas[i] = 10;
            }
            
        }
    }
    
    static void mostrarNotas(double[] notas){
        
        System.out.println("Notas finales: ");
        
        for(int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] notas = new double [3];
        
        leerNotas(notas, sc);
        
        double media = calcularMedia(notas);
        
        System.out.println("Media inicial: " + media);
        if(media > 8){
            subirNotas(notas);
            System.out.println("Se suma 1 punto a cada nota.");
        }
        System.out.println("");
        
        mostrarNotas(notas);
       
    }
}
