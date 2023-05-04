package Problema50Lists;
import Lists.LnkUnordList;

/**
 * Variacion del problema 50 con LnkUnordLists
 * @author EDg1
 */
public class Problema50ListsMainU {

    public static void main(String[] args) {

        System.out.println("\n ----Prueba de equals() equals y equalsRv----");
        LnkUnordList<Personay> listaA= new LnkUnordList();
        LnkUnordList<Personay> listaB= new LnkUnordList();
        LnkUnordList<Personay> listaC= new LnkUnordList();

        Personay ph, pp, pl, pd;
        ph = new Personay(11, "Hugo");    pp = new Personay(22, "Paco");
        pl = new Personay(33, "Luis");    pd = new Personay(44, "Donald");

        listaA.addToRear(ph);    listaA.addToRear(pp);    listaA.addToRear(pl); 
        listaB.addToRear(ph);    listaB.addToRear(pp);    listaB.addToRear(pl); 
        listaC.addToRear(pl);    listaC.addToRear(pp);    listaC.addToRear(ph); 
        
        System.out.println("  Lista A; " + listaA.toString());
        System.out.println("  Lista B; " + listaB.toString());
        System.out.println("4)- Listas A, B iguales? " + listaA.equals(listaB) );
        System.out.println("4Rv)- Listas A, B iguales? " + listaA.equalsRv(listaB) );

        System.out.println("\n  Lista B; " + listaB.toString());
        System.out.println("  Lista C; " + listaC.toString());
        System.out.println("5)- Listas B, C iguales? " + listaB.equals(listaC) );
        System.out.println("5Rv)- Listas B, C iguales? " + listaB.equalsRv(listaC) );
        
        listaB.addToRear(pd);
        System.out.println("\n  Lista A; " + listaA.toString());
        System.out.println("  Lista B; " + listaB.toString());
        System.out.println("6)- Listas A, B iguales? " + listaA.equals(listaB) );
        System.out.println("6Rv)- Listas A, B iguales? " + listaA.equalsRv(listaB) );

    }
    
}
