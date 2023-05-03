
package Problemas00Lists;
import Lists.*;

/**
 * Primeros ejrcicios de LnkOrdLists
 * @author EDg1
 */
public class LnkOrdListsUso01 {

    public static void main(String[] args) {
        LnkOrdList<Integer> listor1= new LnkOrdList();
        
        //Prueba de operaciones de lista ordenada.
        System.out.println("1)- Lista inicial:\n" + listor1);

        listor1.add(33);    listor1.add(12);
        listor1.add(42);    listor1.add(25);
        System.out.println("2)- Lista:\n" + listor1.toString());

        
        listor1.add(57);    listor1.add(49);
        listor1.add(54);    listor1.add(57);
        System.out.println("\n8)- Nueva lista: \n" + listor1.toString());

    }
    
}
