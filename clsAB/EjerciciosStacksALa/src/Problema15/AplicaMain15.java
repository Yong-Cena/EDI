package Problema15;
import Stacks.*;

/**
 * Problema 15
 * @author EDI
 */
public class AplicaMain15 {

    public static void main(String[] args) {
        ArrayStack<Integer> pilaInt1 = new ArrayStack<Integer>();
        ArrayStack<Integer> pilaInt2 = new ArrayStack<Integer>();

        pilaInt1.push(10);    pilaInt1.push(-20);
        pilaInt1.push(100);   pilaInt1.push(40);
        
        pilaInt2.push(40);    pilaInt2.push(-20);
        
        System.out.println("\n---- PRUEBA 15.1 ----");
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());
        
        System.out.println("---- ¿CONTENIDA? 15.2 ----");
        System.out.println("¿pilaInt1 contiene a pilanInt2: " + 
                pila2EnPila1(pilaInt1, pilaInt2) );

        System.out.println("---- CONSTANCIA DE NO MODIFICACION 15.3 ----");
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());
       

        System.out.println("\n---- PRUEBA 15.4 ----");
        pilaInt2.push(-10);    pilaInt2.push(100);    // Agregando a pilaInt2
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());
        
        System.out.println("---- ¿CONTENIDA? 15.5 ----");
        System.out.println("¿pilaInt1 contiene a pilanInt2: " + 
                pila2EnPila1(pilaInt1, pilaInt2) );

        System.out.println("---- CONSTANCIA DE NO MODIFICACION 15.6 ----");
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());


        System.out.println("\n---- PRUEBA 15.7 ----");
        pilaInt2.push(-30);    pilaInt2.push(300);    // Agregando a pilaInt2
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());
        
        System.out.println("---- ¿CONTENIDA? 15.8 ----");
        System.out.println("¿pilaInt1 contiene a pilanInt2: " + 
                pila2EnPila1(pilaInt1, pilaInt2) );

        System.out.println("---- CONSTANCIA DE NO MODIFICACION 15.9 ----");
        System.out.print("pilaInt1: " + pilaInt1.toString());
        System.out.println(" ---- pilaInt2: " + pilaInt2.toString());

    }
    
    // Problema 15, ¿esta la pila2 contenida en pila1?
    // Cada pila por separado, no tiene valores repetidos.
    public static <T> boolean pila2EnPila1(ArrayStack<T> pila1,
            ArrayStack<T> pila2) {
        if ( (pila1 == null) || (pila2 == null) ) throw new
                RuntimeException("(pila2EnPila1) pila1 o pila2: null.\n");

        boolean estap2= false;
        T elem2;
        ArrayStack<T> paux2= new ArrayStack<T>();
        
        // Si >=, pila2 sub pila1; si <, pila2 no sub de pila1
        if( pila1.size() >= pila2.size() ) {
            //Compara cada elemento de la pila2, con todos los de la pila1
            estap2=true;
            while ( !pila2.isEmpty() && estap2==true) {
                elem2 = pila2.pop();
                paux2.push(elem2);

                //"Ve" si el elem2 esta en la pila1.
                //Si "estap2" es false, ya no sigue mas.
                estap2=elemEnPila(pila1, elem2);
            }

            // Regresa pila2 a su estado original.
            while ( !paux2.isEmpty() ) {
                pila2.push(paux2.pop());    // Rellena pila2 completa
            }
            // Deja ambas pilas en estado original
        
        }
        return estap2;
    }
    
    // Esta elem2 en pila1. El metodo es no destructivo, respecto a la pila1.
    private static <T> boolean elemEnPila(ArrayStack<T> pila1, T elem2) {
        if (pila1 == null) throw new
                RuntimeException("(elemEnPila) pila1 o pila2: null.\n");

        boolean estap1= false;
        T elem1 = null;
        ArrayStack<T> paux1= new ArrayStack<T>();

        //"Ve" si el elem2 esta en la pila1.
        while ( !pila1.isEmpty() && estap1==false){
            elem1 = pila1.pop();
            paux1.push(elem1);  // Vaciando pila1
            estap1=elem2.equals(elem1);
        }

        // Regresa pila1 a su estado original.
        while ( !paux1.isEmpty() ) {
            pila1.push(paux1.pop());  // Rellena pila1 completa
        } 
        
        return estap1;
    }
    
}
