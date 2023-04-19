
import java.util.Arrays;
public class Proble3Main {

    public static void main(String[] args) {

        System.out.println("Axel Castro Lara 204092\n");

        // Pruebas de Problema 3. Recursividad.
        double [] vecd = { 0.0, 0.0, 0.0};
        System.out.println("Arreglo vd: " + Arrays.toString(vecd) + "\n");
        
        double [][] matcd= { { 1.1, 2.1, 3.1},
                             {4.1, 5.1, 6.1},
                             {7.1, 8.1, 9.1} };   
        System.out.println("Fila matriz[1]: " + Arrays.toString(matcd[1]) + "\n");
        
        try
        {
            sumaColsM(vecd, matcd, matcd.length-1, matcd[0].length);
        }catch(Exception error)
        {
            System.out.println(error);
        }
        
        System.out.println("Arreglo vd, comprobacion: " + Arrays.toString(vecd) + "\n");
        System.out.println("Fila matriz[1], comprobacion: " + Arrays.toString(matcd[1]) + "\n");
    }

    public static void sumaColsM(double [] vector, double[][] matriz, int f, int c)
    {
        if(vector== null || matriz== null)
        {
            throw new RuntimeException("Matriz o vector en null");
        }
        
        if(c==0)
        {
            vector[0]= sumaCol(matriz,matriz.length-1,0);
        }
        else
        {
            if(c>0)
            {
                sumaColsM(vector,matriz,f,c-1);
            }
            vector[c-1]=sumaCol(matriz,matriz.length-1,c-1);
        }
    }
    
    public static double sumaCol(double mat[][], int f, int c) {
        double suma = 0;
        if(f==0)
        {
            suma= mat[0][c];
        }
        else
        {
            if(c>=0)
            {
                suma=sumaCol(mat,f-1,c);
            }
            suma+= mat[f][c];
        }
        return suma;
    }
}
