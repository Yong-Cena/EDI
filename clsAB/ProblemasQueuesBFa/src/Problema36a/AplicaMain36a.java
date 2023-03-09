package Problema36a;
import Queues.*;
import ADTsException.*;
import java.util.ArrayList;

/**
 * Problema 36
 * @author EDI
 */
public class AplicaMain36a {

    public static void main(String[] args) {        
        // Creacion de una Queue de Strings, y despliegue
        CArrayQueue<String> qs = new CArrayQueue(12);
        qs.enqueue("Uno");    qs.enqueue("Dos");    qs.enqueue("Tres");
        qs.enqueue("Cuatro");    qs.enqueue("Cinco");    qs.enqueue("Seis");
        qs.enqueue("Siete");    qs.enqueue("Ocho");    qs.enqueue("Nueve");
        qs.enqueue("Diez");
        System.out.print( "Cola qs: " + qs.toString() + "\n" );        

        // Prueba de los metodos del Problema
        System.out.println("36a.1)- cuentaElementos(qs): " + cuentaElementos(qs) );
        System.out.println("    comprobando qs: \n  " + qs.toString());

        // Quitando cuatro elementos y agregando tres nuevos, en qs.
        qs.dequeue();    qs.dequeue();    qs.dequeue();    qs.dequeue();
        qs.enqueue("+Diez");    qs.enqueue("+Once");    qs.enqueue("+Doce");
        System.out.println("\nQuitando cuatro elementos y agregando tres nuevos, en qs.");
        System.out.print( "Cola qs: " + qs.toString() + "\n" );

        // Prueba de los metodos del Problema
        System.out.println("36a.2)- cuentaElementos(qs): " + cuentaElementos(qs) );        
        System.out.println("    comprobando qs: \n  " + qs.toString());
  
    }

    //++++++++++++++++++++++++++++++++++++++++++++++++
    // Problema 36
    // 36.a) Regresa el total de elementos almacenados en la cola,
    //       sin usar "size()"
    public static<T> int cuentaElementos(CArrayQueue<T> que) {
        if( que==null ) throw new
            ADTsException("cuentaElementos(): que null.\n");
        
        CArrayQueue<T> queaux= new CArrayQueue(que.length());
        int conta=0;
        
        while(!que.isEmpty())
        {
            queaux.enqueue(que.dequeue());
            conta++;
        }
        
        while(!queaux.isEmpty())
        {
            que.enqueue(queaux.dequeue());
        }
        return conta;
    }
    
}
