import Queues.*;
import ADTsException.ADTsException;

public class Proble1Main {

    public static void main(String[] args) {

        System.out.println("Problema 1. Axel Castro Lara 204092\n");
        
        // Pruebas de Problema 1. Colas.
        CArrayQueue<Integer> caudaI1,caudaI2;
        caudaI1 = new CArrayQueue();
        caudaI2= new CArrayQueue();

        caudaI1.enqueue(34);    caudaI1.enqueue(45);    caudaI1.enqueue(56);
        caudaI1.enqueue(34);    caudaI1.enqueue(45);    caudaI1.enqueue(34);
        System.out.println("caudaI: " + caudaI1.toString());        
        int datoI;
        resul2val rv;
        
        try
        {
            datoI = 87;
            rv= datumVecesR(caudaI1, datoI);
            System.out.println("p1.1) dato " + datoI + " repetido: " +
                rv.geti() + " veces, " + rv.getb());        
        
            datoI= 56;
            rv= datumVecesR(caudaI1, datoI);
            System.out.println("p1.2) dato " + datoI + " repetido: " +
                rv.geti() + " veces, " + rv.getb()); 
        
            datoI= 45;
            rv= datumVecesR(caudaI1, datoI);
            System.out.println("p1.3) dato " + datoI + " repetido: " +
                rv.geti() + " veces, " + rv.getb()); 
        
            rv= datumVecesR(caudaI2, datoI);
            System.out.println("p1.4) dato " + datoI + " repetido: " +
                rv.geti() + " veces, " + rv.getb());
            
            caudaI2=null;
            System.out.print("p1.5) null: ");
            rv= datumVecesR(caudaI2, datoI);
            
        }catch(Exception error)
        {
            System.out.println(error);
        }
        
        System.out.println("caudaI, comprobacion: " + caudaI1.toString() + "\n");
    }


    public static <T> resul2val datumVecesR(
            CArrayQueue<T> cauda, T datum) {
        
        resul2val dosval= new resul2val();
        T e1;
        int veces=0;
        
        if(cauda==null || datum==null)  
        {
            throw new RuntimeException("Arreglo o dato son null");
        }
        
        if(cauda.size()>0)
        {
            CArrayQueue<T> caudaI2= new CArrayQueue(cauda.size());
 
            if(cauda.first() instanceof Integer)
            {
                while(!cauda.isEmpty())
                {
                    e1= cauda.dequeue();
                    if(e1==datum)
                    {
                        ++veces;
                    }
                    caudaI2.enqueue(e1);
                }
                
                if(veces>=2)
                {
                    dosval.setb(true);
                }
                else
                {
                    dosval.setb(false);
                }
                dosval.seti(veces);
                
                while(!caudaI2.isEmpty())
                {
                    cauda.enqueue(caudaI2.dequeue());
                }
            }
            else
            {
                throw new RuntimeException("La cola no contiene datos Integer");
            }
        }
        else
        {
            dosval.setb(false);
            dosval.seti(0);
        }
        return dosval;
    }
    
}
