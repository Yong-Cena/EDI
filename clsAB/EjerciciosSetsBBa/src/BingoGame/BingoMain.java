/**
 * Bingo problem.
 *
 * @author EDI
 */

package BingoGame;
import ADTsException.ADTsException;
import Sets.*;
import java.util.*;

public class BingoMain {
  /**
   * Creates all 75 BingoMain balls and stores them in a set. Then
   * pulls several balls from the set at random and prints them.
   */
    public static void main (String[] args) {
        // Total among of BingoBalls, Total number of BingoBalls draws
        final int NBBalls = 75, NBBDraws = 10;
        
        // Create a BSphere of BingoBalls.
        ArraySet<BingoBall> BSphere= new ArraySet(NBBalls);
        
        // Create the BingoBalls: 1..NBBalls and aggregate to the BSphere
        rellenaEsfera(BSphere,NBBalls);
          
        // Print out the BingoBalls of BSphere
        System.out.println("BingoBalls en esfera: \n"+BSphere.toString());
                
        // Is BingoBall(65) inside BSphere?
        System.out.println("Esta 65. "+BSphere.contains(new BingoBall(65)));
        
        // Is BingoBall(80) inside BSphere?
        try{
        System.out.println("Esta 80. "+BSphere.contains(new BingoBall(80)));
        }
        catch(Exception error)
        {
            System.out.println("No existe el BingoBall 80");
        }
        // Prize done?, Build a set of letters for the BingoPrize.
        ArraySet<Character> resultado= new ArraySet(5);
        for(int i=0; i<10;i++)
        {
            char letra= BSphere.removeRandom().getLetter();
            resultado.add(letra);
        }
        
        if(resultado.size()==5)
        {
            System.out.println("Ganaste");
        }
        else
        {
            System.out.println("No ganaste nada");
        }
        // Do the random drawing of BingoBalls from the BSphere 
  
        // Is a prize there?
        
        // Which numbers were not drawn, and how many.
    }
    
    // Create and Place BingoBalls inside the Sphere disposer
    public static <T> void rellenaEsfera(ArraySet<T> esfera, int nPelotas)
    {
        for(int i=1;i<=nPelotas;i++)
        {
            esfera.add((T)new BingoBall(i));
        }
    }
    
    // Do the random drawing of BingoBalls from the BSphere
    
}
