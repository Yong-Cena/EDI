/*
 * Clase Escuela del proyecto AlumnoEscuela03.
 */
package AlumnoEscuela03;

/**
 * @author EDg3
 * Clase para instanciar objetos Escuela
 */
public class Escuela {
    // ATRIBUTOS
    private String nombreEscuela;
    private String direccionEscuela;
    private int numAlumnos;
    private final int MAXALUMNOS = 50;
    private Alumno [] alumnosCardex;
    
    // CONSTRUCTORES
    public Escuela() {
        this("vacio", "vacio");
    }

    public Escuela(String nEsc, String dEsc) {
        nombreEscuela = nEsc;
        direccionEscuela = dEsc;
        numAlumnos = 0;
        alumnosCardex = new Alumno[MAXALUMNOS];
    }

    // SET-TERS y GET-TERS
    public void setNombreEscuela(String nEsc) {
        nombreEscuela = nEsc;
    }

    public void setDireccionEscuela(String dEsc) {
        direccionEscuela = dEsc;
    }
    
    public String getNombreEscuela() {
        return nombreEscuela;
    }
    
    public String getDireccionEscuela() {
        return direccionEscuela;
    }

        // METODOS DE GESTION Y CALCULO
    // Metodo para dar de alta un alumno.
    public boolean altaAlumno(Alumno alump) {
        if( alump==null ) throw new
                RuntimeException("altaAlumno(): alump con null.\n");
        boolean resp;
        resp = false;
        if(numAlumnos < MAXALUMNOS) {  // Agrega alumnos si hay espacio
            alumnosCardex[numAlumnos] = alump;
            numAlumnos++;
            resp = true;
        }
        return resp;
    }
    
    // 1)- Metodo para obtener los datos de un alumno segun su clave
    // Situaciones: No existe el alumno, no existe ningun alumno.
    public String infoAlumnoClv(int claUn) {
        String cade = "Quien sabe";
        Alumno auxAlum = null;
        int i = 0;
        while (i < numAlumnos) {
            if(claUn == alumnosCardex[i].getClaveUnica()) {
                auxAlum = alumnosCardex[i];
                i = numAlumnos;
            }
            i++;
        }
        if( auxAlum == null) {
            cade = "No existe el alumno " + claUn + "\n";
        } else {
            cade = auxAlum.toString();
        }
        
        return cade;
    }
    
    // 2)- Nombre y promedio de todos los alumnos
    public String calculoPromedioTodos() {
        String cade = "Quien sabe";
        if(numAlumnos < 1) {
            cade = "No existen alumnos";
        } else {
            cade = "";
        }
        for (int i = 0; i < numAlumnos; i++) {
            cade = cade + ", " + alumnosCardex[i].getNombreAlum()
                    + " - " + alumnosCardex[i].calculaPromedio();
        }
        return cade;
    }
    
    // 3) y 4)- Nombre de alumno con mayor cantidad de materias aprobadas
    public String mayorMateriasAprob() {
        String cade;
        cade = "Quien sabe";
        int may, ind, count;
        // may: total de materias aprobadas
        // may puede empezar en -1
        if(numAlumnos > 0) {
            may = -1;
            ind = -1;
            for (int i = 0; i < numAlumnos; i++) {
                if(alumnosCardex[i].totMatAprob() > may) {
                    may = alumnosCardex[i].totMatAprob();
                    ind = i;
                }
            }
            count= 0;
            for (int i = 0; i < numAlumnos; i++) {
                if(alumnosCardex[i].totMatAprob() == may) {
                    count++;
                }
            }
            if( count == 1 ) {
                cade = alumnosCardex[ind].toString();
            } else {
                cade = "Hay más de un alumno.";
            }
        } else {
            cade = "No existen alumnos";
        }
        return cade;        
    }

    
}
