
package Problema48Lists;
import java.util.Objects;

/**
 * Contiene datos básicos de una persona.
 * @author EDg1
 */
public class Personay  implements Comparable {
    private int clave;
    private String nombre;

    public Personay(int clave, String nombre) {
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
            Personay otraPersona = (Personay) otro;
            result = this.nombre.compareTo(otraPersona.nombre);
            // this.compareTo(otro), regresa si lexicograficamente
            //  <0: this<otro;    =0: this==otro;    >0: this>otro
        }
        
        return result;
    }

    @Override
    public boolean equals(Object otroObj) {
        boolean boo = true;
        if (otroObj == null) {
            boo = false;
        } else {
            if (this == otroObj) {
                boo = true;
            } else {
                if (getClass() != otroObj.getClass()) {
                    boo = false;
                } else {
                    Personay otraPersona = (Personay) otroObj;
                    boo = (nombre.compareTo(otraPersona.nombre) == 0);
                }
            }
        }
        return boo;
    }
    
    @Override
    public String toString() {
        return "[Prsn: " + clave + ", " + nombre + "]";
    }
    
}
