//
package Problema09;

/**
 * Clase Triangulo que implementa Figuras Geometricas
 * @author EDg2
 */
public class Triangulo implements FigGeometrica{
    // Atributos
    private double lado1, lado2, lado3;    // Lados del triangulo
    
    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // Metodos implementados
    // Perimetro de un Triangulo
    public double calculaPerim() {
        double perim = lado1 + lado2 + lado3;
        return perim;
    }

    // Area de un Triangulo Escaleno
    public double calculaArea() {
        double sePe, area;  // Semiperimentro y Area
        sePe = calculaPerim()/2;
        area = Math.sqrt(sePe*(sePe-lado1)*(sePe-lado2)*(sePe-lado3) );
        return area;
    }
    
    // Conocer si es triangulo equilatero
    public boolean esEquila() {
        return lado1==lado2 && lado2==lado3;
    }
    
    // Overriding
    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new
            RuntimeException("equals(): otroObj null.\n"); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es Triangulo
            br= false;
            if( otroObj instanceof Triangulo ) {
                // Objeto existente y de clase Triangulo
                Triangulo figg = (Triangulo) otroObj;
                br = (this.lado1 == figg.lado1);                  
                br = br && (this.lado2 == figg.lado2);                  
                br = br && (this.lado3 == figg.lado3);                  
            }            
        }
        return br;
    }
    
    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }
        
}
