package hojaEjercicios_Funciones;
import java.util.Scanner;

public class E23_FunciónVentas {
    
    static int mostrarMenu(int opcion){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("==== MENU DE REGISTRO DE VENTAS ====");
        System.out.println("1. Añadir nueva venta");
        System.out.println("2. Ver total de ventas");
        System.out.println("3. Ver numero de ventas");
        System.out.println("4. Salir");
        System.out.println("Elige una opcion: ");
        opcion = sc.nextInt();
        
        return opcion;
    }
    
    public static void main(String[] args){
        
    
    }
    
}
