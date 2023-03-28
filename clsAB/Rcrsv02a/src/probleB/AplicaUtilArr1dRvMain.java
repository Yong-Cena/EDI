package probleB;

/**
 * Problema clase UtilArr1d, recursivo
 * @author EDI
 */
public class AplicaUtilArr1dRvMain {

    public static void main(String[] args) {
        // 1)- toStringdRv(...) despliegue de un vector
        int ne = 3;
        double [] F = {3.2, 7., 5.};
        // TODO ...
        UtilArr1dRv uno= new UtilArr1dRv(F);
        System.out.println("uno F: "+uno.toStringdRv(F.length-1));
        
        // 2)- Suma matricial de dos vectores
        double [] G = {6., -9., 5.1};
        double [] Resul= new double[G.length];
        // TODO ...
        UtilArr1dRv dos= new UtilArr1dRv(Resul);
        System.out.println("dos Resul: "+dos.toStringdRv(G.length-1));

        // 3)- busqueda secuencial
        double dato= 5.0;
        int pos= dos.buscaSecRv(Resul.length-1, dato);
        // TODO ...
        System.out.println("  uno F. El dato: "+dato+", está en la posicion: "+ pos);

        dato= 5.6;
        // TODO ...
        pos= dos.buscaSecRv(Resul.length-1, dato);
        System.out.println("  dos Resul. El dato: "+dato+", está en la posicion: "+pos);   
        
        // 4) Posicion del mayor.
        // TODO ...
        pos= dos.posMayRv(Resul.length-1);
        System.out.println("\n  uno F. La posicion del mayor de F: " + pos);
    
    }
    
}
