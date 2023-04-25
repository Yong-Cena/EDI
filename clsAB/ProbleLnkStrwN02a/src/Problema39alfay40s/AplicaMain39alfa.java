
package Problema39alfay40s;
import LnkStrwN.*;
import ADTsException.*;

/**
 * @author EDIg3
 */
public class AplicaMain39alfa {
    
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
        
        // Primera y ultima personas
        System.out.println("Primera persona: " + esPers.get(1));
        System.out.println("Ultima persona: " + esPers.get(esPers.size())+"\n");

        // Busca Persona
        int posPer= esPers.searchPos(pb);
        System.out.println(" Persona " + pb.getNombre() + " encontrada en la posicion: " + posPer);
        pe= new Persona("Roberto", "seis");
        posPer= esPers.searchPos(pe);
        System.out.println(" Persona " + pe.getNombre() + " encontrada en la posicion: " + posPer + "\n");
        

    }
        
}
