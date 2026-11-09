package Ejercicios_Libro_1;
import java.util.Scanner;

public class ComprobaciónSePuedeSalir {
    
    public static void main(String[] args) {
    
        /* Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que in-
        fluirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas. Solo pc»
        dremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas, Existe una
        opción en la que. indistintamente de 10 anterior. podremos salir a la calle: el hecho de que
        tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro. etc.). Solici-
        tar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir
        a la biblioteca. EI algoritmo debe mostrar mediante un booleano (true 0 false) si es
        sible que Se le otorgue permiso para ir a la calle.*/

        boolean llueve;
        boolean AcabadoTareas;
        boolean SalirBiblioteca;
        boolean puede_salir;

        System.out.println("Responda las siguientes preguntas mediante true/false: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Esta lloviendo?: ");
        llueve = sc.nextBoolean();

        System.out.println("Has acabado las tareas?: ");
        AcabadoTareas = sc.nextBoolean();

        System.out.println("Necesitas salir a la biblioteca?: ");
        SalirBiblioteca = sc.nextBoolean();

        puede_salir = !llueve && AcabadoTareas || SalirBiblioteca;
        System.out.println("Puedes salir?: " + puede_salir);
        
    }
    
}
