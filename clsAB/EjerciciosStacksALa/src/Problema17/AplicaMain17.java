
package Problema17;
import Stacks.*;

/**
 * Problema 17
 * @author EDI
 */
public class AplicaMain17 {

    public static void main(String[] args) {
        ArrayStack<Double> pilaDbl = new ArrayStack();

        pilaDbl.push(-50.0);    pilaDbl.push(-50.0);    pilaDbl.push(10.0);
        pilaDbl.push(-20.0);    pilaDbl.push(-20.0);
        pilaDbl.push(100.0);    pilaDbl.push(100.0);    pilaDbl.push(100.0);
        pilaDbl.push(40.0);

        System.out.println("\n---- PRUEBA 17.1 ----");
        System.out.println("pilaDbl: " + pilaDbl.toString());
        
        System.out.println("\n---- PRUEBA 17.2 ---- quitaRepetidos(...)");
        quitaRepetidos(pilaDbl);

        System.out.println("\n---- COMPROBACION 17.3----");
        System.out.println("pilaDbl: " + pilaDbl.toString());
        
        ArrayStack<String> pilaStr = new ArrayStack(8);
        pilaStr.push("uno");    pilaStr.push("uno");
        pilaStr.push("dos");
        pilaStr.push("tres");    pilaStr.push("tres");    pilaStr.push("tres");
        
        System.out.println("\n\n---- PRUEBA 17.4 ----");
        System.out.println("pilaStr: " + pilaStr.toString());
        
        System.out.println("\n---- PRUEBA 17.5 ---- quitaRepetidos(...)");
        quitaRepetidos(pilaStr);

        System.out.println("\n---- COMPROBACION 17.6----");
        System.out.println("pilaStr: " + pilaStr.toString());                
               
    }
    
    public static <T> void quitaRepetidos(ArrayStack<T> pila) {
        if (pila == null) throw new
            RuntimeException("(quitaRepetidos) Referencia a pila: null.\n");

        ArrayStack<T> paux= new ArrayStack();
        T aux, elem;
        
        while(!pila.isEmpty())
        {
            elem=pila.pop();
            while(!pila.isEmpty()&& pila.peek().equals(elem))
            {
                pila.pop();
            }
            paux.push(elem);
        }
        
        while(!paux.isEmpty())
        {
            aux= paux.pop();
            pila.push(aux);
        }
    }
    
}
