
package Problema39;
import LnkStrwN.LnkStrwN;
import ADTsException.*;

/**
 * Problema 39, de Estructuras Entrelazadas (Linked Structure) con
 * definicion de clases que representan a un Nodo y a una
 * Estructura Enlazada, agregando todos los metodos de comportamiento.
 * @author EDI
 */
public class AplicaMain39 {
    
    public static void main(String[] args) {
        LnkStrwN<String> colores= new LnkStrwN();
        colores.add("cafe", 1);     colores.add("rojo", 2);
        colores.add("azul", 3);     colores.add("verde", 4);
        colores.add("blanco", 1); 

        System.out.println("1) colores: "+colores.toString());
        System.out.println("3) Prueba de get");
        System.out.println(colores.get(2));
        
        System.out.println("\n4) Prueba de remove");
        System.out.println(colores.remove(1));
        System.out.println(colores.toString());
        
        System.out.println("\n5) Prueba de addFirst y addLast");
        colores.addFirst("amarillo"); colores.addFirst("rosa");
        System.out.println(colores.toString());
        
        colores.addLast("amazul");
        System.out.println(colores.toString());
               
    }

    
    
    
}
