package problema31aRv;

/**
 * Clase para Operaciones sobre Arreglos Bidimensionales o Matrices,
 * implementadas por los métodos recursivos de mas abajo.
 * Problema 31.
 * @author EDg1
 */
public class OperMatricesRv {        
    
    /* 
    31a.1) sumaDiagonalPrincipal:
       Regresa la suma de los elementos de la diagonal principal.
       La matriz debe ser cuadrada.
       mn - total de renglones, y total de columnas, - 1
    */
    public double sumaDiagPrinMd(double A[][], int mn) {
        double suma = 0.0;
    
        if(mn==0)
        {
            suma=A[0][0];
        }
        else
        {
            suma+= sumaDiagPrinMd(A,mn-1)+A[mn][mn];
        }
        return suma;
    }    

    /**
     * Ejercicio 31a, 2):
     * Suma de los elementos de una matriz double, por renglones.
     * f- cantidad de filas-1; c- cantidad de columnas-1.
     */
    public double sumaRenMd(double mat[][], int f, int c) {
        double suma = 0.0;
        if(f==0 && c==0)
        {
            suma= mat[0][0];
        }
        else
        {
            if(c>0)
            {
                suma=sumaRenMd(mat,f,c-1);
            }
            else
            {
                suma= sumaRenMd(mat,f-1, mat[0].length-1);
            }
            suma+= mat[f][c];
        }
        return suma;
    }

    /**
     * Ejercicio 31a, 3):
     * Suma de los elementos de una matriz double, por columnas.
     * f- cantidad de filas-1; c- cantidad de columnas-1.
     */
    public double sumaColMd(double mat[][], int f, int c) {
        double suma = 0;
          if(f==0 && c==0)
        {
            suma= mat[0][0];
        }
        else
        {
            if(f>0)
            {
                suma=sumaColMd(mat,f-1,c);
            }
            else
            {
                suma= sumaColMd(mat,mat.length-1, c-1);
            }
            suma+= mat[f][c];
        }
        return suma;
    }
    
    /**
     * Ejercicio 31a, 4):
     * Regresa el contenido de la matriz en una cadena, por renglones.
     * f- cantidad de filas-1; c- cantidad de columnas-1.
     */
    public String toStringMd(double mat [][], int f, int c)
    {
        String cade= "";
        if(f==0 && c==0)
        {
            cade+= mat[0][0]+" ";
        }
        else
        {
            if(c>0)
            {
                cade=toStringMd(mat,f,c-1);
            }
            else
            {
                cade= toStringMd(mat,f-1, mat[0].length-1)+"\n";
            }
            cade+= mat[f][c]+" ";
        }
        return cade;
    }

    /* 
    31.5) sumaMatrices:
       Suma dos matrices y regresa la matriz resultado S=A+B.
       Matrices sumando A y B de la misma dimension "m"*"n".
       Recorrido por renglon.
       m - total de renglones-1; n - total de columnas-1
    */
    public void suma2Md(double S[][], double A[][], double B[][],
            int m, int n ) {
        
        if(m==0 && n==0)
        {
            S[0][0]= A[0][0]+B[0][0];
        }
        else
        {
            if(n>0)
            {
                suma2Md(S,A,B,m,n-1);
            }
            else
            {
                suma2Md(S,A,B,m-1,S[0].length-1);
            }
            S[m][n]= A[m][n]+B[m][n];
        }
    }
    
}
