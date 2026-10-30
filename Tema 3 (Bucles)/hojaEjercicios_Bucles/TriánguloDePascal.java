package hojaEjercicios_Bucles;

public class TriánguloDePascal {
    
    public static void main(String[] args) {
     
        /* Diseña y desarrolla un programa en Java que muestre por pantalla el triángulo de Pascal con el número de
        filas que indique el usuario.
        El programa debe solicitar al usuario un número entero positivo n, que representará el número de filas que
        tendrá el triángulo.
        Para construir el triángulo, se deben seguir estas reglas:
        1. La primera fila tiene un único elemento: 1.
        2. Cada fila comienza y termina con el número 1.
        3. Los elementos intermedios se calculan utilizando la siguiente
        fórmula:E(f,m)=f!m!⋅(f−m)!E(f,m)=\frac{f!}{m!\cdot(f-m)!}
        Donde:
        ○ f es el número de la fila.
        ○ m es la posición del elemento dentro de esa fila.
        ○ El número de filas y las posiciones de los elementos comienzan a numerarse desde 0.
        ○ El símbolo ! representa el factorial de un número. Por ejemplo, 4! = 4 × 3 × 2 × 1 = 24.
        Por definición, 0! = 1.
        Ejemplo de ejecución
        Si el usuario introduce 5, el programa debe mostrar:
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1*/
            
                int desplazamientoFijo = 7;
                int numeroAleatorio = (int) (Math.random() * 3) + 1;
                int puntoRuptura = desplazamientoFijo + numeroAleatorio;
                int estiramiento;
                
                System.out.println("PUNTO DE RUPTURA EN ... " + puntoRuptura);
                
                for ( ;; ){
                    estiramiento = (int) (Math.random() * 10) + 1;
                    
                    if (puntoRuptura <= estiramiento){
                        break;
                    }
                    if (puntoRuptura > estiramiento) {
                        for (int asteriscos = 1; asteriscos <= estiramiento; asteriscos++){
                            System.out.print("* ");
                        }
                    
                        System.out.println(" estiramiento = " + estiramiento);
                        continue;
                    }
                }
                System.out.println("LA CUERDA SE HA ROTO CON ESTIRAMIENTO = " + estiramiento);
                System.out.println("FIN DE PROGRAMA");
    }
}