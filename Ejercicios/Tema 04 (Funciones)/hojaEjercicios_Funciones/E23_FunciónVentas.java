package hojaEjercicios_Funciones;
import java.util.Scanner;

public class E23_FunciónVentas {
    
    /**
     * Función mostrarMenu
     * @return opcion
     * ENTRADA: pedir "opcion"
     * PROCESO: se debe leer la opción introducida por el usuario
     * SALIDA: imprime el menú de opciones y devuelve "opción"
     */
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
    
    /**
     * Función agregarVenta
     * @return valorVenta
     * ENTRADA: pedir "valorVenta"
     * PROCESO: validar que el precio es 0 o positivo para registrar una venta
     * SALIDA: imprimir mensaje "Venta registrada" y devuelve "valorRenta"
     */
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
    
    /**
     * Función mostrarTotalVentas
     * @param total 
     * ENTRADA: dan variable "total" de tipo double
     * PROCESO: nada
     * SALIDA: imprimir el dinero total acumulado
     */
    static void mostrarTotalVentas(double total){
        
        System.out.println("El total acumulado de ventas es: " + total + " euros.");
        System.out.println("");
        
    }
    
    /**
     * Función mostrarNumeroVentas
     * @param contadorVentas 
     * ENTRADA: dan variable "contadorVentas" de tipo int
     * PROCESO: nada
     * SALIDA: imprimir el número de ventas realizadas
     */
    static void mostrarNumeroVentas(int contadorVentas){
        
        System.out.println("Se han registrado " + contadorVentas + " ventas.");
        System.out.println("");
        
    }
    
    /**
     * Función principal
     * @param args 
     * ENTRADA: nada
     * PROCESO: llamar a las funciones necesarias en función de la opción elegida,
     añadir contador por cada venta añadida, y salir del programa.
     * SALIDA: nada
     */
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
