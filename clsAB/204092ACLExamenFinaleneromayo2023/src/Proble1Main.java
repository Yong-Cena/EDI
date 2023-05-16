
import Queues.*;
import Stacks.*;
import ADTsException.*;

/**
 *
 * @author EDg3
 */
public class Proble1Main {

    public static void main(String[] args) {        
        System.out.println("Axel Castro Lara 204092\n");
        
        CArrayQueue<String> cola1= new CArrayQueue(10); 
        cola1.enqueue("agua");    cola1.enqueue("gato");
        cola1.enqueue("luz");    cola1.enqueue("perro");
        cola1.enqueue("agua");
        System.out.println("cola1: " + cola1.toString());
        System.out.println("\n  >> esPalindromo(cola1): " + esPalindromo(cola1));
        System.out.println("  despues cola1: " + cola1.toString());
        
        System.out.println("\n-- ADIOS. --\n");  
    }
  
    
    public static <T> boolean esPalindromo(CArrayQueue<T> cola) {
        boolean esp= true;
        
        ArrayStack<T> pila= new ArrayStack();
        pila= esPalindromo(cola,pila);
        
        if(!pila.pop().equals(cola.first()))
        {
            esp=false;
        }
        return esp;
    }
    
    private static <T> ArrayStack esPalindromo(CArrayQueue<T> cola, ArrayStack<T> pila)
    {
        if ( cola == null )
                throw new ADTsException("(invierteQg) parametro null.\n");
        
        T elem;
        if( !cola.isEmpty() ) {
            elem= cola.dequeue();
            pila.push(elem);
            esPalindromo(cola,pila);
            cola.enqueue(elem);
        }
        return pila;
    }

//No recursivo    
    private static <T> boolean esPalindromo(CArrayQueue<T> cola, T elem)
    {
        boolean resp=true;
        ArrayStack<T> pila= new ArrayStack();
        while(!cola.isEmpty())
        {
            
        }
        return resp;
    }
    
    public static <T> void invierteQg(CArrayQueue<T> Cgc) {
        if ( Cgc == null )
                throw new ADTsException("(invierteQg) parametro null.\n");
        
        T elem;
        if( !Cgc.isEmpty() ) {
            elem= Cgc.dequeue();
            invierteQg(Cgc);
            Cgc.enqueue(elem);
        } 
    }

}
