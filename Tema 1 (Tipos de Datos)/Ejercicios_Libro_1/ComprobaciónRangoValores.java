package Ejercicios_Libro_1;

public class ComprobaciónRangoValores {
    
        public static void main(String[] args) {
            
        /* Escribir un programa que compruebe que el rango de valores de un 
        tipo se comporta de forma cíclica, es decir, el valor siguiente al máximo es el 
        valor mínimo.*/
        
            short num;
            num = 32767;
            
            System.out.println("Valor maximo del short: " + num);
            num++;
            System.out.println("Valor minimo del short: " + num);
    }
    
}
