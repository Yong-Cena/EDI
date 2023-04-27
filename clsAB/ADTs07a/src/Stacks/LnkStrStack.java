/**
 *  Represents an array implementation of a stack.
 */

package Stacks;
import ADTsException.*;
import LnkStrwN.*;

public class LnkStrStack<T> implements StackADT<T> {

    // Array of generic elements to represent the stack.
    LnkStrwN <T> stack;

    // Creates an empty stack using the default capacity.
    public LnkStrStack() {
        stack = new LnkStrwN();
    }

    // Pushes in or adds the specified element to the top of this stack, expanding
    // the capacity of the stack array if necessary.
    public void push (T element) throws ADTsException {
        stack.addFirst(element);
    }
    
    // Pops out or removes the element at the top of this stack and returns a
    // reference to it. Throws an ADTsException if the stack
    // is empty.
    public T pop() throws ADTsException {
        return stack.removeFirst();
    }

    // Peeks and returns a reference to the T element at the top of this stack.
    // The element is not removed from the stack.  Throws an
    // ADTsException if the stack is empty.
    public T peek() throws ADTsException {
        if (isEmpty())
            throw new ADTsException("Stacks.ArrayStack.peek(): Empty Stack.\n");

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
    // Just for help.
    @Override
    public String toString() {
        String result = "ArrayStack(toString) is EMPTY.";
        if( !isEmpty() ) {
            result = "LnkStrStack (TOP: "+stack.toString()+" :BASE";
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
        
        LnkStrStack<T> paux1 = new LnkStrStack ();
        LnkStrStack<T> paux2 = new LnkStrStack ();
        
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
