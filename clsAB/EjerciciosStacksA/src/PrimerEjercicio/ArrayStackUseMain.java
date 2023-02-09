/*
 * Use of ArrayStack.
 */
package PrimerEjercicio;
import Stacks.*;

/**
 * @author EDg1
 */
public class ArrayStackUseMain {
    public static void main(String[] args) {
        // Crear ArrayStack para 10 enteros
        System.out.println("---- PRUEBA 1 ----");
        ArrayStack<Integer> stackInt= new ArrayStack(10);
        
        for(int i=11; i<=18;i++)
        {
            stackInt.push(i);
        }
        // Agregar 8 enteros al stack: 11, 12, 13, ... 18
        System.out.println(" Prueba 1 " + stackInt.toString());
        
        // Sacar del stack, un par de enteros, comprobando
        System.out.println("\n---- PRUEBA 2 ----\n");
        int tot= stackInt.size();
        for(int i=1; i<= tot;i++)
        {
            System.out.print(stackInt.pop()+", ");
        }
        
        // Sacar del stack de enteros, el resto, e imprimirlos
        // ????


        System.out.println("\n---- PRUEBA 3 ----");
        // Invertir una cadena de caracteres
        String stri= "ABCdef123fghIJK";
        
        ArrayStack <Character> stackChar= new ArrayStack(stri.length());
        for(int i=0; i<stri.length();i++)
        {
            stackChar.push(stri.charAt(i));
        }
        
        String cad="";
        while(!stackChar.isEmpty())
        {
            cad= cad+stackChar.pop();
        }
        
        System.out.println("cad= "+cad);

    }    
}
