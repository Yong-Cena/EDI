/*
 * Clase con metodos para revisar un String expresionStr aritmetica con
 * Parentesis Balanceados, izquierdos ( y derechos ).
 */
package Problema12;
import Stacks.*;

/**
 * Clase RevisorParentesis del ejercicio 12
 * E.g. (10+12)*(40+50/2)
 * @author EDg1
 */
public class RevisorParentesis {
    // String donde va la cadena de la expresion
    String expresionStr = "";

    // Constructor
    public RevisorParentesis( String expresion ) {
        if( expresion == null ) throw new
                ADTsException("RevisorParentesis: expresion null.");

        expresionStr = expresion;
    }
    public RevisorParentesis() {
        // expresion esta vacia.
    }

    //Determina si la expresionStr tiene los parentesis balanceados.
    public boolean esParenteBalan() {
        String expreAritStr= expresionStr.replace(" ", "");
        System.out.println("    esParenteBalan() " + expreAritStr);
        int tam = expreAritStr.length();    //Tamaño de la expresionStr.
        ArrayStack <Character> stackParen= new ArrayStack(tam);
        boolean resp = true;
        int i= 0;
        char c;

        //Recorrido de la expresionStr, caracter por caracter.
        while( (i < tam) && resp ) {
            c = expreAritStr.charAt(i);
            switch(c)
            {
                case '(':
                    stackParen.push(c);
                    break;
                case ')':
                    if(!stackParen.isEmpty())
                    {
                        stackParen.pop();
                    }
                    else
                    {
                        resp=false;
                    }
                    break;
                default:
                    break;
            }
            i= i+1;
        }
        
        while(!stackParen.isEmpty())
        {
            stackParen.pop();
            resp=false;
            
        }
        return resp;
    }    
}
