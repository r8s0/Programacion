package hojaEjercicios_Bucles;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    
    public static void main(String[] args) {
        
     /* Escribe un programa en Java que genere un número aleatorio entre 1 y 1000. El usuario debe adivinar el
     número.
     Cada vez que el usuario introduzca un número, el programa le dirá si el número es demasiado bajo, demasiado
     alto o correcto.
     El programa debe continuar hasta que el usuario adivine el número correctamente.
     Nota: Para generar un número aleatorio puedes utilizar el método nextInt(bound) de la clase Random, donde
     bound define el valor límite superior. Esta clase forma parte del paquete java.util, por lo que debes importarla
     antes de usarla. Para obtener un número entre 1 y 1000, necesitas sumar 1 al resultado, ya que nextInt(1000)
     generaría un número entre 0 y 999.*/
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1000) +1;
        int numero;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero positivo entre 1 y 1000: ");
        numero = sc.nextInt();
        
            // Si el numero es negativo, cero o mayor que 1000, da ERROR
            if (numero <= 0 || numero > 1000) {
            System.out.println("Numero invalido. El numero tiene que ser entero y positivo entre 1 y 1000.");
            }
            else{
                while (numero != numeroAleatorio){  // Pide números positivos
                  
                  if (numero <= 0 || numero > 1000){
                     System.out.println("Numero invalido. El numero tiene que ser entero y positivo entre 1 y 1000."); 
                  }
                  else if (numero < numeroAleatorio){
                     System.out.println("El numero es mayor.");
                  }
                  else if (numero > numeroAleatorio){
                     System.out.println("El numero es menor.");
                  }
 
                  System.out.println("Introduce otro numero entero positivo entre 1 y 1000: ");
                  numero = sc.nextInt();
                  
                }
                
                    System.out.println("Has acertado el numero. Enhorabuena!");    
                    
                }
                
    }    
}
