package Problema34;
import Queues.*;
import ADTsException.ADTsException;

/**
 * Aplicacion con Queues, problema 34
 * @author EDI
 */
public class AplicaMain34 {

    public static void main(String[] args) {
                
        CArrayQueue<Double> colaD = new CArrayQueue(8);        
        colaD.enqueue(110.0);    colaD.enqueue(220.0);
        colaD.enqueue(330.0);    colaD.enqueue(330.0);
        colaD.enqueue(550.0);    colaD.enqueue(660.0);

        System.out.println("C- ColaD original: \n  " + colaD.toString());

        quitaRepetidosQg(colaD);
        // comprobación del estado de la queue
        System.out.println("C- ColaD sin repetir: \n  " + colaD.toString());

        System.out.println("ADIOS");
    }

    /**
     * Ejercicio 34.
     * Quita los elementos repetidos de una cola generica.
     * Los elementos repetidos se encuentran en posiciones consecutivas.
     */
    public static <T> void quitaRepetidosQg(CArrayQueue<T> Cgc) {
        if ( Cgc == null )
            throw new ADTsException("(quitaRepetidosQg) parametro null.\n");
    
        CArrayQueue<T> aux= new CArrayQueue(Cgc.length());
        T obj;
        while(!Cgc.isEmpty())
        {
            obj=Cgc.dequeue();
            if(!obj.equals(aux.last()))
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