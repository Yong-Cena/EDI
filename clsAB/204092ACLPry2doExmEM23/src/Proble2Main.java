import Sets.*;
import java.util.Iterator;
import ADTsException.ADTsException;

public class Proble2Main {

    public static void main(String[] args) {

        System.out.println("Axel Castro Lara 204092\n");
        
        // Pruebas de Problema 2. Conjuntos.
        ArraySet<Integer> conI1, conI2, conI3, nulo=null;
        conI3= new ArraySet();
        conI1 = new ArraySet();
        conI1.add(110);    conI1.add(220);    conI1.add(330);
        conI1.add(440);    conI1.add(550);    conI1.add(660);
        conI1.add(770);    conI1.add(880);    conI1.add(990);
        System.out.println("    conI1: " + conI1.toString());
   
        conI2 = new ArraySet();
        conI2.add(110);    conI2.add(550);    conI2.add(990);
        System.out.println("    conI2: " + conI2.toString());
        
        
        try
        {
            System.out.println("Ejemplo 1: "+subconjun(conI1,conI2));
        
            System.out.println("Ejemplo 2: "+subconjun(conI2,conI1));
        
            System.out.println("Ejemplo 3: "+subconjun(conI3,conI2));
            
            System.out.println("Ejemplo 4: "+subconjun(nulo,conI2));
            
        }catch(Exception error)
        {
            System.out.println(error);
        }
        
        
        System.out.println("Comprobacion: \n"+conI1.toString()+"\n"+conI2.toString());
        
    }

    public static <T> boolean subconjun(SetADT<T> seta, SetADT<T> setb)
    {
        if(seta==null || setb==null)
        {
            throw new RuntimeException("Alguno de los conjuntos es null");
        }
        boolean respuesta=true, ciclo=true;
        
        if(seta.size()>0)
        {
            Iterator<T> iteradora= seta.iterator();
            
            while(iteradora.hasNext() && ciclo==true)
            {
                T a1= iteradora.next();
                if(!setb.contains(a1))
                {
                    respuesta=false;
                    ciclo=false;
                }
            }
        }
        
        return respuesta;
    }

}
