
package Problema53Lists;
import DLists.*;

/**
 *
 * @author JRIOSS
 */
public class Aplica53Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DLnkList<Integer> list1= new DLnkList();
        
        list1.addFirst(30);    list1.addFirst(25);    list1.addFirst(17);
        list1.addLast(70);    list1.addLast(80);
        System.out.println("size: " + list1.size());
        System.out.println("1- list1: " + list1.toString());
        
        System.out.println(" find(17): " + list1.find(17));
        System.out.println(" find(70): " + list1.find(70));
        System.out.println(" find(18): " + list1.find(18));
        
        System.out.println("find(18)Rv: "+list1.findRv(17));

        System.out.println(" conatins(70): " + list1.contains(70));
        System.out.println(" conatins(18): " + list1.contains(18));

    }
    
}
