import LnkStrwN.*;

public class Proble2Main {

    public static void main(String[] args) {

        System.out.println("Axel Castro Lara 204092\n");
        
        LnkStrwN<Double> dls= new LnkStrwN();
        dls.addLast(1.1);    dls.addLast(2.2);    dls.addLast(3.3);
        dls.addLast(4.4);    dls.addLast(5.5);    dls.addLast(6.6);
        System.out.println("dls: " + dls.toString());
        LnkStrwN<Double> result= dls.otrals(2);
        System.out.println("\n    dls: " + dls.toString());
        System.out.println("    >> result(2): " + result.toString());        
        
        System.out.println("-------------------");
        LnkStrwN<Double> dls2= new LnkStrwN();
        dls2.addLast(1.0);    dls2.addLast(2.0);    dls2.addLast(3.0);
        dls2.addLast(4.0);    dls2.addLast(5.0);    dls2.addLast(6.0);
        dls2.addLast(7.0);    dls2.addLast(8.0);    dls2.addLast(9.0); 
        dls2.addLast(10.0);
        System.out.println("dls2: " + dls2.toString());
        LnkStrwN<Double> result2= dls2.otrals(4);
        System.out.println("\n    dls2: " + dls2.toString());
        System.out.println("    >> result(4): " + result2.toString()); 
        System.out.println("\n-- ADIOS. --\n");  
    }
    
}
