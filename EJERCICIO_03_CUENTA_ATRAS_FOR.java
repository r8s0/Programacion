
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class EJERCICIO_03_CUENTA_ATRAS_FOR {
    public static void main(String[] args) {
     /* Escribe un programa en java que pida al usuario un número entero positivo y luego imprima una cuenta atrás
     desde ese número hasta 0, uno por uno. Después de llegar a 0, el programa debe imprimir "¡Despegue!". Usa
     un bucle while o do-while según lo que prefieras. Pista: El bucle while debería detenerse cuando el contador
     llega a 0. */
     
     Scanner sc = new Scanner(System.in);
     
     int numero;
     
        do {
            System.out.println("Introduce un numero entero positivo mayor que cero: ");
            numero= sc.nextInt();
        } while (numero <= 0);

        // Procesamiento del numero positivo validado
        if (numero > 0) {
            for (;numero >= 0;numero--){
                System.out.println(numero);
            }
            System.out.println("Despegue!");
        }
    }    
}
