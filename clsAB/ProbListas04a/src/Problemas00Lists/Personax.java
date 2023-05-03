
package Problemas00Lists;

/**
 * Contiene datos básicos de una persona.
 * @author EDg2
 */
public class Personax  implements Comparable {
    private int clave;
    private String nombre;

    public Personax(int clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    /**
     * Este metodo define el como se deben comparar los atributos
     * de este objeto con el del otro objeto, para definir
     * entre dos personas cual es de orden mayor (positivo),
     * menor (negativo) o cuando son iguales (cero).
     * @return el resultado int de la comparacion del nombre de dos paises.
     */
    public int compareTo(Object otro) {
        int result = 0; // Supuesto inicial: iguales

        if( this != otro) {        
            Personax otraPersona = (Personax) otro;
            result = this.nombre.compareTo(otraPersona.nombre);
            // this.compareTo(otro), regresa si lexicograficamente
            //  <0: this<otro;    =0: this==otro;    >0: this>otro
        }
        
        return result;
    }
    
    @Override
    public String toString() {
        return "[Prsn: " + clave + ", " + nombre + "]";
    }
    
}
