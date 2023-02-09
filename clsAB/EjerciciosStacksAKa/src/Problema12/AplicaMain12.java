
package Problema12;

/**
 * Clase con main para problema de Parentesis Balanceados
 * @author EDI
 */
public class AplicaMain12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RevisorParentesis rp1;
        boolean b;
        String exprStr, sinoStr;

        // 1er ejemplo de una expresion String
        exprStr = "(1+2)*((4+5/2))  -7";
        rp1 = new RevisorParentesis(exprStr);
        b = rp1.esParenteBalan();
        sinoStr = (b) ? "SI" : "NO";
        System.out.println("La expresion string: " + exprStr +
                ", " + sinoStr + " tiene los Parentesis Balanceados\n");

        // 2do ejemplo de una expresion String
        exprStr = "1+2)* (4+5/2";
        rp1 = new RevisorParentesis(exprStr);
        b = rp1.esParenteBalan();
        sinoStr = (b) ? "SI" : "NO";
        System.out.println("La expresion string: " + exprStr +
                ", " + sinoStr + " tiene los Parentesis Balanceados\n");
        
        // 3er ejemplo de una expresion String
        exprStr = "4 -8";
        rp1 = new RevisorParentesis(exprStr);
        b = rp1.esParenteBalan();
        sinoStr = (b) ? "SI" : "NO";
        System.out.println("La expresion string: " + exprStr +
                ", " + sinoStr + " tiene los Parentesis Balanceados\n");
        
        // 4to ejemplo de una expresion String
        exprStr = "4-(8  +(6";
        rp1 = new RevisorParentesis(exprStr);
        b = rp1.esParenteBalan();
        sinoStr = (b) ? "SI" : "NO";
        System.out.println("La expresion string: " + exprStr +
                ", " + sinoStr + " tiene los Parentesis Balanceados\n");
      
    }
    
}
