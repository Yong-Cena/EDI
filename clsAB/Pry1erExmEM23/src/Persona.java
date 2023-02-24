
/**
 *
 * @author EDI
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String n,int e) {
        nombre=n;
        edad=e;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String toString() {
        StringBuilder sb=new StringBuilder("");
        
        sb.append(nombre+" ");
        sb.append(edad);
        
        return sb.toString();
    }
}
