package Problema44;

import ADTsException.ADTsException;
import LnkStrwN.*;
import Sets.*;
import java.util.Iterator;

/**
 *
 * @author EDg3
 */
public class AplicaMain44 {
    
    public static void main(String[] args) {
        LnkStrwN<Persona> esPers= new LnkStrwN();
        //Estructura enlazada que contiene objetos Persona.
        Persona pa, pb, pc, pd, pe;
        pa= new Persona("Mario", "uno"); pb= new Persona("Luisa", "dos");
        pc= new Persona("Armando", "tres"); pd= new Persona("Rebeca", "cuatro");
        esPers.add(pa, 1); esPers.add(pb, 2); esPers.add(pc, 3);
        esPers.add(pd, 4);
        esPers.add(pa, 4);    esPers.add(pc, 4);        esPers.add(pc, 6);
        System.out.println("\n1) Estructura con objetos Persona");
        System.out.println(esPers.toString());
        pe= new Persona("Roberto", "seis");
        
        // Elimina todos los repetidos
        int telim=0;
        telim= eliminaTodosRepetidosDesordenado(esPers);
        System.out.println( "Total eliminados> " + telim);
        System.out.println(esPers.toString());


    }
    
    // Inserta "nuevo" antes del nodo de "info"
    public static <T> int eliminaTodosRepetidosDesordenado(LnkStrwN<T> lse) {
        if( lse==null ) throw new
            ADTsException("eliminaTodosRepetidosDesordenado(..): lse null.\n");
        
        int tam= lse.size(), resp=1;
        ArraySet<T> c= new ArraySet(tam);
        while(!lse.isEmpty())
        {
            c.add(lse.removeFirst());
        }
        
        Iterator<T> it= c.iterator();
        while(it.hasNext())
        {
            lse.addLast(it.next());
        }
        resp=tam-c.size();
        return resp;
    }
    
}
