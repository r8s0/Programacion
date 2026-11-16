package hojaEjercicios_Funciones;
import java.util.Scanner;

public class E23_FunciónVentas {
    
    static int mostrarMenu(){
        int opcion;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("==== MENU DE REGISTRO DE VENTAS ====");
        System.out.println("1. Añadir nueva venta");
        System.out.println("2. Ver total de ventas");
        System.out.println("3. Ver numero de ventas");
        System.out.println("4. Salir");
        System.out.print("Elige una opcion: ");
        
        do{
            opcion = sc.nextInt(); 
            if (opcion < 1 || opcion > 4){
                System.out.println("Opcion invalida. Introduce un numero del 1 al 4: ");
            }
        }while(opcion < 1 || opcion > 4);
        
        System.out.println("");
        
        return opcion;
    }
    
    static double agregarVenta(){
        Scanner sc = new Scanner(System.in);
        double valorVenta;
        
        System.out.println("Introduce el valor de la venta: ");
        do{
            valorVenta = sc.nextDouble();
            if (valorVenta < 0){
                System.out.println("Valor invalido. Introduce un valor de venta mayor o igual que 0: ");
            }
        }while(valorVenta < 0);
        
        System.out.println("Venta registrada.");
        System.out.println("");
        
        return valorVenta;
    }
    
    static void mostrarTotalVentas(double total){
        System.out.println("El total acumulado de ventas es: " + total + " euros.");
        System.out.println("");
    }
    
    static void mostrarNumeroVentas(int contadorVentas){
        System.out.println("Se han registrado " + contadorVentas + " ventas.");
        System.out.println("");
    }
    
    public static void main(String[] args){
        double total = 0;
        int contadorVentas = 0;
        
        int opcion = mostrarMenu();
        
        while (opcion != 4){
          
            switch (opcion){
                
                case 1 -> {
                    total += agregarVenta();
                    contadorVentas++;
                }
                case 2 -> {
                    mostrarTotalVentas(total);
                }
                case 3 -> {
                    mostrarNumeroVentas(contadorVentas);
                }
                
            }
            
            opcion = mostrarMenu();
            
        }
        
        System.out.println("FIN DEL PROGRAMA");
        
    }
    
}
