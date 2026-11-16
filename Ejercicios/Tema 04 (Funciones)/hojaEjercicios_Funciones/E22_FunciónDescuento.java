package hojaEjercicios_Funciones;
import java.util.Scanner;

public class E22_FunciónDescuento {
    
    static void calcularTotal(){
        
        int numPrecios;
        double precio;
        double totalSinDescuento = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Cuantos precios quieres introducir?: ");
        numPrecios = sc.nextInt();
        System.out.println("");
        
        if (numPrecios < 0){
            
            do{
                
                System.out.println("Numero invalido. Introduce un numero mayor que 0: ");
                numPrecios = sc.nextInt();
                
            }while(numPrecios < 0);
            System.out.println("");
            
        }
        
        for(int x = 1; numPrecios >= x; x++){
            
            System.out.print("Introduce el precio " + x + ": ");
            precio = sc.nextDouble();
            
            if (precio < 0){
                
                do{
                    System.out.print("Precio invalido. Introduce el precio " + x + ": ");
                    precio = sc.nextDouble();
                }while(precio < 0); 
                System.out.println("");
            }
            
            totalSinDescuento = precio + totalSinDescuento; // TAMBIÉN SE PUEDE CON: "totalSinDescuento += precio"
        }

        System.out.println("El total sin descuento es: " + totalSinDescuento);
        
        if (totalSinDescuento < 100){
            System.out.println("No se aplico ningun descuento.");
        }
        else{
            System.out.println("Se aplico un descuento del 10%."); 
            System.out.println("El total con descuento es: " + aplicarDescuento(totalSinDescuento));
        }
        
    }
    
    static double aplicarDescuento(double totalSinDescuento){
        
        double totalConDescuento = 0;
        
        if (totalSinDescuento>100){
            totalConDescuento = totalSinDescuento * 0.90;
        }
        
        return totalConDescuento;
    }
    
    public static void main(String[] args){
        calcularTotal();
    }
}
