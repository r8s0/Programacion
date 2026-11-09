package hojaEjercicios_Bucles;

public class DadoAleatorio {
    
    public static void main(String[] args) {
     
        /* Generar una aplicación donde se tire de forma aleatoria un dado.
        Generar un numero aleatorio prohibido que si sale se acaba la aplicación 
        y mostrar la suma de los resultados que han ido saliendo y el numero de tiradas al finalizar.*/
            
                int numeroProhibido, numDado, suma, numeroTirada, tiradaValida;
                
                numeroProhibido = (int) (Math.random() * 6) + 1;
                System.out.println("El numero prohibido ha sido generado.");
                
                numDado = (int) (Math.random() * 6) + 1;
                suma = 0;
                tiradaValida = 0;
               
                // Bucle para calcular las tiradas
                for (numeroTirada = 1; numDado != numeroProhibido; numeroTirada++){
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
