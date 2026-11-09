package hojaEjercicios_Bucles;

import java.util.Scanner;

public class AlumnosAprobadosCondicionadosSuspensos {
    
    public static void main(String[] args) {
     
        /* Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual a cuatro) y suspensos. */
     
        Scanner sc = new Scanner(System.in);
     
        int nota, alumnoSuspenso, alumnoCondicionado,alumnoAprobado;
     
     
        alumnoSuspenso = 0;
        alumnoCondicionado = 0;
        alumnoAprobado = 0;
 
            /* Bucle for: porque nos dice la cantidad de repeticiones que hay que hacer*/
            for (int contador = 1; contador <= 6; contador++){
            
                // Bucle do-while: se repite hasta que la nota sea válida (0-10)
                do {
                    System.out.println("Introduce la nota" + contador + " del 0 al 10: ");
                    nota = sc.nextInt();
                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota invalida. Solo se admiten notas del 0 al 10.");
                    }
                } while (nota < 0 || nota > 10);
            
                switch (nota) {
                    case 0,1,2,3 ->
                        alumnoSuspenso++;
                    case 4 ->
                        alumnoCondicionado++;
                    case 5,6,7,8,9,10 ->
                       alumnoAprobado++;
                }
            }
        
        System.out.println("Alumnos aprobados: " + alumnoAprobado);
        System.out.println("Alumnos condicionados: " + alumnoCondicionado);
        System.out.println("Alumnos suspensos: " + alumnoSuspenso);  
        
    }

}