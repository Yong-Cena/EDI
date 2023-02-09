/*
 * Proyecto 03 del cuadernillo de ejercicios.
 * Clases principal, Alumno y Escuela.
 */
package AlumnoEscuela03;

/**
 * @author EDg3
 * Clase principal AplicaMain03
 */
public class AplicaMain03 {

    public static void main(String[] args) {
        // Variables y Referencias
        Alumno alu1, alu2, alu3, alu4;

        System.out.println("\n1.0- OBJETOS ALUMNOS");        
        //Creacion de los Alumnos
        alu1 = new Alumno("Maria");
        alu1.altaCalificacion(9.1);
        
        alu2 = new Alumno("Juan");
        alu2.altaCalificacion(9.1);
        alu2.altaCalificacion(8.9);
        
        alu3 = new Alumno("Margarita");
        alu3.altaCalificacion(9.1);
        alu3.altaCalificacion(8.9);
        alu3.altaCalificacion(9.0);
        
        // Info de alu2
        System.out.println("alu2: " + alu2.toString());
        // Info de alu3
        System.out.println("alu3: " + alu3.toString());

        System.out.println("\n1.1- ALUMNOS, uso de equals");
        // Uso de equals, Alumnos
        System.out.println("Identicos? alu1 y alu2:  " + alu1.equals(alu2));
        System.out.println("Identicos? alu3 y alu3:  " + alu3.equals(alu3));
        
        // Promedio de alu3
        System.out.println("\n1.3- ALUMNO, nombre y promedio: " + alu3.getNombreAlum() + " - "
            + alu3.calculaPromedio());         

        // Atrapando Exception pasando objeto con referencia null.
        try {
            alu1.equals(null);
        }
        catch( Exception ex ) {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
        }

        // ESCUELA con ALUMNOS        
        Escuela esc1, esc2;
        System.out.println("\n2.0- OBJETO ESCUELA");
        // Creacion de escuelas
        esc1 = new Escuela("Puebla", "Puebla 201, CDMX");
        
        // Agregando alumnos
        esc1.altaAlumno(alu2);
        esc1.altaAlumno(alu1);
        esc1.altaAlumno(alu3);
        
        // (1)- Datos del alumno alu3 en la Escuela Puebla
        int clal = alu3.getClaveUnica();
        System.out.println("(1)- Alumno " + clal + ":  "  + esc1.infoAlumnoClv(clal));
        
        // (2)- Promedio de todos los alumnos de esc1
        System.out.println("\n(2)3.0- Promedios de la escuela " + esc1.getNombreEscuela());
        System.out.println(esc1.calculoPromedioTodos()+"\n");
        
        // (3)- Alumno con mayor cantidad de materias aprobadas en Escuela Puebla
        System.out.println("(3)4.0- Alumno mayor numero de aprobadas ");
        System.out.println(esc1.mayorMateriasAprob()+"\n");        

        // Mas de un alumno con el maximo numero de materias aprobadas
        // Se agregan tres alumnos mas
        System.out.println("\n5.0- Se agregan tres alumnos mas ");
        esc1.altaAlumno(alu1); // repetido
        
        alu4 = new Alumno("Javier");
        alu4.altaCalificacion(9.3);
        alu4.altaCalificacion(8.6);
        alu4.altaCalificacion(9.7);
        esc1.altaAlumno(alu4);

        esc1.altaAlumno(alu1); // repetido

        // (2)- Promedio de todos los alumnos de esc1
        System.out.println("(2)6.0- Promedios de la escuela " + esc1.getNombreEscuela());
        System.out.println(esc1.calculoPromedioTodos()+"\n");
                
        // (4)- Alumno con mayor cantidad de materias aprobadas en Escuela Puebla
        System.out.println("(4)7.0- Alumno mayor numero de aprobadas ");
        System.out.println(esc1.mayorMateriasAprob()+"\n");
        
    }
    
}
