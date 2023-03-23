package problema28bRv;

/**
 * Problemaa 28b
 * @author EDg1
 */
public class problema28bRvMain {

    public static void main(String[] args) {
        int vc, n;
        int Veci [] = {101, 202, 303, 404, 505};
        
        // Imprimiendo de izq a der, indices 0..n-1
        System.out.print("Iz->De: [");
        int posUlt= Veci.length-1;
        String imp= impVeciRvIzDe(Veci, posUlt);
        System.out.println(imp + "]");
    }

    // Impresion izquierda a derecha, recursivo
    public static String impVeciRvIzDe(int [] Vi, int index) { 
        // TODO ...
        return "vacio";
    }        
    
}
