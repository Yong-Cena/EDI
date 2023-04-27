
package Problema46a;
import Stacks.*;

/**
 * Problema 46, Stacks implementado con estructuras entrelazadas
 * @author EDg1
 */
public class AplicaMain46a {

    public static void main(String[] args) {
       


        // Ejemplos sencillos del manejo de la pila.
        // Con la pila de cadenas.
        LnkStrStack<String> pilaStr= new LnkStrStack();
        pilaStr.push("A");
        pilaStr.push("B");
        System.out.println("1)- Tope de la pila: " + pilaStr.peek());
        System.out.println("2)- Pila completa: \n" + pilaStr.toString());
        System.out.println("3)- Valor: " + pilaStr.pop());
        if (!pilaStr.isEmpty()) {
            System.out.println("4)- Valor: " + pilaStr.pop());
        }
        System.out.println("5)- Pila Vacia");
        try {
            //Error: pila vacía
            System.out.println("5a)- " + pilaStr.pop());
        } catch(Exception e) {
            System.out.println("5b)- " + e.toString());
        }

        //Con la pila de enteros.
        LnkStrStack<Integer> pilaInt= new LnkStrStack();
        pilaInt.push(10);
        pilaInt.push(-10);
        System.out.println("6) Pila completa: \n" + pilaInt.toString());
        System.out.println("7) Valor entero: " + pilaInt.pop());
        System.out.println("8) Valor entero: " + pilaInt.pop());
        System.out.println("9) Pila completa: \n" + pilaInt.toString());
        System.out.println("");

    }
    
}
