
package Problema39alfay40s;
import ADTsException.ADTsException;
import LnkStrwN.*;

/**
 *
 * @author EDg3
 */
public class AplicaMain42 {
    
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
        sepudo= insertaAntesQue(esPers, pc, pe);
        System.out.println(" T insertada antes que " + pc.getNombre() + " se pudo> " + sepudo);
        System.out.println(esPers.toString());

        sepudo= insertaAntesQue(esPers, pa, pe);
        System.out.println("  insertada antes que " + pa.getNombre() + " se pudo> " + sepudo);
        System.out.println(esPers.toString());

    }
    
    // Inserta "nuevo" antes del nodo de "info"
    public static <T> boolean insertaAntesQue(LnkStrwN<T> lse, T info, T nuevo) {
        if( lse==null ) throw new
            ADTsException("insertaAntesQue(..): lse null.\n");
        
        boolean b= false;
        int pos;
        pos=lse.searchPos(info);
        if(pos!=-1)
        {
            lse.add(nuevo, pos);
            b= true;
        }
        return b;
    }
    
}
