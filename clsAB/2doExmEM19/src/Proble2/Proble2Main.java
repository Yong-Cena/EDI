package Proble2;
import Sets.*;

/**
 *
 * @author EDg1
 */
public class Proble2Main {
    public static void main(String[] args) {

        System.out.println("Escriba aqui su nombre y clave unica\n");
        ArraySet<Character> scha = new ArraySet();
        scha.add('a');    scha.add('b');    scha.add('c');
        scha.add('d');    scha.add('e');

        ArraySet<Character> schb = new ArraySet();
        schb.add('c');    schb.add('a');    schb.add('f');
        schb.add('g');    schb.add('h');

        ArraySet<Character> schc = new ArraySet();
        schc.add('h');    schc.add('b');    schc.add('i');
        schc.add('j');
        
        ArraySet<Character> schr;
        schr = operw3sets( scha, schb, schc);
        
        System.out.println("schr: " + schr.toString());

    }
    
    public static <T> ArraySet<T> operw3sets( ArraySet<T> setA,
            ArraySet<T> setB, ArraySet<T> setC ) {        
        
        return new ArraySet();
    }
    
    
}
