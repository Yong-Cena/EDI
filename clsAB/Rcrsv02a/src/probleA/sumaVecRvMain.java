package probleA;

/**
 * Sumatoria entera Recursiva
 * @author EDg3
 */
public class sumaVecRvMain {
    
    public static void main(String[] args) {
        int ne = 3;
        double [] F = {3.2, 4., 5.};
        double [] G = {6., -9., 5.1};
        
        
        double [] Resul= new double [G.length];
        sumVecdRv(Resul,F,G,G.length-1);
        
        System.out.println(impVecdRvIzDe(Resul,G.length-1));
    }    

    /**
     * Suma matricial de dos vectores double (arreglos de una dimension).
     * Decide que parametros se necesitan y que tipo de resultado se requiere. 
     * iu tiene el indice del último elemento del vector.
     * Los tres vectores A, B, y R, ya vienen construidos con igual cantidad de elementos
     */    
    public static void sumVecdRv(double [] R, double [] A, double [] B, int iu ) {
        if(iu<=0)
        {
            R[0]= A[0]+B[0];
        }
        else
        {
            sumVecdRv(R,A,B,iu-1);
            R[iu]=A[iu]+B[iu];
        }

    }        

    // 28b)-Impresion izquierda a derecha, recursivo
    // index, posición inicial del último elemento.
    public static String impVecdRvIzDe(double [] Vi, int index) { 
        String result;
        if( index <= 0 ) {  // Caso o casos base
            result= "" + Vi[0];
        } else {  // Caso o casos recursivos, index > 0
            result= impVecdRvIzDe(Vi, index-1)  + " " + Vi[index];
        }
        return result;
    }            

    // RECURSIVIAD INDIRECTA
        // TODO ...

    
}
