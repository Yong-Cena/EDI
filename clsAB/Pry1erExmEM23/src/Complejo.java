
/**
 *
 * @author EDI
 */
public class Complejo {
    private double parteReal;
    private double parteImaginaria;
    
    public Complejo(double pR,double pI) {
        parteReal=pR;
        parteImaginaria=pI;
    }
    
    public double getParteReal() {
        return parteReal;
    }
    
    public double getParteImaginaria() {
        return parteImaginaria;
    }
    
    public String toString() {
        StringBuilder sb=new StringBuilder("");
        
        sb.append(parteReal);
        if(parteImaginaria>=0)
            sb.append("+");
        sb.append(parteImaginaria);
        sb.append("i");
        
        return sb.toString();
    }
}
