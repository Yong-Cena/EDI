
import Stacks.ADTsException;
/**
 *
 * @author Axel Castro Lara
 * 21 de febrero del 2023
 */
public class Proble3Main {

    public static void main(String[] args) {
        System.out.println("Escribe aqui tu nombre:  ,y clave unica: " );
        
        // Prueba #1:
        Object[] arreglo1={2.3, new Complejo(6,-4)};
        // Debería imprimir: 8.3:
        System.out.println("Resultado prueba #1: "+smValNum(arreglo1));
        
        // Prueba #2:
        Object[] arreglo2={false, -7, true, new Persona("Juan Pérez",23)};
        // Debería imprimir: 16.0:
        System.out.println("Resultado prueba #2: "+smValNum(arreglo2));
        
        System.out.println("ADIOS.");
        
        Object[] arreglo3={'8', 9, -2.5, false};
        System.out.println("Resultado prueba #3: "+smValNum(arreglo3));
        
        Object[] arreglo4= {true,"Elefante"};
        System.out.println("Resultado prueba #4: "+smValNum(arreglo4));
        
        Object[] arreglo5= {1,3,"3"};
        System.out.println("Resultado prueba #5: "+smValNum(arreglo5));
        
        Object[] arreglo6= new Object[1];
        System.out.println("Resultado prueba #6: "+smValNum(arreglo6));
        
        arreglo6=null;
        System.out.println("Resultado prueba #7: "+smValNum(arreglo6));
    
    }
    
    
    public static double smValNum(Object[] arr) {
        double suma;
        suma = 0.0;    // Acumulador
        String clase;
        
        if(arr!=null && arr[0]!=null)
        {
            for (int i=0; i<arr.length;i++) 
            {
                clase= arr[i].getClass().getSimpleName();
                switch(clase)
                {
                    case "Double":
                        suma+= (Double)arr[i];
                        break;
                    case "Integer":
                        suma+= (Integer)arr[i];
                        break;
                    case "Complejo":
                        suma+= ((Complejo)arr[i]).getParteReal();
                        break;
                    case "Persona":
                        suma+= ((Persona)arr[i]).getEdad();
                        break;
                    default:
                        break;
                }
            }
            
            if(suma==0)
            {
                suma=-9999.0;
            }
                
        }
        return suma;
    }
   
}
