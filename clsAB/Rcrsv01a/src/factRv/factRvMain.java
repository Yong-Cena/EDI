
package factRv;

/**
 * Factorial de un entero largo, recursivo
 * @author EDg3
 */
public class factRvMain {

    public static void main(String[] args) {
        // n!  Factorial de n, con n >= 0
        int n, rfact;
        
        n = 4;
        rfact = factRv(n);
        System.out.println("Fact(" + n + ") = " + rfact + "\n");
    }
    
    // Metodo factorial recursivo, con enteros
    // La multiplicatoria es conmutativa
    public static int factRv( int n ) {
       int result=1;
       if(n>1)
       {
           result=n* factRv(n-1);
       }
       return result;
    }
    
}
