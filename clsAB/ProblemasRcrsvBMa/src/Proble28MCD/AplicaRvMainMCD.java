package Proble28MCD;
/**
 * Ejercicios recursivos BK03.
 * MCD de dos numeros enteros
 * @author EDg2
 */
public class AplicaRvMainMCD {

    /**
     * Uso de los algoritmos MCD
     * iterativos y recursivos
     */
    public static void main(String[] args) {
        System.out.println("\nMCD ITERATIVOS.\n");
        int i, j, k, a, b, c, d, e, f;


        System.out.println("\n=====================================");
        System.out.println("\nMCD RECURSIVO.\n");
        
        a=8;    b=4;
        i=MCDrv(a,b);
        System.out.println("MCDrv("+a+","+b+"): " + i +"\n");

        c=24;    d=30;
        j=MCDrv(c,d);
        System.out.println("MCDrv("+c+","+d+"): " + j +"\n");

        e=35;    f=33;
        k=MCDrv(e,f);
        System.out.println("MCDrv("+e+","+f+"): " + k +"\n");

        
    }

    /**
     * MCD recursivo
     * Parametros ma y nb deben ser enteros positivos.
     */        
    public static int MCDrv(int ma, int nb)
    {
        int res;
        System.out.println("    sig MCDrv("+ma+", "+nb+")");
    	if(nb==0)
        {
            res=ma;
        }
        else
        {
            if(nb>ma)
            {
                res=MCDrv(nb,ma);
            }
            else
            {
                res=MCDrv(nb,ma%nb);
            }  
        //res=MCDrv(nb,ma%nb);
        }
        return res;
    }
        
}
