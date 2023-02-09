package Problema14;
import Stacks.*;

/**
 * Problema 14
 * @author EDI
 */
public class AplicaMain14 {

    public static void main(String[] args) {
        ArrayStack<String> pilaStr= new ArrayStack<String>(20);
        pilaStr.push("a1");    pilaStr.push("b1");    pilaStr.push("c1");
        System.out.println("14.1: Pila original: \n" +
                pilaStr.toString() );
        
        int canti = cantElemPila(pilaStr);
        System.out.println("    Cant. de elementos de la pila: " + canti);
        System.out.println("\n14.2: Pila despues de cantElemPila: \n" +
                pilaStr.toString() );
        
        try{
            canti = cantElemPila(null);
        } catch ( Exception ex) {
            System.out.println("\n14.3: referencia null de pila.\n    " + ex.toString());
        }

    }
    
    // Cuenta la cantiada de elementos que hay en la pila sin usar size().
    public static <T> int cantElemPila( ArrayStack<T> pila ) {
        if (pila == null)
            throw new ADTsException("(cantElemPila) pila referencia a null.\n");
        
        ArrayStack<T> pilaAux= new ArrayStack<T>();    // Stack auxiliar
        int cant= 0;

        //Cuenta la cantidad de elementos de la pila.
        // ????

        //Devuelve la pila a su estado original.
        // ????

        return cant;        
    }
    
}
