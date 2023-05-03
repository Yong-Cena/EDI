
package Problemas00Lists;
import Lists.*;

/**
 * Segundos ejrcicios de LinkedOrderedLists
 * @author EDg2
 */
public class LnkUnOrdListsUso03 {

    public static void main(String[] args) {
        // Creacion de la lista vacia
        LnkUnordList<Personax> listunor3= new LnkUnordList();
        
        // Creacion de objetos Personax
        Personax pa, pb, pc, pd, pe;
        pa = new Personax(11, "Hugo");
        pb = new Personax(22, "Paco");
        pc = new Personax(33, "Luis");
        pd = new Personax(44, "Donald");
        pe = new Personax(55, "No existo");
        
        // Agregado a la LinkedOrderedList
        listunor3.addToFront(pa);    listunor3.addToFront(pb);    
        listunor3.addToRear(pc);    listunor3.addToRear(pd);    
        System.out.println("1)- Lista inicial:\n" + listunor3.toString());

        
    }
    
}
