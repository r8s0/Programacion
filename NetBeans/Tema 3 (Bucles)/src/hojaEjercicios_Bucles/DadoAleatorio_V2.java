package hojaEjercicios_Bucles;
import java.util.Scanner;

public class DadoAleatorio_V2 {
    
    public static void main(String[] args) {
     
        /* Generar una aplicación donde se tire de forma aleatoria un dado.
        Generar un numero aleatorio prohibido que si sale se acaba la aplicación 
        y mostrar la suma de los resultados que han ido saliendo y el numero de tiradas al finalizar. Preguntar al usuario cuantas tiradas máximas quiere.*/
                
                Scanner sc = new Scanner(System.in);
                
                int numeroProhibido, numDado, suma, numeroTirada, tiradaValida, numeroSolicitado;
                
                numeroProhibido = (int) (Math.random() * 6) + 1;
                System.out.println("El numero prohibido ha sido generado.");
                
                System.out.println("Introduczca el numero maximo de tiradas que desea tener: ");
                numeroSolicitado = sc.nextInt();
                    while (numeroSolicitado < 1){
                        System.out.println("El numero es invalido. Introduce un numero de tiradas mayor que 1. ");
                        numeroSolicitado = sc.nextInt();
                    }
                
                numDado = (int) (Math.random() * 6) + 1;
                
                suma = 0;
                tiradaValida = 0;
               
                // Bucle para hacer máximo las tiradas que me pide el usuario. Puede salir el numero prohibido antes de esa tirada si el numero de tiradas es muy alto.
                for (numeroTirada = 1; numDado != numeroProhibido && numeroSolicitado > numeroTirada; numeroTirada++){
                    tiradaValida++;
                    numDado = (int) (Math.random() * 6) + 1;
                    suma += numDado;
                    System.out.println("Tirada " + numeroTirada + ": has sacado " + numDado + " (total: " + suma + ")");
                }
                // Resultados finales
                System.out.println("Ha salido el valor prohibido (" + numeroProhibido + ")!");
                System.out.println();
                System.out.println("Juego terminado.");
                System.out.println("Numero de tiradas validas: " + tiradaValida);
                System.out.println("Total acumulado: " + suma);
    }    
}
