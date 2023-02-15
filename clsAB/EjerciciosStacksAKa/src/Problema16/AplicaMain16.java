package Problema16;
import Stacks.*;

/**
 * Problema 16
 * @author EDI
 */
public class AplicaMain16 {

    public static void main(String[] args) {
        ArrayStack<Double> pilaDou = new ArrayStack<Double>();
        pilaDou.push(340.81);    pilaDou.push(-296.47);
        pilaDou.push(600.00);
        System.out.println("16.1: Pila original: \n" +
                pilaDou.toString());
        inverPila(pilaDou);
        System.out.println("\n16.2: Pila invertida: \n" +
                pilaDou.toString());
                
        try{
            inverPila(null);
        } catch ( Exception ex) {
            System.out.println("\n16.3: referencia null de pila.\n    " + ex.toString());
        }

    }
    
    // Invertir el orden de los elementos de una Pila de una clase T.
    public static <T> void inverPila (ArrayStack<T> pila) {
        if (pila == null)
            throw new ADTsException("inverPila: pila  null.\n");

        int i, ini, fin, tam;
        ini = 0;    tam = pila.size();
        T arrAux [] = (T[])(new Object[tam]);  //Arreglo linea
        fin= tam-1;

        //Pasando la pila al arreglo, queda inverso
        i = ini;       

        while( !pila.isEmpty() ) {
            arrAux[i] = pila.pop();
            i++;           
        }
        
        //Regresando a pila el contenido del arreglo
        i = ini;       
        while( i <= fin ) {
            pila.push( arrAux[i] );
            i++;           
        }
    }   
}
