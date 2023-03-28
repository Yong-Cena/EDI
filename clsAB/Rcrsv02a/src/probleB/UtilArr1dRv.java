package probleB;

/**
 * Problema clase UtilArr1d
 * @author EDI
 */
public class UtilArr1dRv  {
    private double [] arrd;
    
    public UtilArr1dRv( double [] arrduser) {
        arrd= arrduser;
    }
    
    // 1)- toString para arrd, donde index contiene el indice del ultimo elemento.
    public String toStringdRv(int index) { 
       String result;
        if( index <= 0 ) {  // Caso o casos base
            result= "" + arrd[0];
        } else {  // Caso o casos recursivos, index > 0
            result= toStringdRv(index-1)  + " " + arrd[index];
        }
        return result;
    }                

    // 2)- suma matricial de dos vectores.
    public void sumVecdRv(double [] R, double [] B, int iu ) {
        if(iu<=0)
        {
            R[0]= arrd[0]+B[0];
        }
        else
        {
            sumVecdRv(R,B,iu-1);
            R[iu]=arrd[iu]+B[iu];
        }
    }
    
    // 3)- Busqueda secuencial.
    public int buscaSecRv(int ne, double dato) {            
        if (arrd==null || ne<-1 || ne>arrd.length-1) throw new
            RuntimeException("buscaSecRv: nulo o fuera de rango.\n");
        int pos;
        if(ne<0)
        {
            pos= -1;
        }
        else
        {
            if(arrd[ne]==dato)
            {
                pos=ne;
            }
            else
            {
                pos=buscaSecRv(ne-1, dato);
            }
        }
        return pos;
    }

    // 4)- Posición del mayor.
    public int posMayRv(int ne) {
        if ( arrd==null || ne<0 || ne>arrd.length-1 ) {
            throw new RuntimeException("posMayRv: nulo o fuera de rango.\n");
        }
        
        int pos=0;
        if(ne==0)
        {
            pos=0;
        }
        else
        {
            pos=posMayRv(ne-1);
            if(arrd[pos]<arrd[ne-1])
            {
             pos=ne;   
            }
        }

        return pos;
    }
    
}
