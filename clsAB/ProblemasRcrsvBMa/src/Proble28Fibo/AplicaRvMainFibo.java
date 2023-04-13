
package Proble28Fibo;

/**
 * Calculo del enesimo termino de Fibonacci
 * (0,1) 1, 2, 3, 5, 8, 13, 21, 34 ... 
 * @author EDI
 */
public class AplicaRvMainFibo {

    public static void main(String[] args) {
        int termnt;
        System.out.println("Serie de Fibonacci: (0,1) 1, 2, 3, 5, 8, 13, 21, 34 ... ");
        System.out.println("2do ter, 1, 3er termino, 2, 4to termino, 3, etc.");
        
        System.out.println("\nCaso Recursivo. N-esimo termino.");
        // Semilla (0,1)
        
        termnt = fiboRv(2);
        System.out.println("term 2= " + termnt);
        termnt = fiboRv(3);
        System.out.println("term 3= " + termnt);
        termnt = fiboRv(7);
        System.out.println("term 7= " + termnt);
        termnt = fiboRv(8);
        System.out.println("term 8= " + termnt);

    }
        
    // Fibonacci Recursivo.
    // Cuidado con nt negativo
    public static int fiboRv(int nt) {
        int total=0;
        
        if(nt<2)
        {
            total=nt;
        }
        else
        {
            total+= fiboRv(nt-1)+fiboRv(nt-2);
        }
        return total;
    }
    
}
