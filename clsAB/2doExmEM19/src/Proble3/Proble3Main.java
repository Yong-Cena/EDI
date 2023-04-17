package Proble3;

/**
 *
 * @author EDg1
 */
public class Proble3Main {

    public static void main(String[] args) {

        System.out.println("Escriba aqui su nombre y clave unica\n");
        double [] ad = {2.0, 5.0, 3.0, 1.0, 4.0};
        double [] rd = new double[ad.length];
        
        creaOtroVector( ad, rd);
        
        for(int i=0; i<rd.length; i++) {
            System.out.print(rd[i] + ", ");
        }
        System.out.println();

    }
    
    public static void creaOtroVector( double [] arrd, double [] result) {
         
    }
    

}
