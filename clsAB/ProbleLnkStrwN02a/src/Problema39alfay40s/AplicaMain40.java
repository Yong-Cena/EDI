
package Problema39alfay40s;
import ADTsException.ADTsException;
import LnkStrwN.*;

/**
 *
 * @author EDg3
 */
public class AplicaMain40 {
    
    public static void main(String[] args) {
        LnkStrwN<Persona> esPers= new LnkStrwN();
        //Estructura enlazada que contiene objetos Persona.
        Persona pa, pb, pc, pd, pe;
        pa= new Persona("Mario", "uno"); pb= new Persona("Luisa", "dos");
        pc= new Persona("Armando", "tres"); pd= new Persona("Rebeca", "cuatro");
        esPers.add(pa, 1); esPers.add(pb, 2); esPers.add(pc, 3);
        esPers.add(pd, 4);
        System.out.println("\n1) Estructura con objetos Persona");
        System.out.println(esPers.toString());
        pe= new Persona("Roberto", "seis");
        
        // Elimina despues de elemento T
        boolean sepudo;
        sepudo= eliminaSiguienteDe(esPers, pc);
        System.out.println(" T eliminada despues de " + pc.getNombre() + " se pudo> " + sepudo);
        System.out.println(esPers.toString());

        sepudo= eliminaSiguienteDe(esPers, pc);
        System.out.println(" T eliminada despues de " + pc.getNombre() + " se pudo> " + sepudo);
        System.out.println(esPers.toString());
        
        sepudo= eliminaSiguienteDe(esPers, pe);
        System.out.println(" T eliminada despues de " + pe.getNombre() + " se pudo> " + sepudo);
        System.out.println(esPers.toString());

    }
    
    // Elimine el nodo siguiente al que ocupa la “info”
    public static <T> boolean eliminaSiguienteDe(LnkStrwN<T> lse, T info) {
        if( lse==null ) throw new
            ADTsException("eliminaSiguienteDe(..): lse null.\n");
        
        boolean b= false;
        int pos;
        pos=lse.searchPos(info);
        if(pos>=1 && pos<lse.size())
        {
            lse.remove(pos+1);
            b= true;
        }
        return b;
    }
    
}
