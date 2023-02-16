
package Problema20;
import Stacks.*;
/**
 *
 * @author pedi
 */
public class AplicaMain20 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("convEntABin(37): " + convEntABin(37));
        System.out.println("convEntABin(11): " + convEntABin(11));
    }
    
    // Conversion de entero a binario, por divisiones sucesivas entre 2
    public static <T> int convEntABin(int ent) {
        if( (ent<0) || (ent>255) ) throw new
                ADTsException("convEntABin: ent fuera de rango.");
        ArrayStack<Integer> arrT = new ArrayStack(10); 
        // Conversion de entero a binario, por divisiones sucesivas entre 2,
        //    y poniendo los residuos en el stack
        int cociente, residuo;
        while(ent>0)
        {
            residuo= ent%2;
            cociente=ent/2;
            arrT.push(residuo);
            ent=cociente;   
        }
        // Construccion, mediante acumulacion, del numero binario
        int result= 0;
        while(!arrT.isEmpty())
        {
            result= result*10+arrT.pop();
        }
        return result;
    }
    
}
