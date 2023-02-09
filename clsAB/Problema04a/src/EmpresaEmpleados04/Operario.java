/*
 * Caracteristicas y funcionalidades de un empleado Administrativos.
 * Ademas de sus propios atributos y metodos, hereda los de empleado.
 */
package EmpresaEmpleados04;

/**
 * @author EDg3
 */

public class Operario extends Empleado {
    // Atributos
    private int horasExtras;
    
    // Constructor
    public Operario() {
        this("vacio", -999.99, -99);
    }
    
    public Operario(String nombreEmp, double sueldoBa, int horasExtras) {
        super(nombreEmp, sueldoBa);
        this.horasExtras = horasExtras;
    }    
    
    /* Calcula el salario del empleado dependiendo de las
     * prestaciones, horas extras y deduccion de impuestos
    */
    public double calculaSalario(double prestac,
            double deduc, double precioHE) {
        double salario;
        //salario= super.calculaSalario(prestac,deduc);   
        salario= this.getSueldoBase()*(1+prestac-deduc)+horasExtras*precioHE;  // ???
        return salario;
    }
        
    // Override, toString
    @Override
    public String toString() {
        String cade;
        StringBuilder strb;
        strb = new StringBuilder();
        cade = super.toString();  // ???
        strb.append("<Operario>:\n    " + cade + "\n");
        strb.append("    Horas extras: " + horasExtras + "\n");
        return strb.toString();
    }
    
    public int getHE()
    {
        return horasExtras;
    }
    
}

