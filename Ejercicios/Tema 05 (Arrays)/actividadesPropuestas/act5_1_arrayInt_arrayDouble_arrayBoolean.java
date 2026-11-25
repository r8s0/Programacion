
package actividadesPropuestas;

public class act5_1_arrayInt_arrayDouble_arrayBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] enteros = {1,4,7,10,13};
        System.out.println("***** Array enteros *****");
        for(int i = 0; i < enteros.length; i++){
            System.out.println(i + ":" + enteros[i]);
        }
        System.out.println("*************************");
        System.out.println("");
        
        double [] reales = {1.3,4.3,6.7,9.3,5.2};
        System.out.println("****** Array reales ******");
        for(int j = 0; j < enteros.length; j++){
            System.out.println(j + ":" + reales[j]);
        }
        System.out.println("*************************");
        System.out.println("");
        
        boolean [] booleanos = {true,true,false,true,false};
        System.out.println("**** Array booleanos ****");
        for(int k = 0; k < enteros.length; k++){
            System.out.println(k + ":" + booleanos[k]);
        }
        System.out.println("*************************");
        System.out.println("");
        
    }
    
}
