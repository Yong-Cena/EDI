package LnkStrwN;

/**
 * Implemnts and represents a Node in a Linked List.
 */
public class LNode<T> {
    /** Attributes:
     * Reference to "next" Node in Linked List.
     * Object "element" stored (referenced) at this Node */
    private LNode<T> next;
    private T element;
 
    /** Creates an empty node */
    public LNode() {
        next = null;
        element = null;
    }
 
    /** Creates a node storing (referencing) the specified element */
    public LNode(T elem) {
        element = elem;
        next = null;
    }
 
    /** Returns the node that follows this one */
    public LNode<T> getNext() {
        return next;
    }
 
    /** Sets the node that follows this one */
    public void setNext(LNode<T> node) {
        next = node;
    }
 
    /** Returns the element stored (referenced)) in this node */
    public T getElement() {
        return element;
    }
 
    /** Sets the element stored (referenced) in this node */
    public void setElement(T elem) {
        element = elem;
    }
}
