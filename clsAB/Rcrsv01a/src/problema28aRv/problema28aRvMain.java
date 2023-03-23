package problema28aRv;

/**
 * Problema 28a
 * @author EDg1
 */
public class problema28aRvMain {

    public static void main(String[] args) {
        int vc, n;
        int Veci [] = {101, 202, 303, 404, 505};
        
        // Imprimiendo de der a izq, indices n-1..0
        System.out.print("\nDe->Iz: [");
        int posUlt= Veci.length-1;
        String imp= impVeciRvDeIz(Veci, posUlt);
        System.out.println(imp + "]");
        
    }

    // Impresion derecha a izquierda, recursivo
    public static String impVeciRvDeIz(int [] Vi, int index) {   
        // TODO ...
        return "vacio";
    }            
    
}
