package Problema51Lists;
import Lists.*;
import java.util.*;
import java.io.*;

/**
 * Problema 51, aplicación de Listas Ordenadas
 * @author EDg1
 */
public class PaisesDeAmerica{

    private LnkOrdList<Pais> PaisesAmericanos= new LnkOrdList();

    // Getter
    public LnkOrdList<Pais> getListaPaisesAmericanos() {
        return PaisesAmericanos;
    }

    /**
    * Lee los países de cada zona.
    * @param nomArch Recibe el nombre del archivo de datos.
    * @param lista Aquí guarda los paises leidos.
    */
    public void leePaisesZo(String nomArch, LnkOrdList<Pais> lista) {
        String nombre;
        Pais p;

        //Lectura del nombre de los países de una zona y guardado su lista.
        Scanner leer;
        File archivo= new File(nomArch);
        
        try
        {
            leer= new Scanner(archivo);
            while(leer.hasNext())
            {
                nombre= leer.nextLine();
                p= new Pais(nombre);
                lista.add(p);
            }
            leer.close();
            
        }catch(Exception error)
        {
            System.out.println(error);
        }
        
    }
  
    /**
    * Metodo que toma una lista como parametro y agrega sus elementos a la
    * lista de PaisesAmericanos.
    * @param lista países a agregar a Amerioa.
    */
    public void agregaPaisesAm(LnkOrdList<Pais> lista) {
        Iterator<Pais> it= lista.iterator();
        
        while(it.hasNext())
        {
            PaisesAmericanos.add(it.next());
        }
    }
    
}
