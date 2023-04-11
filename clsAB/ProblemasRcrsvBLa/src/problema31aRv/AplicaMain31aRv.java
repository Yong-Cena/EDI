
package problema31aRv;

/**
 * Aplicacion del problema 31a.
 * @author EDg1
 */
public class AplicaMain31aRv {

    public static void main(String[] args) {
        OperMatricesRv oma = new OperMatricesRv();
        double F[][]= new double[3][3];
        double suma1, suma2, suma3;
        String cade1, cade2;
        int tren=F.length, tcol=F[0].length;
    
        F[0][0]= 1.; F[0][1]= 2.; F[0][2]= 3.; 
        F[1][0]= 4.; F[1][1]= 5.; F[1][2]= 6.;
        F[2][0]= 7.; F[2][1]= 8.; F[2][2]= 9.;
        
        double G[][]= { {11., 12., 13.},
                        {14., 15., 16.},
                        {17., 18., 19.} };

        
        System.out.println("\n31a.1) Suma de la diag prin de una matriz");
        suma3 = oma.sumaDiagPrinMd(F, tren-1);    // matriz cuadrada
        System.out.println("Suma de la diagonal principal de F: " + suma3);
        
        System.out.println("\n31a.2) Suma por renglones de matriz");
        suma1 = oma.sumaRenMd(F, tren-1, tcol-1);
        System.out.println("Suma total de F, por renglones: " + suma1);

        System.out.println("\n31a.3) Suma por columnas de matriz");
        suma2 = oma.sumaColMd(G, tren-1, tcol-1);
        System.out.println("Suma total de G, por columnas: " + suma2);

        System.out.println("\n31a.4) Cadena de los elementos de una matriz");
        cade2 = oma.toStringMd(G, tren-1, tcol-1);
        System.out.println("Cadena total de G: { \n" + cade2 + " }");

        System.out.println("\n31a.5) Suma matricial de dos matrices");
        System.out.println("Matriz F: { \n" + oma.toStringMd(F, tren-1, tcol-1) + " }");
        System.out.println("Matriz G: { \n" + oma.toStringMd(G, tren-1, tcol-1) + " }");
        double R[][]= new double [tren][tcol];
        oma.suma2Md(R, F, G, tren-1, tcol-1);
        System.out.println("R= F + G, R: { \n" + oma.toStringMd(R, tren-1, tcol-1) + " }");
        
    }
    
}
