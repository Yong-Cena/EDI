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
        nombreEscuela= nEsc;
        direccionEscuela= dEsc;
        alumnosCardex= new Alumno[MAXALUMNOS];
        numAlumnos=0;
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
        
        if(numAlumnos<MAXALUMNOS)
        {
            alumnosCardex[numAlumnos]= alump;
            resp=true;
            numAlumnos++;
        }
        return resp;
    }
    
    // 1)- Metodo para obtener los datos de un alumno segun su clave
    // Situaciones: No existe el alumno, no existe ningun alumno.
    public String infoAlumnoClv(int claUn) {
        String cade;
        Alumno auxAlum = null;
        int contador=0;
        
        while(contador<numAlumnos)
        {
            if(claUn== alumnosCardex[contador].getClaveUnica())
            {
                auxAlum= alumnosCardex[contador];
                contador=numAlumnos;
            }
            contador++;
        }
        if(auxAlum==null)
        {
            cade= "No existe el alumno "+claUn+"\n";
        }
        else
        {
            cade= auxAlum.toString();
        }
        return cade;
    }
    
    // 2)- Nombre y promedio de todos los alumnos
    public String calculoPromedioTodos() {
        String cade;
        if(numAlumnos < 1) {
            cade = "No existen alumnos";
        } else {
            cade = "";
            
            for(int i=0; i<numAlumnos;i++)
            {
                cade+= "Nombre: "+alumnosCardex[i].getNombreAlum()+ " Promedio: "+alumnosCardex[i].calculaPromedio()+"\n";
            }
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
        may=-1; ind=0;
        if(numAlumnos > 0) {
            for(int i=0; i<numAlumnos;i++)
            {
                if(alumnosCardex[i].getTotAprob()>may)
                {
                    ind=i;
                }
            }
            cade= alumnosCardex[ind].getNombreAlum();
        } else {
            cade = "No existen alumnos";
        }
        return cade;        
    }

    
}
