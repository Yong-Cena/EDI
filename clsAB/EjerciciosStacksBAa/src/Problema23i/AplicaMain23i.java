package Problema23i;
import Stacks.*;

/**
 *
 * @author EDI
 */
public class AplicaMain23i {

    public static void main(String[] args) {
        // Ejemplo con Double
        ArrayStack<Double> pila1= new ArrayStack();
        pila1.push(10.8);    pila1.push(-20.4);    pila1.push(100.0);    pila1.push(-50.0);        
        System.out.println("\n1.1)- pila1 original: " + pila1.toString());
        // ----
        ArrayStack<Double> pila2= new ArrayStack();
        pila2.push(23.0);    pila2.push(10.1);    pila2.push(202.0);    pila2.push(-70.0);
        System.out.println("1.2)- pila2 original: " + pila2.toString());
        // ====
        ArrayStack<Double> pila12;        
        pila12= sumaElemPilas(pila1, pila2);
        System.out.println("1.3)- pila1 estado final: " + pila1.toString());
        System.out.println("1.4)- pila2 estado final: " + pila2.toString());  
        System.out.println("1.5)- pila12 resultado: " + pila12.toString());  
        
        // Ejemplo con Boolean      
        ArrayStack<Boolean> pila1a= new ArrayStack();
        pila1a.push(true);    pila1a.push(false);    pila1a.push(false);        
        System.out.println("\n2.1)- pila1a original: " + pila1a.toString());
        // ----
        ArrayStack<Boolean> pila2a= new ArrayStack();
        pila2a.push(false);    pila2a.push(false);    pila2a.push(true);
        System.out.println("2.2)- pila2a original: " + pila2a.toString());
        // ====
        ArrayStack<Boolean> pila12a;        
        pila12a= sumaElemPilas(pila1a, pila2a);
        System.out.println("2.3)- pila1a estado final: " + pila1a.toString());
        System.out.println("2.4)- pila2a estado final: " + pila2a.toString());  
        System.out.println("2.5)- pila12a estado final: " + pila12a.toString());          

        // Ejemplo con String        
        ArrayStack<String> pila1b= new ArrayStack();
        pila1b.push("Hola");    pila1b.push("Que");        
        System.out.println("\n3.1)- pila1b original: " + pila1b.toString());
        // ----
        ArrayStack<String> pila2b= new ArrayStack();
        pila2b.push("Buenos dias");    pila2b.push("Alegre+");
        System.out.println("3.2)- pila2b original: " + pila2b.toString());
        // ====
        ArrayStack<String> pila12b;        
        pila12b= sumaElemPilas(pila1b, pila2b);
        System.out.println("3.3)- pila1b estado final: " + pila1b.toString());
        System.out.println("3.4)- pila2b estado final: " + pila2b.toString());  
        System.out.println("3.5)- pila12b estado final: " + pila12b.toString());          

        // Ejemplo con Complejo      
        ArrayStack<Complejo> pila1c= new ArrayStack();
        pila1c.push(new Complejo(2.0,3.0));    pila1c.push(new Complejo(-5.0,8.0));
        pila1c.push(new Complejo(7.0,12.0));        
        System.out.println("\n4.1)- pila1c original: " + pila1c.toString());
        // ----
        ArrayStack<Complejo> pila2c= new ArrayStack();
        pila2c.push(new Complejo(4.0,-5.0));        pila2c.push(new Complejo(10.0,-7.0));
        pila2c.push(new Complejo(11.0,9.0));
        System.out.println("4.2)- pila2c original: " + pila2c.toString());
        // ====
        ArrayStack<Complejo> pila12c;        
        pila12c= sumaElemPilas(pila1c, pila2c);
        System.out.println("4.3)- pila1c estado final: " + pila1c.toString());
        System.out.println("4.4)- pila2c estado final: " + pila2c.toString());  
        System.out.println("4.5)- pila12c estado final: " + pila12c.toString());          

    }

    // Suma de Objetos de la misma clase:
    //      Double, Boolean, String, Complejo
    public static<T> ArrayStack<T> sumaElemPilas(ArrayStack<T> pila1, ArrayStack<T> pila2) {
        if( (pila1==null) || (pila2==null) || (pila1.size()!=pila2.size()) ) throw new
                ADTsException("sumaElemPilas(...): nulls o diferentes tamaños.\n");
        
        ArrayStack<T> paux1= new ArrayStack( pila1.size()+10 );
        ArrayStack<T> paux2= new ArrayStack( pila1.size()+10 );
        ArrayStack<T> pilar= new ArrayStack( pila1.size()+10 );
        T e1, e2, e12=null;
        String clasestr;
        if( !pila1.isEmpty() ) {
            e1= pila1.peek();
            if( e1 instanceof Double || e1 instanceof Boolean ||
                    e1 instanceof String || e1 instanceof Complejo) {
                while( !pila1.isEmpty() ) {
                    paux1.push( pila1.pop() );
                    paux2.push( pila2.pop() );
                }
                while( !paux1.isEmpty() ) {
                    e1= paux1.pop();
                    e2= paux2.pop();
                    clasestr= e1.getClass().getSimpleName();
                    System.out.println("e...getSimpleName(): " + clasestr);
                    // TODO
                    switch( clasestr ) {
                        case "Double":
                            Double d1, d2, d12;
                            d1= (Double) e1;    d2= (Double) e2;
                            d12= d1 + d2;
                            e12= (T) d12;
                            break;
                        case "Boolean":
                            Boolean b1, b2, b12;
                            b1= (Boolean) e1; b2= (Boolean) e2;
                            b12= b1||b2;
                            e12= (T)b12;
                            break;
                        case "String":
                            String str1, str2, str12;
                            str1= (String) e1;  str2= (String)e2;
                            str12= str1+str2;
                            e12= (T)str12;
                            break;
                        case "Complejo":
                            Complejo c1,c2,c12;
                            c1= (Complejo)e1; c2= (Complejo)e2;
                            Double ri1, ri2;
                            ri1= c1.getParteReal()+c2.getParteReal();
                            ri2= c1.getParteImaginaria()+c2.getParteImaginaria();
                            c12= new Complejo(ri1,ri2);
                            e12= (T)c12;
                            break;
                        // No hay default.    
                    }
                    pila1.push(e1);
                    pila2.push(e2);
                    pilar.push(e12);
                }
            }
        }
        return pilar;
    }
}
