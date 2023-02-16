package problema23ex;
import Stacks.*;

/**
 * Problema 23ex
 * @author EDI
 */
public class AplicaMain23ex {

    public static void main(String[] args) {
        ArrayStack<Double> ad = new ArrayStack(20);
        ad.push(30.1);    ad.push(40.2);    ad.push(50.3);
        System.out.println("23ex.1  pila inicial ad: " + ad.toString());
        System.out.println("23ex.2  pilaModif(ad)");
        ArrayStack<Double> adr= pilaModif(ad);
        System.out.println("23ex.3    pila resultante adr: " + adr.toString());
        
        ArrayStack<Integer> ai = new ArrayStack(30);
        ai.push(30);    ai.push(40);    ai.push(50);
        System.out.println("\n23ex.4  pila inicial ai: " + ai.toString());
        System.out.println("23ex.5  pilaModif(ai)");
        ArrayStack<Integer> air= pilaModif(ai);
        System.out.println("23ex.6    pila resultante air: " + air.toString());
        
        ArrayStack<String> ast = new ArrayStack(30);
        ast.push("uno");    ast.push("dos");    ast.push("tres");
        System.out.println("\n23ex.7  pila inicial astr: " + ast.toString());
        System.out.println("23ex.8  pilaModif(ast)");
        ArrayStack<String> astr= pilaModif(ast);
        System.out.println("23ex.9    pila resultante astr: " + astr.toString());
    }
    
    // Modifica los elementos de una pila dada "pilao", dejando el resultado
    //     "pilar", siempre que la clase de los elementos sea Integer o String.
    // Regresa vacio para cualquier otra clase.
    public static <T> ArrayStack<T> pilaModif(ArrayStack<T> pilao) {
        if (pilao == null) throw new 
            ADTsException("(pilaModif) Referencia a pila: null.\n");
        
        // Creacion de objetos pila, vacios.
        ArrayStack<T> pilaux = new ArrayStack<T>(pilao.size());
        ArrayStack<T> pilar = new ArrayStack<T>(pilao.size());

        T elem= null;
        double d;
        String str;
        
        if( !pilao.isEmpty() ) {
            // Guarda en la pila aux, para recordar
            while(!pilao.isEmpty())
            {
                pilaux.push(pilao.pop());
            }
            // Para revisar la clase de objeto
            elem=pilaux.peek();
            if( elem instanceof Double ) {
                while(!pilaux.isEmpty())
                {
                    elem=pilaux.pop();
                    pilao.push(elem);
                    d= (Double)elem+90.08;
                    pilar.push((T)(new Double(d)));
                }
            } else {
                if(elem instanceof String)
                {
                    while(!pilaux.isEmpty())
                    {
                        elem=pilaux.pop();
                        pilao.push(elem);
                        str= (String)elem+"#anexo";
                        pilar.push((T)(new String(str)));
                    }
                }
            }            
        }
        return pilar;
    }
    
}
