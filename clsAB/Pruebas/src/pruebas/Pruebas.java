
package pruebas;
import java.util.ArrayList;
import java.util.Stack;
public class Pruebas {

    public static void main(String[] args) {
        Stack<String> STACK = new Stack<String>();
 
        // Use add() method to add elements
        STACK.push("Welcome");
        STACK.push("To");
        STACK.push("Geeks");
        STACK.push("For");
        STACK.push("Geeks");
 
        // Displaying the Stack
        System.out.println("Initial Stack: " + STACK);
 
        // Removing elements using pop() method
        System.out.println("Popped element: " +
                                         STACK.pop());
        System.out.println("Popped element: " +
                                         STACK.pop());
 
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                                             + STACK);
        
    }
}
