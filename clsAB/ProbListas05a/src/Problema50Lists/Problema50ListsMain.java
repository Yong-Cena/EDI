package Problema50Lists;
import Lists.*;

/**
 * Problema 50 de LnkOrdLists
 * @author EDg1
 */
public class Problema50ListsMain {

    public static void main(String[] args) {
        
        System.out.println("\n ----Pruebas de equals() e equalsRv()----");
        LnkOrdList<Personay> listaA= new LnkOrdList();
        LnkOrdList<Personay> listaB= new LnkOrdList();
        LnkOrdList<Personay> listaC= new LnkOrdList();

        Personay ph, pp, pl, pd;
        ph = new Personay(11, "Hugo");    pp = new Personay(22, "Paco");
        pl = new Personay(33, "Luis");    pd = new Personay(44, "Donald");
        
        listaA.add(ph);    listaA.add(pp);    listaA.add(pl); 
        listaB.add(pp);    listaB.add(pl);    listaB.add(ph); 
        listaC.add(pl);    listaC.add(pd);    listaC.add(ph); 
        
        System.out.println("  Lista A; " + listaA.toString());
        System.out.println("  Lista B; " + listaB.toString());
        System.out.println("1)- Listas A, B iguales? " + listaA.equals(listaB) );
        System.out.println("1Rv)- Listas A, B iguales? " + listaA.equalsRv(listaB) );

        System.out.println("\n  Lista B; " + listaB.toString());
        System.out.println("  Lista C; " + listaC.toString());
        System.out.println("2)- Listas B, C iguales? " + listaB.equals(listaC) );
        System.out.println("2Rv)- Listas B, C iguales? " + listaB.equalsRv(listaC) );
        
        listaB.add(pd);
        System.out.println("\n  Lista A; " + listaA.toString());
        System.out.println("  Lista B; " + listaB.toString());
        System.out.println("3)- Listas A, B iguales? " + listaA.equals(listaB) );
        System.out.println("3Rv)- Listas A, B iguales? " + listaA.equalsRv(listaB) );

    }
    
}
