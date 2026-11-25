package hojaEjercicios_arrays;

public class E1_MismaReferencia {
    
    public static void main(String[] args) {
        int[] tabla = {1,2,3,4,5,6,7,8,9,10};
        int [] tabla2 = {11,12,13,14,15,16,17,18,19,20};
        tabla2 = tabla;
        int [] tabla3 = {21,22,23,24,25,26,27,28,29,30};
        tabla3 = tabla;
        
        System.out.println("Referencia tabla 1:" + tabla);
        System.out.println("Referencia tabla 2:" + tabla2);
        System.out.println("Referencia tabla 3:" + tabla3);
    }
}
