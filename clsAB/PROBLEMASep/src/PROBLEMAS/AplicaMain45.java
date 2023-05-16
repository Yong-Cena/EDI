package PROBLEMAS;

import ADTsException.*;
import LnkStrwN.*;
import Sets.*;
import java.util.Iterator;

/**
 *
 * @author EDg3
 */
public class AplicaMain45 {
    
    public static void main(String[] args) {
        LnkStrwN<String> es1= new LnkStrwN();
        es1.add( "uno", es1.size()+1 );
        es1.add( "dos", es1.size()+1 );
        es1.add( "tres", es1.size()+1 );
        es1.add( "cuatro", es1.size()+1 );
        System.out.println(" es1: " + es1.toString());
        
        LnkStrwN<String> es2= new LnkStrwN();
        es2.add( "once", es2.size()+1 );
        es2.add( "doce", es2.size()+1 );
        System.out.println(" es2: " + es2.toString());
        
        System.out.println(" es1.mix2lseN(es2) ");
        es1.mix2lseN(es2);
        System.out.println("Comprobando es1: " + es1.toString());
        System.out.println("Comprobando es2: " + es2.toString());
        

        System.out.println(" es2.mix2lseN(es1) ");
        es2.add( "veintiuno", es2.size()+1 );
        es2.add( "veintidos", es2.size()+1 );
        System.out.println(" es2: " + es2.toString());
        System.out.println(" es1: " + es1.toString());        
        es2.mix2lseN(es1);
        System.out.println("Comprobando es2: " + es2.toString());
        System.out.println("Comprobando es1: " + es1.toString());
        
    }
    
    
    
}
