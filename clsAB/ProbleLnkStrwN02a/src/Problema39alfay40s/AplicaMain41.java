
package Problema39alfay40s;
import ADTsException.ADTsException;
import LnkStrwN.*;

/**
 *
 * @author EDg3
 */
public class AplicaMain41 {
    
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
        sepudo= eliminaAnteriorA(esPers, pc);
        System.out.println(" T eliminada antes de " + pc.getNombre() + " se pudo> " + sepudo);
        System.out.println(esPers.toString());

        sepudo= eliminaAnteriorA(esPers, pa);
        System.out.println(" T eliminada antes de " + pa.getNombre() + " se pudo> " + sepudo);
        System.out.println(esPers.toString());
        
        sepudo= eliminaAnteriorA(esPers, pe);
        System.out.println(" T eliminada antes de " + pe.getNombre() + " se pudo> " + sepudo);
        System.out.println(esPers.toString());

    }
    
    // Elimine el nodo anterior al que ocupa la “info”
    public static <T> boolean eliminaAnteriorA(LnkStrwN<T> lse, T info) {
        if( lse==null ) throw new
            ADTsException("eliminaAnteriorA(..): lse null.\n");
        
        boolean b= false;
        int pos;
        pos=lse.searchPos(info);
        if(pos>=2 && pos<=lse.size())
        {
            lse.remove(pos-1);
            b= true;
        }
        return b;
    }
    
}
