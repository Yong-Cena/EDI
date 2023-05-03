
package Problema48Lists;
import Lists.*;

/**
 * Problema 48 de LinkedLists
 * @author EDg1
 */
public class Problema48ListsMain {

    public static void main(String[] args) {
        // Creacion de la lista vacia
        LnkOrdList<Personay> listor2= new LnkOrdList();
        // Creacion de objetos Personay
        Personay pa;
        Personay pb, pc, pd, pe;
        pa = new Personay(11, "Hugo");
        pb = new Personay(22, "Paco");
        pc = new Personay(33, "Luis");
        pd = new Personay(44, "Donald");
        
        // Agregado a la LnkOrdList
        listor2.add(pa);    listor2.add(pb);    
        listor2.add(pc);    listor2.add(pd);    
        listor2.add(pc);    listor2.add(pd);    
        System.out.println("1)- Lista:\n" + listor2.toString());
        System.out.println("1)- Lista:\n" + listor2.toStringRv());
                
        System.out.println("2)- Encuentra " + pc.toString() +
                " en posicion: " + listor2.find(pc) );

        System.out.println("3)- Encuentra rv " + pc.toString() +
                " en posicion: " + listor2.findRv(pc) );

        System.out.println("4)- Encuentra " + pd.toString() +
                " en posicion: " + listor2.find(pd) );

        System.out.println("5)- Encuentra rv " + pd.toString() +
                " en posicion: " + listor2.findRv(pd) );        
    }
    
}
