/*
 * Caracteristicas y funcionalidades de un empleado Administrativos.
 * Ademas de sus propios atributos y metodos, hereda los de empleado.
 */
package problema04apoli;

/**
 * @author EDg3
 */

public class Administrativo extends Empleado{
    // Atributos
    private String departamento;
    private String telefono;
    
    // Constructor
    public Administrativo() {
        this("vacio", "vacio", "vacio", -999.99);
    }
    public Administrativo(String depto, String tele,
            String nombreEmp, double sueldoBa) {
        super(nombreEmp, sueldoBa);
        if( depto==null || tele==null ) 
            throw new RuntimeException("Administrativo: depto, tele null.");
        departamento = depto;
        telefono = tele;
    }
    
    // Getters y Setters
    public String getDepartamento() {
        return departamento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDepartamento(String depto) {
        if( depto==null ) 
            throw new RuntimeException("SetDepartamento: depto null.");
        departamento = depto;
    }

    public void setTelefono(String tele) {
        if( tele==null ) 
            throw new RuntimeException("SetTelefono: tele null.");
        telefono = tele;
    }
    
    // Override, toString
    @Override
    public String toString() {
        String cade;
        StringBuilder strb;
        strb = new StringBuilder();
        cade = super.toString();  // ???
        strb.append("<Administrativo>:\n    " + cade + "\n");   // Agregando dos cadenas
        strb.append("    Departamento " + departamento + "\n");
        strb.append("    Telefono " + telefono + "\n");
        return strb.toString();
    }
        
}