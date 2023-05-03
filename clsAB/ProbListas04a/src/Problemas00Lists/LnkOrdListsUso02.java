
package Problemas00Lists;
import Lists.*;

/**
 * Segundos ejrcicios de LinkedOrderedLists
 * @author EDg2
 */
public class LnkOrdListsUso02 {

    public static void main(String[] args) {
        // Creacion de la lista vacia
        LnkOrdList<Personax> listor2= new LnkOrdList();
        
        // Creacion de objetos Personax
        Personax pa, pb, pc, pd, pe;
        pa = new Personax(11, "Hugo");
        pb = new Personax(22, "Paco");
        pc = new Personax(33, "Luis");
        pd = new Personax(44, "Donald");
        
        // Agregado a la LnkOrdList
        listor2.add(pa);    listor2.add(pb);    
        listor2.add(pc);    listor2.add(pd);    
        System.out.println("1)- Lista inicial:\n" + listor2.toString());


    }
    
}
