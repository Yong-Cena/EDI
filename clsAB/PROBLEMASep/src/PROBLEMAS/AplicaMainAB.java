package PROBLEMAS;
import LnkStrwN.*;

/**
 *
 * @author tote
 */
public class AplicaMainAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LnkStrwN<Personaw> lper1 = new LnkStrwN();
        lper1.addLast( new Personaw(30, "yo") );
        lper1.addLast( new Personaw(28, "tu") );
        lper1.addLast( new Personaw(12, "el") );
        lper1.addLast( new Personaw(11, "ella") );
        lper1.addLast( new Personaw(16, "nos") );
        lper1.addLast( new Personaw(10, "nos") );
        System.out.println("lper1: " + lper1.toString());        
        System.out.println("Personasw retiradas: " + lper1.persmen15ls());

        LnkStrwN<Personaw> lper2 = new LnkStrwN();
        lper2.addLast( new Personaw(12, "el") );
        lper2.addLast( new Personaw(11, "ella") );
        lper2.addLast( new Personaw(16, "nos") );
        lper2.addLast( new Personaw(10, "nos") );
        System.out.println("lper1: " + lper2.toString());        
        System.out.println("Personasw retiradas: " + lper2.persmen15ls());
        
    }
    
}
