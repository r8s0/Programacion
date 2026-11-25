package hojaEjercicios_arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E_notasEvaluaciones {
    /* escribir un programa en java que solicite al usuario las notas de las 
    tres evaluaciones de un alumno, las almacene en un array y si la media 
    aritmética de las calificaciones es superior a 8, modifique el array 
    sumando 1 punto a cada una de las notas almacenadas. */
    
    static void leerNotas(double[] notas, Scanner sc){
        
        
        double nota1, nota2, nota3;
        
        boolean valido = false;
        
        while (!valido){
            try{
                System.out.print("Introduce la nota 1: ");
                nota1 = sc.nextDouble();
                if (nota1 >= 0 && nota1 <= 10){
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
        
        valido = false;
        while (!valido){
            try{
                System.out.print("Introduce la nota 2: ");
                nota2 = sc.nextDouble();
                if (nota2 >= 0 && nota2 <= 10){
                    valido = true;
                }
            }catch (InputMismatchException e){
                System.out.println("Error. Solo se admiten numeros. Pruebe de nuevo.");
                sc.nextLine();
            } 
        }
        
        valido = false;
        while (!valido){
            try{
                System.out.print("Introduce la nota 3: ");
                nota3 = sc.nextDouble();
                if (nota3 >= 0 && nota3 <= 10){
                    valido = true;
                }
            }catch (InputMismatchException e){
                System.out.println("Error. Solo se admiten numeros. Pruebe de nuevo.");
                sc.nextLine();
            } 
        }
        System.out.println("");
    }
    
    static double calcularMedia(double[] notas){
        return (notas[0] + notas [1] + notas[2]) / 3;
    }
    
    static void subirNotas(double[] notas){
        for(int i = 0; i < notas.length; i++){
        notas[i]++;
        }
    }
    
    static void mostrarNotas(double[] notas){
        System.out.println("Notas finales: ");
        for(int i=0;i<3;i++){
            System.out.println("Nota " + (i+1) + ":" + notas[i]);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] notas = new double [3];
        
        leerNotas(notas, sc);
        
        calcularMedia(notas);
        double media = calcularMedia(notas);
        
        System.out.println("Media inicial: " + media);
        if(media >= 8 && media < 10){
            subirNotas(notas);
            System.out.println("Se suma 1 punto a cada nota.");
        }
        
        mostrarNotas(notas);
        
        
        
    }
}
