
package Problema30set24;
import Sets.*;

/**
 * Ejercicio 25, recursividad en metodos de Sets
 * @author MyOth
 */
public class AplicaMain30set24 {

    public static void main(String[] args) {
        //Ejercicios simples del uso de las operaciones del conjunto.
        ArraySet<Integer> c1= new ArraySet<Integer>(15);
        ArraySet<Integer> c2= new ArraySet<Integer>(15);
        ArraySet<Integer> c3= new ArraySet<Integer>(15);
        ArraySet<Integer> c4= new ArraySet<Integer>(30);
        
        //Agrega elementos al conjunto.
        c1.add(70);   c1.add(70);   c1.add(40);   c1.add(-30);
        System.out.println("T1--c1\n    " + c1.toString());

        c2.add(50);   c2.add(40);   c2.add(-60);       c2.add(-30);
        System.out.println("T2--c2\n    " + c2.toString());

        //Prueba de union Recursiva.
        c3 = (ArraySet)c2.unionRv(c1);
        System.out.println("T3-- Unión Rv de c2 con c1, en c3: \n    " + c3.toString());

        //Prueba de intersección Recursiva.
        c4 = (ArraySet) c1.intersection(c2);
        System.out.println("T4-- Intersección Rv de c1 y c2, en c4: \n    " +
                c4.toString());
    
        System.out.println(">>>> ADIOS"); 

    }
    
}
