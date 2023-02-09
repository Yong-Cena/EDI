
package Problema09;

/**
 *
 * @author EDg2
 */
public class Cuadrado extends Quadrilatero {
    private double lado;
    
    //constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    // Metodos implementados
    public double calculaArea(){
        return lado*lado;
    }
    
    public double calculaPerim() {
        return 4.0*lado;
    }
    
    // Overriding
    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new RuntimeException("equals: otroObj null."); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es Cuadrado
            br= false;
            if( otroObj instanceof Cuadrado ) {
                // Objeto existente y de clase Cuadrado
                Cuadrado figg = (Cuadrado) otroObj;
                br = (this.lado == figg.lado);                  
            }            
        }
        return br;
    }
    
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
}
