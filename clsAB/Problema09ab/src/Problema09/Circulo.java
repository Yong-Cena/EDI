//
package Problema09;

/**
 * Clase Circulo que implementa Figuras Geometricas
 * @author EDg2
 */
public class Circulo implements FigGeometrica{
    // Atributos
    private double radio;
    
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter, por inciso 9.4)
    public double getRadio() {
        return radio;
    }
       
    // Metodos implementados
    // Perimetro de un Circulo
    public double calculaPerim() {
        double perim = 2.0 * Math.PI * radio;
        return perim;
    }

    // Area de un Circulo
    public double calculaArea() {
        double area;
        area = Math.PI * radio * radio;
        return area;
    }
    
    // Overriding
    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new
            RuntimeException("equals(): otroObj null.\n"); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es Circulo
            br= false;
            if( otroObj instanceof Circulo ) {
                // Objeto existente y de clase Circulo
                Circulo figg = (Circulo) otroObj;
                br = (this.radio == figg.radio);                  
            }            
        }
        return br;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
}
