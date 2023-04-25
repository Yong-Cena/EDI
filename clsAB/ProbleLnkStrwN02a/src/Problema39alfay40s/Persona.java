/*
 * Contiene datos básicos de una persona.
 */
package Problema39alfay40s;
import java.util.Objects;

/**
 * Problema 39 de Estructuras Entrelazadas con Nodos
 * @author EDg1
 */
public class Persona {
    private String nombre;
    private String direccion;

    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    @Override
    public String toString() {
        return "Prsn{" + nombre + ", " + direccion + '}';
    }

    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new
            RuntimeException("equals(...): otroObj null.\n"); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es de clase Persona
            br= false;
            if( otroObj instanceof Persona ) {
                // Objeto existente y de clase Persona
                Persona TC = (Persona) otroObj;
                br = Objects.equals(this.nombre, TC.nombre);                  
                br = br && Objects.equals(this.direccion, TC.direccion);                  
            }            
        }
        return br;
    }
    
}
