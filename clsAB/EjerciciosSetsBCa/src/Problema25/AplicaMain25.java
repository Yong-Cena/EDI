
package Problema25;
import Sets.*;

/**
 *
 * @author EDI
 */
public class AplicaMain25 {

    public static void main(String[] args) {
        // PRUEBAS CON ALUMNOS
        Alumno a1= new Alumno("Salma", 20);
        System.out.println("A.1 - a1: " + a1.toString());
        Alumno a2= new Alumno("Roberto", 21);  
        System.out.println("\nA.2 - a1.equals(a2): " + a1.equals(a2));
        System.out.println("A.3 - a2.equals(a2): " + a2.equals(a2));
        
        // PRUEBAS CON LA ESCUELA
        Escuela e1= new Escuela("Unica", "Aqui");
        // 1) AGREGAR
        e1.agregaAlum(a1, 'I');
        e1.agregaAlum(a1, 'L');
        e1.agregaAlum(a2, 'I');
        e1.agregaAlum(a2, 'L');
        Alumno a3= new Alumno("Jessica", 19);
        Alumno a4= new Alumno("Gerardo", 22);
        e1.agregaAlum(a3, 'I');
        e1.agregaAlum(a4, 'L');
        System.out.println("\n1.0 - Agregando, e1.toString():" + e1.toString());

      
        // 2) QUITAR
        System.out.println("\n2.0 - Quitando, e1.quitaAlum(a3,'I'):" +
                e1.quitaAlum(a3,'I') );
        System.out.println("2.1 - Quitando, e1.toString():" + e1.toString());
        
        System.out.println("\n2.2 - Quitando, e1.quitaAlum(a4,'L'):" +
                e1.quitaAlum(a4,'L') );
        System.out.println("2.3 - Quitando, e1.toString():" + e1.toString());
        
        Alumno a5= new Alumno("Jeronimo", 24);
        e1.agregaAlum(a5, 'L');
        System.out.println("2.3 - Agregando, e1.toString():" + e1.toString());
       
        // 3)
        ArraySet<Alumno> set3= e1.conjTdAlum();
        System.out.println("\n3.0 - Cadena de todos los alumnos: " +
                "\n  " + set3.toString());
   
        // 4)
        ArraySet<Alumno> set4= e1.conjTdAlumUnaIyL();
        System.out.println("\n4.0 - Cadena de todos los alumnos" +
                "que están cursando una ingeniería y una licenciatura: " +
                "\n  " + set4.toString());
        
        // 5)
        ArraySet<Alumno> set5= e1.conjTdAlumUnaIoL();
        System.out.println("\n5.0 - Cadena de todos los alumnos" +
                "que están cursando una ingeniería o una licenciatura: " +
                "\n  " + set5.toString());
        
        // 6)
        System.out.println("\n6.0 - Promedio de edad de todos los " +
                "alumnos de ingeniería: " + e1.promAlumsIng() );        

        // 7)
        System.out.println("\n7.0 - Alumnos de Licenciatura con " +
                "edad mayor a 22: " + e1.totAlumsLicEdad(20) );              
        
    }
    
}
