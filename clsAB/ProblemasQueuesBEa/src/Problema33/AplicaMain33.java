
package Problema33;
import Queues.*;
import Stacks.*;    // ArrayStack
import ADTsException.ADTsException;

/**
 * Aplicacion con Queues, problema 33
 * @author EDI
 */
public class AplicaMain33 {

    public static void main(String[] args) {
        
        CArrayQueue<Integer> colaI= new CArrayQueue(5);
        
        // Guardando en colaI {40, 50, 60, 70}
        colaI.enqueue(40); colaI.enqueue(50);
        colaI.enqueue(60); colaI.enqueue(70);
        System.out.println("A- ColaI original: \n  " + colaI.toString());

        invierteQg(colaI);
        // comprobación del estado de la queue
        System.out.println("A- ColaI invertida: \n"+colaI.toString());
        
        System.out.println("ADIOS");
        colaI.enqueue(-1); colaI.enqueue(-1);
        colaI.enqueue(-1); colaI.enqueue(-1);
        System.out.println(colaI.toString());
    }
    
    /**
     * Ejercicio 33.
     * Invertir el orden de los elementos de una cola genérica.
     * Puede usar, como auxiliar, cualquier estructura de datos.
     */
    public static <T> void invierteQg(CArrayQueue<T> Cgc) {
        if ( Cgc == null )
                throw new ADTsException("(invierteQg) parametro null.\n");
    
        ArrayStack <T> aux= new ArrayStack();
        while(!Cgc.isEmpty())
        {
            aux.push(Cgc.dequeue());
        }
        while(!aux.isEmpty())
        {
            Cgc.enqueue(aux.pop());
        }
    }
    
}