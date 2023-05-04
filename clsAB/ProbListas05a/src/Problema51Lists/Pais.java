package Problema51Lists;

/**
 * Problema 51
 * Implementa la clase para guardar datos de un país.
 * Se debe implementar el método compareTo.
 * @author EDg1
 */

public class Pais implements Comparable {
  private String nombre;
  
  /**
   * Constructor que recibe el nombre del país para crear su objeto.
   * @param p
   */
  public Pais(String p) {
    nombre= p;
  }
  
  /**
   * Implementa la clase para guardar datos de un país.
   * Se debe implementar el método compareTo.
   * 
   * @param otro recibe el país a comparar
   * @return el resultados de la comparación del nombre de dos países.
   */
  public int compareTo(Object otro) {
    Pais p = (Pais) otro;
    
    return this.nombre.compareTo(p.nombre);
  }
  
  /** 
   * Método toString.
   * 
   * @return regresa la cadena con los atributos de país.
   */
  @Override
  public String toString() {
    return "Pais{ " + nombre + " }";
  }
  
}
