/*
 * Caracteristicas y funcionalidades de un Empleado.
 * Atributos y metodos.
 */
package EmpresaEmpleados04;

import java.util.Objects;   // Para usar Objects.equals( )

/**
 * @author EDg3
 */

public class Empleado {
    // Atributos de clase
    private static int serie = 100;

    // Atributos
    private int claveEmpleado;
    private String nombreEmpleado;
    private double sueldoBase;

    // Constructor
    public Empleado() {
        this("vacio", -999.99);
    }

    public Empleado(String nombreEmp, double sueldoBa) {
        if( nombreEmp==null ) throw new RuntimeException("Empleado: nombreEmp null."); 
        claveEmpleado = serie;
        serie++;
        nombreEmpleado = nombreEmp;
        sueldoBase = sueldoBa;
    }
    
    // Getters
    public int getClaveEmpleado() {
        return claveEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    
    // Setters
    public void setSueldoBase(double sueldoBa) {
        this.sueldoBase = sueldoBa;
    }
    
    /*
    * Calcula el salario de un empleado.
    * Parámetros: prestac - porcentaje de prestaciones, en decimales;
    * deduc- porcentaje de deducciones, en decimales.
    */
    public double calculaSalario(double prestac, double deduc) {
        return sueldoBase*(1+prestac-deduc);
    }

    // Override methods: equals, toString
    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new
               RuntimeException("equals(): otroObj null."); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es de clase ThisClass
            br= false;
            if( otroObj instanceof Empleado ) {
                // Objeto existente y de clase ThisClass
                Empleado TC = (Empleado) otroObj;
                br = (this.claveEmpleado == TC.claveEmpleado);                  
                br = br && (this.sueldoBase == TC.sueldoBase);                  
                br = br && (Objects.equals(this.nombreEmpleado, TC.nombreEmpleado));
            }            
        }
        return br;
    }
    
    @Override
    public String toString() {
        String cade;  
        cade = "Empleado[" + "clave=" + claveEmpleado + ", nombre="
            + nombreEmpleado + ", sueldoBase=" + sueldoBase + ']';
        return cade;
    }
        
}
