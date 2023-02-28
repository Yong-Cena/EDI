
package Problema25;
import ADTsException.ADTsException;

/**
 *
 * @author EDI
 */
public class Alumno {
    // ATRIBUTOS
    private static int sigClv= 1000;    // Para generar claves de alumnos
    private int clave;
    private String nombre;
    private int edad;

    // CONSTRUCTORES
    public Alumno(String nom, int ed) {
        if(nom==null) throw new
                ADTsException("Problema25.Alumno.Alumno(): nom null.\n");
        nombre= nom;
        edad= ed;
        clave= sigClv;
        sigClv++;
    }
    
    public Alumno() {
        this("NombreVacio"+sigClv, -1);
    }
    
    // GETTERS and SETTERS
    public int getEdad(){
        return edad;
    }

    // EQUALS
    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new
            ADTsException("equals: otroObj null."); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es de clase ThisClass
            br= false;
            if( otroObj instanceof Alumno ) {
                // Objeto existente y de clase ThisClass
                Alumno TC = (Alumno) otroObj;
                br = (this.clave == TC.clave);                  
                br = br && ( this.nombre.equals(TC.nombre) );                  
                br = br && (this.edad == TC.edad);
            }            
        }
        return br;
    }
    
    // PRINT OUT
    @Override
    public String toString() {
        return "Alum{" + "clv=" + clave + ", nom=" + nombre + ", ed=" + edad + '}';
    }

}
