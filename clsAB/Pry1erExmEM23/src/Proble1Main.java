import Stacks.ADTsException;
/**
 *
 * @author Axel Castro Lara
 * 21 de febrero del 2023
 */
public class Proble1Main {

    public static void main(String[] args) {
        System.out.println("Axel Castro Lara 204092" );
        
        String cadena;
        int numObj = 0;
        
        Object objArr [] = new Object[12];
        objArr[0]= new Integer(12);
        objArr[1]= new String("alfa489");
        objArr[2]= new Double(42.5);
        objArr[3]= "Antier fue +25";
        System.out.println("PRUEBA 0.1: objArr \n    " + toStringAPO(objArr, 4));
        cadena = calcStrMaxLen(objArr, 4);
        cadena = (cadena == null)? "No hay" : cadena;
        System.out.println("PRUEBA 0.2: cadena max: <" + cadena + ">\n");
        
        System.out.println("ADIOS.");
        
        System.out.println("PRUEBA 3");
        objArr[0]= new String("82");
        objArr[1]= new Persona("Elia",23);
        objArr[2]= new Integer(-534);
        cadena= calcStrMaxLen(objArr,3);
        System.out.println("Cadena max: "+cadena);
        
    }
    
    public static String calcStrMaxLen( Object [] arreglo, int numElem ) {
        String strMaxLen = null; // String de maxima longitud
        int tamStr, max=0;
        if(numElem>0)
        {
            for(int i=0; i<numElem;i++)
            {
                if(arreglo[i] instanceof String)
                {
                    tamStr= ((String)arreglo[i]).length(); 
                    if(tamStr>max)
                    {
                        max=tamStr;
                        strMaxLen= (String)arreglo[i];
                    }
                }
            }
        }
        return strMaxLen;
    }
    
    // Imprime el contenido del Arreglo Polimorfico de Objetos
    private static String toStringAPO( Object [] arreglo, int numElem ) {
        String cade;
        if (arreglo == null) {
            cade= "Referencia a arreglo: null.";
        } else {
            cade= "vacio";
            if( numElem > 0) {
                cade = "--{ ";
                for( int i = 0; i < numElem; i++) {
                    cade = cade + "[" + arreglo[i].toString() + "] ";
                }
                cade = cade + "}";
            }
        }
        return cade;
    }
}
