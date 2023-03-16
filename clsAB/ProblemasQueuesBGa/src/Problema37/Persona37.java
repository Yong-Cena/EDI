package Problema37;
import java.util.Calendar;
import ADTsException.ADTsException;

/**
 * Problema 37
 * @author EDI
 */
public class Persona37 implements Comparable<Persona37> {
    private int dia, mes, anio;
    private String nombre;
    
    public Persona37() {
        this(1,1,3000,"vacio");
    }
    
    public Persona37(int d, int m, int a, String nom) {
        dia = d;    mes = m;    anio = a;
        nombre = nom;
    }
    
    public String toString() {
        // TODO...
        String cade;
        cade = "[ Nombre: " + nombre +
                ", Nac: " + dia + "-" + mes + "-" + anio +
                ", Edad: " + getEdad31dicAct() + " ]";
        return cade;
    }
    
    // Calcula la edad al 31 de diciembre del año actual
    public int getEdad31dicAct() {
        int edad;
        // TODO...
        // Obtencion del anhio actual
        Calendar cal= Calendar.getInstance();
        int anioAct= cal.get(Calendar.YEAR);
        
        // Edad al 31 de diciembre del anio actual
        edad= anioAct-anio;
        return edad;
    }
    
    // int compareTo(otra) de la interface Comparable<T>;
    // <0: this<otra;  0: iguales;  >0: this>otra
    public int compareTo(Persona37 otra) {
        if ( otra == null ) throw new
            ADTsException("compareTo(...): otra null.\n");
   
        int edad1, edad2;
        edad1= getEdad31dicAct();
        edad2= otra.getEdad31dicAct();
        int result= edad1-edad2;
        
        return result;
    }
    
    
}
