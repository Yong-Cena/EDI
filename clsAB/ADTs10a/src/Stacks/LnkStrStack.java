/**
 * Problema 46. 
 * A Linked Structure implementation of a stack.
 * @author EDg1
 */

package Stacks;
import LnkStrwN.*;
import ADTsException.*;

public class LnkStrStack<T> implements StackADT<T> {

    // Linked Structure of generic elements to represent the stack.
    private LnkStrwN<T> stack;

    // Creates an empty stack using the default capacity.
    public LnkStrStack() {
        stack = new LnkStrwN();
    }

    // Pushes in or adds the specified element to the top of this stack.
    public void push (T element) {
        stack.add(element, 1);
    }
    
    // Pops out or removes the element at the top of this stack and returns a
    // reference to it.
    public T pop() throws ADTsException {
        return stack.remove(1);
    }

    // Peeks and returns a reference to the T element at the top of this stack.
    // The element is not removed from the stack.
    public T peek() throws ADTsException {
        return stack.get(1);
    }

    // isEmpty: returns true if this stack is empty and false otherwise.
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // size: returns the count (top) of elements in the stack.
    public int size() {
        return stack.size();
    }

    // Returns a string representation of this stack.
    @Override
    public String toString() {
        String result = "";
        if( isEmpty() ) {
            result = "LnkStrStack is <EMPTY>";
            // Could be thrown an EmptyCollectionException
        } else {
            String aux = stack.toString();
            int len = aux.length();
            //aux = aux.substring(15, len-4);
            result = "LnkStrStack is {TOP: " + aux + " :BASE} ";
        }

        return result;
    }

    
    // MORE
    /**  Returns the maximum length of this stack implementation. 
    */
    public int length() {
        return stack.size();        
    }
    
    /**  Removes n elements, if possible, and returns a boolean showing if
     *  the total remotion was done from this stack. 
    */    
    public boolean multiPop(int npops) {        
        boolean b = false;
        if( ( npops > 0 ) && ( npops <= size() ) ) {
            for( int i=0; i<npops; i++) {
                pop();
            }
            b = true;
        }
        // npops <= 0, no hay que hacer pop()s;
        // npops > size(), no se hacen pop()s; 
        
        return b;        
    }

    
    /**  Mixes two stacks, aggregating the elements of otherStack into
     * the local stack (this). The otraPila remains with the same elements.
    */    
    public  int  mezcla2Pilas(StackADT<T> otraPila) throws ADTsException {
        if (otraPila == null)
            throw new ADTsException("mezcla2Pilas: otraPila, null.\n");
        
        LnkStrStack<T> paux1 = new LnkStrStack();
        LnkStrStack<T> paux2 = new LnkStrStack();
        
        // De this >> paux1, invirtiendo el orden
        while( !this.isEmpty() ) {
            paux1.push( this.pop() );
        }

        // De otraPila >> paux2, invirtiendo el orden
        while( !otraPila.isEmpty() ) {
            paux2.push( otraPila.pop() );
        }
        
        int totElems, i;
        totElems = paux1.size() + paux2.size();
        i = 0;
        while( i < totElems-1 ) {
            if( !paux1.isEmpty() ) {
                this.push(  paux1.pop() );
            }
            if( !paux2.isEmpty() ) {
                this.push(  paux2.peek() );
                otraPila.push(  paux2.pop() );
            }
            i++;            
        }
              
        return totElems;
    }    
    
    
}
