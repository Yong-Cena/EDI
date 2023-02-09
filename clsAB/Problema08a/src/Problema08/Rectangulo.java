
package Problema08;

/**
 * Cuadrilateros
 * @author EDI
 */
public class Rectangulo extends Cuadrilatero{
    // Constructor
    private double lado1, lado2;
    
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodos implementados
    public double calculaArea(){
        return -1.0;
    }
    
    public double calculaPerim() {
        return -1.0;
    }
    
    // Overriding
    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new
            RuntimeException("equals: otroObj null."); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es Rectangulo
            br= false;
            if( otroObj instanceof Rectangulo ) {
                // Objeto existente y de clase Rectangulo
                Rectangulo figg = (Rectangulo) otroObj;
                br = (this.lado1 == figg.lado1);                  
                br = br && (this.lado2 == figg.lado2);                  
            }            
        }
        return br;
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
        
}
