
package Problema21;
import Stacks.*;

/**
 *
 * @author EDI
 */
public class AplicaMain21 {


    public static void main(String[] args) {
        // TODO code application logic here
        // Problema 21

        ArrayStack<String> arstr = new ArrayStack(5);
        int n;
        arstr.push("uno");    arstr.push("dos");    arstr.push("tres");
        arstr.push("cuatro");    arstr.push("cinco");

        // Primera prueba 21a
        System.out.println("\n>>>> 21a.1) Pila original----");
        System.out.println("      arstr: " + arstr.toString()); 
        System.out.println("      size(arstr): " + arstr.size()); 
        // System.out.println("      maxSize(arstr): " + arstr.maxSize()); 
        
        arstr.push("seis");  // Agregando un elemento

        System.out.println(">>>> 21a.2) Pila resultante----");
        System.out.println("      arstr: " + arstr.toString());    
        System.out.println("      size(arstr): " + arstr.size()); 
        // System.out.println("      maxSize(arstr): " + arstr.maxSize()); 
        
       
        // Primera prueba 21b
        System.out.println("\n>>>> 21b.1) Pila original----");
        System.out.println("      arstr: " + arstr.toString());        
        n = 3;
        System.out.println("---- 21b.2) ---- multiPop(" + n + ")");
        System.out.println("    ¿Se pudo realizar: " + arstr.multiPop(n));
        System.out.println("---- 21b.3) Pila resultante----");
        System.out.println("      arstr: " + arstr.toString());    
        
        // Segunda prueba 21b
        System.out.println("\n>>>> 21b.4) Pila original----");
        System.out.println("      arstr: " + arstr.toString());        
        n = 4;
        System.out.println("---- 21b.5) ---- multiPop(" + n + ")");
        System.out.println("    ¿Se pudo realizar: " + arstr.multiPop(n));

        System.out.println("---- 21b.6) Pila resultante----");
        System.out.println("      arstr: " + arstr.toString());    
        
        // Tercera prueba 21b
        System.out.println("\n>>>> 21b.7) Pila original----");
        System.out.println("      arstr: " + arstr.toString());        
        n = -1;
        System.out.println("---- 21b.8) ---- multiPop(" + n + ")");
        System.out.println("    ¿Se pudo realizar: " + arstr.multiPop(n));    
        
        System.out.println("---- 21b.9) Pila resultante----");
        System.out.println("      arstr: " + arstr.toString());  

    }
    
}
