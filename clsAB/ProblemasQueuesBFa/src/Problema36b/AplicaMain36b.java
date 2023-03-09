package Problema36b;
import Queues.*;
import java.util.ArrayList;
import ADTsException.*;

/**
 * Problema 36
 * @author EDI
 */
public class AplicaMain36b {

    public static void main(String[] args) {        
        // Creacion de una Queue de Strings, y despliegue
        CArrayQueue<String> qs = new CArrayQueue(12);
        qs.enqueue("Uno");    qs.enqueue("Dos");    qs.enqueue("Tres");
        qs.enqueue("Cuatro");    qs.enqueue("Cinco");    qs.enqueue("Seis");
        qs.enqueue("Siete");    qs.enqueue("Ocho");    qs.enqueue("Nueve");
        qs.enqueue("Diez");
        System.out.print( "Cola qs: " + qs.toString() + "\n" );        

        // Prueba de los metodos del Problema
        System.out.println("\n36b.1)- multiQuita(qs,4)");
        ArrayList<String> als = multiQuita(qs,4);
        System.out.print( "Cola qs: " + qs.toString() + "\n" );
        System.out.println( "ArrayList als: " + als.toString() + "\n" ); 

        System.out.print( "Cola qs: " + qs.toString() + "\n" );         
        // Ahora quita 10 elementos
        System.out.println("\n36b.2)- multiQuita(qs,10)");
        als = multiQuita(qs,10);
        System.out.print( "Cola qs: " + qs.toString() + "\n" );
        System.out.println( "ArrayList als: " + als.toString() + "\n" ); 
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++
    // Problema 36
    // 36.b) Regresa un ArrayList almacenando los n elementos quitados de la cola
    public static <T> ArrayList <T> multiQuita(CArrayQueue<T> que, int n)
    {
        ArrayList <T> list= new ArrayList();
        
        while(list.size()<n && !que.isEmpty())
        {
            list.add(que.dequeue());
            
        }
        return list;
    }
    
    
}
