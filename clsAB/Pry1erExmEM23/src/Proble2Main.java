
import Stacks.*;
/**
 *
 * @author Axel Castro Lara
 * 21 de febrero del 2023
 */
public class Proble2Main {

    public static void main(String[] args) {
        System.out.println("Escribe aqui tu nombre:  ,y clave unica: " );
        
        ArrayStack<String> pila1= new ArrayStack();
        pila1.push("tres");    pila1.push("alb3");
        pila1.push("cdmx");    pila1.push("-823");     
        System.out.println("\n1)- pila1 original: " + pila1.toString());
        doblaDatoEnPila(pila1);
        System.out.println("2)- pila1 resultante: " + pila1.toString());

        System.out.println("ADIOS.");
        
        ArrayStack<Integer> pila2= new ArrayStack();
        pila2.push(12); pila2.push(-3);
        doblaDatoEnPila(pila2);
        System.out.println(pila2.toString());
        
        ArrayStack<Double> pila3= new ArrayStack();
        pila3.push(345.83); pila3.push(-95.84);
        doblaDatoEnPila(pila3);
        System.out.println(pila3.toString());
        
        ArrayStack<Double> pila4= new ArrayStack();
        pila4=null;
        doblaDatoEnPila(pila4);
        System.out.println(pila4);
                  
    }
    
    public static <T> void doblaDatoEnPila(ArrayStack<T> pila) {
        try
        {
            ArrayStack<T> pilaAux= new ArrayStack();
            T aux;
            T elem= pila.peek();
        
            if(elem instanceof Integer)
                {
                    while(!pila.isEmpty())
                    {
                        aux= pila.pop();
                        aux= (T)(new Integer((int) aux*2));
                        pilaAux.push(aux); 
                    }
                }
                else
                {
                    if(elem instanceof String)
                    {
                        while(!pila.isEmpty())
                        {
                            aux= pila.pop();
                            aux+= (String)aux;
                            pilaAux.push(aux); 
                        } 
                    }
                }
            while(!pilaAux.isEmpty())
            {
                pila.push(pilaAux.pop());
            }
        }catch(Exception error)
        {
            System.out.println("La pila esta vacia");
        }
    }    
}
