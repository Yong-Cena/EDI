/**
 * BingoBall is a ball used in the Bingo game.
 *
 * @author EDI
 */

package BingoGame;
import ADTsException.*;

public class BingoBall {
  private char letter;
  private int number;
  
  /**
   * Sets up this Bingo ball with the specified number and the
   * appropriate letter.
   */
    //Constructor
    public BingoBall (int num) throws ADTsException {
        if( num<1 || num>75)
            throw new ADTsException("BingoGame.BingoBall.BingoBall(): num<1 or num>75.\n");
        number = num;
    
        if(num<=15)
        {
            letter='B';
        }
        else
        {
            if(num<=30)
            {
                letter='I';
            }
            else
            {
                if(num<=45)
                {
                    letter='N';
                }
                else
                {
                    if(num<=60)
                    {
                        letter='G';
                    }
                    else
                    {
                        letter='O';
                    }
                }
            }
        }
        // 01 - 15: letter = 'B';   
        // 16 - 30: letter = 'I';   
        // 31 - 45: letter = 'N';   
        // 46 - 60: letter = 'G'; 
        // 61 - 75: letter = 'O';    
    }

    // Get-ters
    public char getLetter() {
        return letter;
    }

    public int getNumber() {
        return number;
    }

    // equals(...)
    @Override
    public boolean equals(Object otroObj) {
        if( otroObj==null ) throw new
            ADTsException("equals(): otroObj null."); 

        boolean br= true;
        if( this != otroObj ) {
            // No es el mismo objeto, y no se sabe si es de clase ThisClass
            br= false;
            if( otroObj instanceof BingoBall ) {
                // Objeto existente y de clase ThisClass
                BingoBall TC = (BingoBall) otroObj;
                br = (this.number==TC.number);                  
                /*                
                br = br && (this.atribu3 <equals> TC.atribu3);
                // . . .                  
                br = br && (this.atribuN <equals> TC.atribuN);
                */
            }            
        }
        return br;
    }
    
  /**
   * Returns a string representation of this bingo ball.
   */
    @Override
    public String toString() {
        return " {" + letter + "," + number + "} ";
    }
    
}
