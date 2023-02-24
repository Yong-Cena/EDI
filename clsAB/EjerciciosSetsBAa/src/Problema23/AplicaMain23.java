/*
 * Use of SET collections.
 */
package Problema23;

import Sets.ArraySet;
import java.util.Iterator;

/**
 * @author EDI
 */
public class AplicaMain23 {
    public static void main(String[] args) {
        //Ejercicios simples del uso de las operaciones del conjunto.
        ArraySet<Integer> c1= new ArraySet<Integer>(15);
        ArraySet<Integer> c2= new ArraySet<Integer>(15);
        ArraySet<Integer> c3= new ArraySet<Integer>(15);
        
        //Agrega elementos al conjunto.
        c1.add(70);   c1.add(70);   c1.add(-40);   c1.add(30);

        System.out.println("1- "+c1.toString());
        c1.add(-50);   c1.add(-40);   c1.add(60);
        System.out.println("-2 "+c1.toString());

        //Prueba de remove.
        c1.remove(60);  c1.remove(70);
        System.out.println("-3 "+c1.toString());
        //Prueba de removeRandom.
        //int e1= c1.removeRandom();
        //System.out.println("4- "+e1+" removido");
        
        //Prueba de addAll.
        c2.add(200);   c2.add(-300);   c2.add(30);   c2.add(-50); 
        System.out.println("-6 "+c2.toString());
        c1.addAll(c2);
        System.out.println("-7 "+c1.toString());
        System.out.println("-8 "+c2.toString());
        
        //Prueba de equals.
        c3.add(200);   c3.add(-300);  c3.add(30);   
        System.out.println("---------------------");
        System.out.println("-9 c1- "+c1.toString());
        System.out.println("-10 c3- "+c3.toString());
        System.out.println("Son iguales c1 y c3: "+c1.equals(c3));
        
        c3.add(-50); c3.add(-40);
        System.out.println("Son iguales c1 y c3: "+c3.equals(c1));

        //Prueba de Iterator.
         Iterator<Integer> itc3= c3.iterator();
         System.out.println("-15 iterador: ");
         while(itc3.hasNext())
         {
             System.out.print(itc3.next()+", ");
         }
         System.out.println("\n");

    }
    
}
