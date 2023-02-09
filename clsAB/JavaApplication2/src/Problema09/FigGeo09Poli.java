
package Problema09;

/**
 * Problema 09
 * @author EDg3
 * Castro Lara Axel
 * Cervantes Silva Francisco Emilio
 * Reyes Hernandez Carla
 * Utrilla Hernandez Arturo
 */
public class FigGeo09Poli <T>{

    //Atributos
    private T [] arrFigG;
    private final int MAX = 20;
    private int contFigG;
    
    // Constructor
    // 1) Define un arreglo polimorfico de figuras geometricas.
    public FigGeo09Poli() {
        contFigG = 0;
        //arrFigG = new FigGeometrica[MAX];
        arrFigG = (T[])(new Object [MAX]);
    }
    
    // 2) Dar de alta figuras geometricas, si caben.
    public boolean altaFigG(T fg) {
        if(fg==null) throw new
                RuntimeException("altaFigG(): fg null.\n");
        boolean bo = false;
        if(contFigG < MAX) {
            arrFigG[contFigG] = fg;
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
            cade= cade + arrFigG[i].toString() + "\n";
        }
        return cade;
    }
    
    // 4) Calcula e Imprime el Area de todas las figuras almacenadas.
    public String ceiAreaToFigG() {
        String cade = "NO HAY 4";
        //double x = ((FigGeometrica)arrFigG[0]).calculaArea();
        double area = 0;
        for (int i = 0; i<contFigG; i++){
            area = area + ((FigGeometrica)arrFigG[i]).calculaArea();
        }
        cade = "Area total de las figuras: "+ Double.toString(area);
        return cade;
    } 
    
    // 5) Encuentra e imprime los datos del circulo mas grande, por radio.
    public String eeiMayCirculo() {
        String cade = "NO HAY 5";
        double  mayor = 0;
        int pos = 0;
        for (int i = 0; i<contFigG; i++){
            if (arrFigG[i] instanceof Circulo){
                if (((Circulo)arrFigG[i]).getRadio()> mayor){
                    mayor = ((Circulo)arrFigG[i]).getRadio();
                    pos = i;
                }
            }
        }

        return "El circulo con más grande es : " + arrFigG[pos].toString();
    }
    
    // 6) Calcula e imprime el total de cuadrados.
    public String ceiTotCuadra() {
        String cade = "NO HAY 6";
        int cuentaCua = 0;
        for (int i = 0; i < contFigG; i++) {
            if ( arrFigG[i] instanceof Cuadrado) {
                cuentaCua++;
            }
        }  
        if (cuentaCua > 0) {
            cade = Integer.toString(cuentaCua);
        }
        return cade;        
    }
    
    // 7) Eliminar todos los triangulos equilateros. 
    // Algoritmo: se reduce el arreglo, pasando la última FigGeo
    // a la posición del tringulo equilatero eliminado.
    // Se reduce la cantidad de FigGeo
    public void eliTrianEqui() {
        
        int i = 0;
        while (i < contFigG){
            if (arrFigG[i] instanceof Triangulo && ((Triangulo)arrFigG[i]).esEquila()){
                contFigG--;
                arrFigG[i]=arrFigG[contFigG];
                arrFigG[contFigG]= null;
            }
            else{
                i++;
            }
        }
    }

    // 8) Ordenar las figuras geométricas, de menor a mayor area
    public void ordAreaFigGeo() {
        int j;
       for (int i = 0; i<contFigG; i++){
           int min = i;
           
           /*
           j=i+1;
           while(j<contFigG)
           {
               
           }
           */
           for (j = i+1; j<contFigG; j++){
               if (((FigGeometrica)arrFigG[j]).calculaArea()<((FigGeometrica)arrFigG[min]).calculaArea()){
                   min = j;
               }
           }
           
           T [] aux = (T[])(new Object [1]);
           aux [0]= arrFigG[min];
           arrFigG[min] = arrFigG [i];
           arrFigG [i] = aux [0];  
       }
    }
    
}