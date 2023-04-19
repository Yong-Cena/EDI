package Proble1;
import Queues.*;

/**
 *
 * @author EDg1
 */
public class Proble1Main {

    public static void main(String[] args) {

        System.out.println("Escriba aqui su nombre y clave unica\n");

        CircularArrayQueue<Double> qd = new CircularArrayQueue();
        qd.enqueue(10.0);    qd.enqueue(-30.0);
        qd.enqueue(50.0);    qd.enqueue(234.0);
        qd.enqueue(8.0);
        
        System.out.println("Cola Double inicial: \n" + qd.toString());
        cada2sCola(qd);
        System.out.println("Cola Double modificada: \n" + qd.toString());
        
        CircularArrayQueue<String> qs = new CircularArrayQueue();
        qs.enqueue("Uno");    qs.enqueue("Alfa");
        qs.enqueue("Ocho");    qs.enqueue("Delta");
        qs.enqueue("Tres");
        
        System.out.println("Cola String inicial: \n" + qs.toString());
        cada2sCola(qs);
        System.out.println("Cola String modificada: \n" + qs.toString());
        
    }
    
    public static <T> void cada2sCola(CircularArrayQueue<T> cola) 
    {
        if(cola==null) throw new
            RuntimeException("Cola en null");
        
        T e1,e2;
        
        if(!cola.isEmpty())
        {
            e1= cola.first();
            
            if(e1 instanceof Double || e1 instanceof String)
            {
                int n= cola.size()/2;
                
                while(n >0)
                {
                    e1=cola.dequeue();
                    e2= cola.dequeue();
                    
                    cola.enqueue(e2);
                    cola.enqueue(e1);
                    n--;
                }
                
                if(cola.size()%2==1)
                {
                    cola.enqueue(cola.dequeue());
                }
            }
        }
                

    }
        
}
