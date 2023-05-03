
package Problemas00Lists;

/**
* Implementa la clase para guardar datos de un país.
* Se debe implementar el metodo compareTo en la clase
* a usar como elemento generico.
* @author EDg2
*/
public class Pais implements Comparable {
    private String nombre;
    /**
     * Constructor que recibe el nombre del país para crear su objeto.
     * @param p
     */
    public Pais(String p) {
        nombre= p;
    }

    /**
     * Este metodo define el como se deben comparar los atributos
     * de este objeto con el del otro objeto, para definir
     * entre dos paises cual es de orden mayor (postivo),
     * menor (negativo) o cuando son iguales (cero).
     * @return el resultado int de la comparacion del nombre de dos paises.
     */
    public int compareTo(Object otro) {
        int result = 0; // Supuesto inicial: iguales

        if( this != otro) {        
            Pais otroPais= (Pais) otro;
            result = this.nombre.compareTo(otroPais.nombre);
            // this.compareTo(otro), regresa si lexicograficamente
            //  <0: this<otro;    =0: this==otro;    >0: this>otro
        }

        return result;
    }

    /** Metodo toString.
     * @return regresa la cadena con los atributos de país.
     */
    @Override
    public String toString() {
        return ("[Pais " + nombre + "]");
    }

}
