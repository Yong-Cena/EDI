package Problema35;
import Queues.*;
import ADTsException.ADTsException;

/**
 * Aplicacion con Queues, problema 35
 * @author EDI
 */
public class AplicaMain35 {

    public static void main(String[] args) {
        
        CArrayQueue<Integer> colaI = new CArrayQueue(10); 
        colaI.enqueue(33);    colaI.enqueue(22);
        colaI.enqueue(-33);    colaI.enqueue(44);
        colaI.enqueue(-33);    colaI.enqueue(-33);
        colaI.enqueue(55);    colaI.enqueue(66);

        System.out.println("E- ColaI original: \n  " + colaI.toString());

        int dato = -33;
        quitaElementoQg(colaI, dato);
        System.out.println("F- ColaI sin valores :" + dato +
                ":\n  " + colaI.toString());
        
        dato = 46;
        quitaElementoQg(colaI, dato);        
        // comprobación del estado de la queue
        System.out.println("E- ColaI sin elementos: \n  " + colaI.toString());

    }

    /**
     * Ejercicio 35.
     * Quitar de una cola generica, todas las ocurrencias de un elemento.
     */
    public static <T> void quitaElementoQg(CArrayQueue<T> Cgc,
            T elem) 
    {
        if ( Cgc == null || elem == null)
                throw new ADTsException("(quitaElementoQg) parametros null.\n");
        
        CArrayQueue<T> aux= new CArrayQueue(Cgc.length());
        T obj;
        while(!Cgc.isEmpty())
        {
            obj=Cgc.dequeue();
            if(!obj.equals(elem))
            {
                aux.enqueue(obj);
            }
        }
        while(!aux.isEmpty())
        {
            Cgc.enqueue(aux.dequeue());
        }
    }
    
}