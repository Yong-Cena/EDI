
package Problema09;
import java.util.Scanner;

/**
 * Problema 09
 * Autores:
 * Castro Lara Axel
 * Cervantes Silva Francisco Emilio
 * Reyes Hernandez Carla
 * Utrilla Hernandez Arturo
 */
public class AplicaMain09 {

    public static void main(String[] args) {
        System.out.println("Autores: \nCastro Lara Axel\nCervantes Silva Francisco Emilio\n"
                + "Reyes Hernandez Carla\nUtrilla Hernandez Arturo");
        Triangulo tri;
        Circulo cir;
        Cuadrado cua;
        Rectangulo rec;
        
        tri = new Triangulo(6.0, 5.0, 7.0);        
        cir = new Circulo(5.0);
        cua = new Cuadrado(10.0);        
        rec = new Rectangulo(6.0, 8.0);
        
        System.out.println("\n ---- Pruebas09 1), 2), y 3) Todo clase----");
        // 1)
        FigGeo09Poli <FigGeometrica> afigg = new FigGeo09Poli();
        
        // 2)
        afigg.altaFigG(tri);
        afigg.altaFigG(cir);
        afigg.altaFigG(cua);
        afigg.altaFigG(rec);
        Triangulo tri1 = new Triangulo(11.0, 11.0, 11.0);
        afigg.altaFigG(tri1);        
        Circulo cir1 = new Circulo(20.0);
        afigg.altaFigG(cir1);

        // A)        
        System.out.println("\n ---- Pruebas09 Menu A) Todo FigGeo----");
        menu(afigg);
/*
        System.out.println("\n ---- Pruebas09 1), 2), y 3) Solo circulos----");
        // 1)
        FigGeo09Poli <Circulo> afiggCir = new FigGeo09Poli();
        afiggCir.altaFigG(cir);
        afiggCir.altaFigG(cir1);
        afiggCir.altaFigG(new Circulo(10.0));
*/        
        System.out.println("ADIOS");
    }
    
    private static void menu(FigGeo09Poli afg) {
        Scanner keyboard = new Scanner(System.in);
        int sel = 0;
        while( sel != 9 ) {
            System.out.print(
              "\nSeleccione un numero de inciso (3 a 8)\n" +
              "  3) Imprimir la información de todas las figuras almacenadas.\n" +
              "  4) Calcular e imprimir el area de todas las figuras almacenadas.\n" +
              "  5) Encontrar e imprimir los datos del círculo más grande.\n" +
              "  6) Calcular e imprimir el total de cuadrados.\n" +
              "  7) Eliminar todos los triangulos equilateros.\n" +
              "  8) Ordena areas de las figuras de menor a mayor. \n" +
              "  9) SALIR DEL MENU.\n"+
              "Tecle un numero de inciso: ");
            sel = keyboard.nextInt();
            switch(sel) {
                case 3:
                    System.out.println("\n ---- Pruebas09 3) ----");
                    System.out.println(afg.toString());
                    break;
                case 4:
                    System.out.println("\n ---- Pruebas09 4) ----");
                    System.out.println(afg.ceiAreaToFigG());
                    break;
                case 5:
                    System.out.println("\n ---- Pruebas09 5) ----");
                    System.out.println("Mayor Circulo: " + afg.eeiMayCirculo());
                    break;
                case 6:
                    System.out.println("\n ---- Pruebas09 6) ----");
                    System.out.println("Total de Cuadrados: " + afg.ceiTotCuadra());
                    break;
                case 7:
                    System.out.println("\n ---- Pruebas09 7) ----");
                    afg.eliTrianEqui();
                    System.out.println("Triangulos equilateros eliminados");
                    break;
                case 8:
                    System.out.println("\n ---- Pruebas09 8) ---- \n");
                    afg.ordAreaFigGeo();
                    System.out.println("Figuras ordenadas");
                    break;
                case 9:
                    System.out.println("\nSaliendo del MENU.\n");
                    break;
                default:
                    System.out.println("\nERROR: numero fuera de rango 3 a 8.");
                    break;
            }          
        }
    }
    
}
