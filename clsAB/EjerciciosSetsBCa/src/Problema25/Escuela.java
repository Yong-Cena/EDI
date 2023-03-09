
package Problema25;
import ADTsException.ADTsException;
import Sets.*;
import java.util.Iterator;

/**
 *
 * @author EDI
 */
public class Escuela {
    // ATRIBUTOS
    private String nomEsc;
    private String dirEsc;
    private ArraySet<Alumno> alumsIng;
    private ArraySet<Alumno> alumsLic;
    private final int MaxAlum= 20;
    
    // CONSTRUCTORES
    public Escuela(String nom, String dir) {
        if( nom==null || dir==null) throw new 
            ADTsException("Problema25.Escuela.Escuela(..): nom o dir null.\n");
        nomEsc= nom;
        dirEsc= dir;
        alumsIng= new ArraySet(MaxAlum);
        alumsLic= new ArraySet(MaxAlum);
    }
    
    public Escuela() {
        this("NomVacio", "DirVacio");
    }
    
    // GETTERS and SETTERS

    // METODOS DE APLICACION
    // 1) Agregar alumnos a cualquiera de los conjuntos.
    public boolean agregaAlum(Alumno al, char il) {
        if( al==null ) throw new 
            ADTsException("Problema25.Escuela.agregaAlum(): al null.\n");
        
        // para il: 'I' es ingenieria, 'L' es licenciatura
        boolean seAgrega= true;
        if(alumsIng.contains(al) && alumsLic.contains(al)){
            seAgrega=false;
        }
        else{
            /*switch(il)
            {
                case 'I':
                    if(alumsIng.contains(al))
                    {
                        seAgrega=false;
                    }
                    else
                    {
                        alumsIng.add(al);
                    }
                    break;
                    
                case 'L':
                    if(alumsLic.contains(al))
                    {
                        seAgrega=false;
                    }
                    else
                    {
                        alumsLic.add(al);
                    }
                    break;
            }
*/
        switch(il){
            case 'I':
                alumsIng.add(al);
                break;
            case 'L':
                alumsLic.add(al);
                break;
                    
        }
        }

        return seAgrega;
    }
    
    // 2) Quitar un alumno de cualquiera de los conjuntos.
    public boolean quitaAlum(Alumno al, char il) {
        if( al==null ) throw new 
            ADTsException("Problema25.Escuela.agregaAlum(): al null.\n");
        
        boolean seQuita= false;
        switch(il){
            case 'I':
                if(alumsIng.contains(al)){
                alumsIng.remove(al);
                seQuita=true;}
                break;
            case 'L':
                if(alumsLic.contains(al)){
                alumsLic.remove(al);
                seQuita=true;}
                break;
                    
        }
        
        return seQuita;
    }
    
    // 3) Generar y regresar un conjunto formado con todos los alumnos
    //    de la escuela.
    public ArraySet<Alumno> conjTdAlum() {
        ArraySet<Alumno> nvoSet;
        // TODO ????
        nvoSet = new ArraySet(); 
        nvoSet.addAll(alumsIng);
        nvoSet.addAll(alumsLic);
        return nvoSet;
    }
    
    // 4) Generar y regresar un conjunto formado con todos los alumnos
    //    que están cursando una ingeniería y una licenciatura.
    public ArraySet<Alumno> conjTdAlumUnaIyL() {
        ArraySet<Alumno> nvoSet;
        
        nvoSet = new ArraySet();
        nvoSet.addAll(alumsIng.intersection(alumsLic));
        return nvoSet;
    }

    // 5) Generar y regresar un conjunto formado con todos los alumnos
    //    que están cursando solamente una ingeniería o una licenciatura.
    public ArraySet<Alumno> conjTdAlumUnaIoL() {
        ArraySet<Alumno> nvoSet, auxSet;
        
        nvoSet = new ArraySet();  // vacio
        nvoSet.addAll(conjTdAlumUnaIyL().difference(alumsIng));
        nvoSet.addAll(conjTdAlumUnaIyL().difference(alumsLic));      
        return nvoSet;
    }
    
    // 6) Calcular y regresar el promedio de edad de todos los alumnos
    //    de Ingeniería
    public double promAlumsIng() {
        int taing= 0; 
        int contalum=0;// Contador  
        double prom= 0.0;
        
        // TODO ????
        ArrayIterator<Alumno> it= (ArrayIterator<Alumno>)alumsIng.iterator();
        while(it.hasNext()){
            Alumno al= it.next();
            taing=taing+al.getEdad();
            contalum++;
        }
        prom=taing/contalum;
        
        return prom;
    }
    
    // 7) Obtener y regresar el total de alumnos de Licenciatura
    //    que son mayores que una edad (la cual se recibe como parámetro).
    public int totAlumsLicEdad( int myed) {
        if( myed<=0 ) 
            throw new ADTsException("Problema25.Escuela.totAlumsLicEdad(): myed negativo.\n");
        
        int talicme= 0;    // Contador        
        ArrayIterator<Alumno> it= (ArrayIterator<Alumno>)alumsIng.iterator();
        while(it.hasNext()){
            Alumno al= it.next();
            if(al.getEdad()>myed)
                talicme++;
        }

        return talicme;
    }
        
    // PRINT OUT
    @Override
    public String toString() {
        return "Escuela{ nomEsc=" + nomEsc + ", dirEsc=" + dirEsc +
                ",\n alumnosIng=((" + alumsIng.toString() +
                ")),\n alumnosLic=((" + alumsLic.toString() + ")) }";
    }
       
}
