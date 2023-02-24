/*
 * Use of SET collections.
 */
package Problema24;

import Sets.ArraySet;

/**
 * @author EDI
 */
public class AplicaMain24 {
    public static void main(String[] args) {
        //Ejercicios simples del uso de las operaciones del conjunto.
        ArraySet<Integer> c1= new ArraySet<Integer>(15);
        ArraySet<Integer> c2= new ArraySet<Integer>(15);
        ArraySet<Integer> c3= new ArraySet<Integer>(15);
        ArraySet<Integer> c4= new ArraySet<Integer>(30);
        ArraySet<Integer> c5= new ArraySet<Integer>(30);
        ArraySet<Integer> c6= new ArraySet<Integer>(30);
        
        //Agrega elementos al conjunto.
        c1.add(70);   c1.add(70);   c1.add(-40);   c1.add(30);
        c1.add(-50);   c1.add(-40);   c1.add(60);
        System.out.println("T1-- c1: " + c1.toString());

        c2.add(200);   c2.add(-300);   c2.add(30);   c2.add(-50); 
        //c1.addAll(c2);
        System.out.println("T2-- c2: "+ c2.toString());

        c3.add(200);   c3.add(-300);  c3.add(30);    
        c3.add(-50);
        c3.add(440);   c3.add(800);
        System.out.println("T3-- c3: "+ c3.toString() + "\n");
        
        //Prueba de union.
        c4 = (ArraySet) c1.union(c3);
        System.out.println("T4-- Unión de c1 y c3, en c4: " + c4.toString());

        //Prueba de intersección.
        c5 = (ArraySet) c1.intersection(c3);
        System.out.println("T5-- Intersección de c1 y c3, en c5: " +
                c5.toString());
  
        //Prueba de diferencia.
        c6 = (ArraySet) c1.difference(c3);
        System.out.println("T6-- Diferencia c1 - c3, en c6: " + c6.toString());

        c6 = (ArraySet) c3.difference(c1);
        System.out.println("T7-- Diferencia c3 - c1, en c6: " + c6.toString());

    }
    
}
