package Ejercicios_iniciales;
import java.util.Scanner;

public class MediaAritmética {
    
    public static void main(String[] args) { 
        
        System.out.println("Deme la primera nota entera para calcular la media aritmetica: ");
        Scanner sc = new Scanner(System.in);
        double primera_nota = sc.nextDouble();
        System.out.println("Deme la segunda nota entera para calcular la media aritmetica: ");
        double segunda_nota = sc.nextDouble();
        double media = ( primera_nota + segunda_nota ) / 2;
        System.out.println("La media es: " + media);

    }
    
}
