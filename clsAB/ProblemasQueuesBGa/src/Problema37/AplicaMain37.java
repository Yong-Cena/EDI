package Problema37;
import Queues.*;
import ADTsException.ADTsException;


/**
 * Problema 37 
 * @since Today
 * @author EDI
 * @version 3.6
 */
public class AplicaMain37 {
    
    public static void main(String[] args) {
        
        // Instanciar objetos Persona
        Persona37 per1 = new Persona37(2,6,2010,"Alfonso");
        System.out.println(" Persona37: " + per1.toString());
        
        Persona37 per2 = new Persona37(12,11,2005,"Renata");
        System.out.println(" Persona37: " + per2.toString());
       
        // Creacion de una estructura Queue
        CArrayQueue<Persona37> q1 = new CArrayQueue(20); 
        q1.enqueue(per1);
        q1.enqueue(per2);
        Persona37 per3 = new Persona37(8,10,2003,"Alma");
        q1.enqueue(per3);
        Persona37 per4 = new Persona37(1,1,2001,"Mario");
        q1.enqueue(per4);
        System.out.println("\nq1 inicial: \n" + q1.toString() + "\n");

        // TODO...        
        // Edad de Renata al 31 de diciembre actual
        System.out.println("Edad de Renata al 31 de dic: " +
                per2.getEdad31dicAct());

        // Ordenar por edad la queue q1
        ordenxEdad(q1);
        System.out.println("\nq1 por edad: \n" + q1.toString() + "\n");   
        
    }

    /**
     * ordenaEdad(...) Ordena una cola por edad de Persona37s
     * @param que The queue of Persona37s
     */    
    public static void ordenxEdad(CArrayQueue<Persona37> que) {
        if(que==null) throw new
            ADTsException("ordenEdad(...): que null.\n");
        
        int index= 0, min;
        Persona37 [] arr= new Persona37[que.size()];
        Persona37 aux= new Persona37();
        
        while(!que.isEmpty())
        {
            arr[index]=que.dequeue();
            index++;
        }
        
        for(int i=0; i<que.size();i++)
        {
            min= i;
            for(int j=i+1;j<que.size();j++)
            {
                if(arr[j].getEdad31dicAct()>arr[min].getEdad31dicAct())
                {
                    min= j;
                }
            }
            
            aux= arr[min];
            arr[min]=arr[i];
            arr[i]=aux;
        }
        
        for (Persona37 arr1 : arr) {
            que.enqueue(arr1);
        }
    }
    
}
