package problema27Rv;

/**
 * Problema 27, suma de los elementos enteros de un vector
 * @author EDg3
 */
public class problema27RvMain {

    public static void main(String[] args) {
        int arri [] = {101, 202, 303, 404, 505};
        int posUlt= arri.length-1;
        int total = sumaVeciRv(arri, posUlt);
        System.out.println("total suma arri= " + total + "\n");
    }
    
    // Suma de los enteros de un vector, recursivo
    public static int sumaVeciRv(int [] Vi, int index) {
        int total=Vi[index];
        if(index==0)
        {
            total= Vi[0];
        }
        else
        {
            total+= sumaVeciRv(Vi,index-1);
        }
        return total;
    }            
    
}
