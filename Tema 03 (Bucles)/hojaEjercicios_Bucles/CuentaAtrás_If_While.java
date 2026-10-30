package hojaEjercicios_Bucles;
import java.util.Scanner;

public class CuentaAtrás_If_While {
    
    public static void main(String[] args) {
        
        /* Escribe un programa en java que pida al usuario un número entero positivo y luego imprima una cuenta atrás
        desde ese número hasta 0, uno por uno. Después de llegar a 0, el programa debe imprimir "¡Despegue!". Usa
        un bucle while o do-while según lo que prefieras. Pista: El bucle while debería detenerse cuando el contador
        llega a 0. */
     
        Scanner sc = new Scanner(System.in);
        int numero;
     
        do {
            System.out.println("Introduce un numero entero positivo: ");
            numero = sc.nextInt();
        } while (numero < 0);


        // Procesamiento del numero positivo validado
        if (numero > 0) {
            while (numero >= 0){
            System.out.println(numero);
            numero--;
            }
            System.out.println("¡Despegue!");
        }
        else {
            System.out.println("Solo se admiten numeros positivos.");
        }
    }
}
