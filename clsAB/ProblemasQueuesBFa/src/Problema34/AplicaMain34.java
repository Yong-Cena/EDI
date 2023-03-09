package Problema34;
import Queues.*;
import Sets.*;
import java.util.Iterator;
import ADTsException.ADTsException;

/**
 * Aplicacion con Queues, problema 34
 * @author EDI
 */
public class AplicaMain34 {

    public static void main(String[] args) {
                
        CArrayQueue<Double> colaD = new CArrayQueue(8);        
        colaD.enqueue(110.0);    colaD.enqueue(220.0);
        colaD.enqueue(330.0);    colaD.enqueue(330.0);    colaD.enqueue(330.0);
        colaD.enqueue(550.0);    colaD.enqueue(660.0);

        System.out.println("C- ColaD original: \n  " + colaD.toString());

        quitaRepetidosQg(colaD);
        System.out.println("D- ColaD sin repetidos: \n  " + colaD.toString());

        
        System.out.println("ADIOS");
    }

    /**
     * Ejercicio 34.
     * Quita los elementos repetidos de una cola generica.
     * Los elementos repetidos se encuentran en posiciones consecutivas.
     * Ahora con estructura auxiliar "set".
     */
    public static <T> void quitaRepetidosQg(CArrayQueue<T> Cgc) {
        if ( Cgc == null )
            throw new ADTsException("(quitaRepetidosQg) parametro null.\n");
    
        ArraySet<T> setAux= new ArraySet(Cgc.length());
        
        while(!Cgc.isEmpty())
        {
            setAux.add(Cgc.dequeue());
        }
        
        Iterator<T> setit= setAux.iterator();
        
        while(setit.hasNext())
        {
            Cgc.enqueue(setit.next());
        }
    }
    
}