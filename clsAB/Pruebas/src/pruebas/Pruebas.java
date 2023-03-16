
package pruebas;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Pruebas {

    public static void main(String[] args) {
       StringTokenizer st1= new StringTokenizer("Hola/*+-Mundo","+-*/");
       
       while(st1.hasMoreTokens())
       {
           System.out.println(st1.nextToken());
       }
       
       
    }
}
