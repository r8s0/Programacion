package hojaEjercicios_Bucles;

public class EstiramientoCuerda {
    
    public static void main(String[] args) {
     
        /* Escribe un programa que simule el comportamiento de una cuerda elástica (imprimiendo por pantalla
        asteriscos separados por espacios blancos). Vamos a estirar la cuerda de forma indefinida hasta que se rompa.
        Sabemos que la cuerda se rompe cuando el valor de ruptura (nº aleatorio) sea igual o inferior al valor de
        fuerza aplicado sobre la cuerda (nº aleatorio). Utilizaremos break y continue.
        La fuerza aplicada a la cuerda viene representada por un valor aleatorio en el rango [1..10].
        El punto de ruptura de la cuerda viene representado por un desplazamiento fijo [7] + un valor aleatorio en el
        rango [1..3]. Por tanto, para cada ejecución del programa, variará en el margen [7..10].
        EJEMPLO DE EJECUCIÓN:
        PUNTO DE RUPTURA EN ... 8
        * estiramiento = 1
        * * * * * * estiramiento = 6
        * estiramiento = 1
        * * * * * * * estiramiento = 7
        * * * * * * * estiramiento = 7
        * * * * * * estiramiento = 6
        LA CUERDA SE HA ROTO CON ESTIRAMIENTO = 8
        FIN DE PROGRAMA */
            
                int desplazamientoFijo = 7;
                int numeroAleatorio = (int) (Math.random() * 4);
                int puntoRuptura = desplazamientoFijo + numeroAleatorio;
                int estiramiento = 1;
                
                System.out.println("PUNTO DE RUPTURA EN ... " + puntoRuptura);
                
                while (estiramiento >= 1){
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
