
package Problema09;

/**
 * Problema 09
 * @author EDg3
 */
public class FigGeo09Poli <T>{

    //Atributos
    //private FigGeometrica [] arrFigG;
    private T [] arrFig;
    private final int MAX = 20;
    private int contFigG;
    
    // Constructor
    // 1) Define un arreglo polimorfico de figuras geometricas.
    public FigGeo09Poli() {
        contFigG = 0;
        arrFig = (T[])(new Object[MAX]);
    }
    
    // 2) Dar de alta figuras geometricas, si caben.
    public boolean altaFigG(T fg) {
        if(fg==null) throw new
                RuntimeException("altaFigG(): fg null.\n");
        boolean bo = false;
        if(contFigG < MAX) {
            arrFig[contFigG] = fg;
            contFigG++;
            bo = true;
        }
        return bo;
    }
    
    // 3) toString()                                                            
    @Override
    public String toString() {
        String cade= "";
        for(int i=0; i< contFigG; i++) {
            cade= cade + arrFig[i].toString() + "\n";
        }
        return cade;
    }
    
    // 4) Calcula e Imprime el Area de todas las figuras almacenadas.
    public String ceiAreaToFigG() {
        String cade = "NO HAY 4";
        // ???
        double x= ((FigGeometrica)arrFig[0]).calculaArea();
        return cade;
    } 
    
    // 5) Encuentra e imprime los datos del circulo mas grande, por radio.
    public String eeiMayCirculo() {
        String cade = "NO HAY 5";
        // ???  
        return cade;
    }
    
    // 6) Calcula e imprime el total de cuadrados.
    public String ceiTotCuadra() {
        String cade = "NO HAY 6";
        // ???
        return cade;        
    }
    
    // 7) Eliminar todos los triangulos equilateros. 
    // Algoritmo: se reduce el arreglo, pasando la última FigGeo
    // a la posición del tringulo equilatero eliminado.
    // Se reduce la cantidad de FigGeo
    public void eliTrianEqui() 
    {
        int i=0;
        while(i<contFigG)
        {
            if(arrFig[i] instanceof Triangulo)
            {
                if(((Triangulo)arrFig[i]).esEquila())
                {
                    arrFig[i]=arrFig[contFigG-1];
                    contFigG--;
                    arrFig[contFigG]=null;
                }
            }
            else
            {
                i++;
            }   
        }
    }

    // 8) Ordenar las figuras geométricas, de menor a mayor area
    public void ordAreaFigGeo() {
        // ????
    }
    
}
