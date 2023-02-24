/**
 *  Represents an array implementation of a stack.
 */

package Stacks;

public class ArrayStack<T> implements StackADT<T> {
    // Constant to represent the default capacity of the array.
    private final int DEFAULT_CAPACITY = 100;

    // top represents both the number of elements and the next
    // available position in the array.
    private int top;

    // Array of generic elements to represent the stack.
    private T[] stack;

    // Creates an empty stack using the default capacity.
    public ArrayStack() {
        top = 0;
        stack = (T[])(new Object[DEFAULT_CAPACITY]);
    }

    // Creates an empty stack using the specified capacity.
    public ArrayStack (int initialCapacity) {
        top = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    // Pushes in or adds the specified element to the top of this stack, expanding
    // the capacity of the stack array if necessary.
    public void push (T element) {
        if( element == null ) throw new
                ADTsException("ArrayStack.push(): null element.");
                
        if (size() == stack.length)
            expandCapacity();   //Si el stack está lleno.
        stack[top]= element;
        top++;  // next available free element of the ArrayStack
    }

    // Creates a new array to store the contents of this stack with
    // twice the capacity of the old one.
    private void expandCapacity() {
        T[] larger = (T[])(new Object[stack.length*2]);

        for (int index=0; index < stack.length; index++)
            larger[index] = stack[index];

            stack = larger;

        // Alternative code
        // import java.util.Arrays; after packege
        // stack = Arrays.copyOf(stack, stack.length * 2);
    }
    
    // Pops out or removes the element at the top of this stack and returns a
    // reference to it. Throws an ADTsException if the stack
    // is empty.
    public T pop() {
        T result;    
        if (isEmpty()) throw new 
            ADTsException("ArrayStack.pop(): Empty Collection.");

        top--;  // Points out to the top T element
        result = stack[top];
        stack[top]= null;
        return result;
    }

    // Peeks and returns a reference to the T element at the top of this stack.
    // The element is not removed from the stack.  Throws an
    // ADTsException if the stack is empty.
    public T peek() {
        if (isEmpty()) throw new 
            ADTsException("ArrayStack.peek(): Empty Collection.");

        return stack[top-1];
    }

    // isEmpty: returns true if this stack is empty and false otherwise.
    public boolean isEmpty() {
        return (top == 0);
    }

    // size: returns the count (top) of elements in the stack.
    public int size() {
        return top;
    }

    // Returns a string representation of this stack.
    // Just for help.
    @Override
    public String toString() {
        String result = "ArrayStack(toString) is EMPTY.";
        if( !isEmpty() ) {
            result = "{BASE:" + top + "/" + stack.length + ":: ";
            for (int index = 0; index < top; index++)
                result = result + stack[index].toString() + ", ";
            result = result + ":TOP}";
        }        
        return result;
    }

}
