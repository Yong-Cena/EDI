/*
 * Clase Alumno del proyecto Problemas03.
 */
package AlumnoEscuela03;

/**
 * @author EDg3
 * Clase para instanciar objetos Alumno
 */
public class Alumno {
    // ATRIBUTOS
    private static int serie = 100; // Clave inicial de la clase
    private int claveUnica;
    private String nombreAlum;
    private final int MAXCALIF = 45;
    private double [] califMateriasAprob;
    private int totalCalif;
    
    // CONSTRUCTORES
    public Alumno() {
        this("vacio" + serie);
    }

    public Alumno(String nombreap) {
        claveUnica = serie;    serie++;
        nombreAlum = nombreap;
        califMateriasAprob = new double[MAXCALIF];
        totalCalif = 0;
    }
    
    // SET-TERS y GET-TERS
    public void setNombreAlum(String nombreap) {
        nombreAlum = nombreap;
    }
    
    public String getNombreAlum() {
        return nombreAlum;
    }

    public int getClaveUnica() {
        return claveUnica;
    }
    
    // METODOS DE GESTION Y CALCULO
    // Metodo para dar de alta un alumno.
    public boolean altaCalificacion(double calif) {
        boolean resp;
        // Agrega calificacion si hay espacio y si la calificación es >=6
        if( (totalCalif < MAXCALIF) && (calif >= 6)) { 
            califMateriasAprob[totalCalif] = calif;
            totalCalif++;
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }
    
    // Metodo para calcular el promedio de califMateriasAprob
    public double calculaPromedio() {
        double promedio= 0.0;
        if( totalCalif > 0) {
            for(int i = 0; i < totalCalif; i++) {
                promedio = promedio + califMateriasAprob[i];
            }
            promedio = promedio / totalCalif;            
        }
        return promedio;
    }
    
    // Total de materias aprobadas (getter)
    public int totMatAprob() {  
        return totalCalif;
    }
         
    // METODOS A SOBRE-ESCRIBIR, DE CLASES ASCENDENTES
    // Comparacion por igualdad con otro objeto Alumno
    // por claveUnica y nombreAlum
    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new
            RuntimeException("equals(): otroObj null.\n"); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es de clase ThisClass
            br= false;
            if( otroObj instanceof Alumno ) {
                // Objeto existente y de clase ThisClass=Alumno
                Alumno otroAlum = (Alumno) otroObj;
                br = (nombreAlum.compareTo(otroAlum.nombreAlum) == 0);  //No se necesita               
                br = br && (claveUnica == otroAlum.claveUnica);                              }            
        }
        return br;       
    }
    
    // Obtencion del String del objeto
    @Override
    public String toString() {
        String cadena;
        cadena = "ALUMNO[" + claveUnica + "," + nombreAlum + ",";
        for(int i = 0; i < totalCalif; i++) {
            cadena = cadena + califMateriasAprob[i] + ",";
        }
        cadena = cadena + "]";
        return cadena;
    }
    
}
