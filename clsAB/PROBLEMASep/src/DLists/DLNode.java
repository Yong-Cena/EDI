
package DLists;

/**
 *
 * @author EDg1
 */
public class DLNode<T> {
    private T element;
    protected DLNode<T> next;    // siguiente, derecha
    protected DLNode<T> previous;    // anterior, izquierda
    
    public DLNode() {
        element= null;
        next= null;
        previous= null;
    }
    
    public DLNode(T elem) {
        element= elem;
        next= null;
        previous= null;
    }
    
    public DLNode<T> getNext() {
        return next;
    }
    
    public void setNext(DLNode<T> sig) {
        next=sig;
    }
    
    public T getElement() {
        return element;
    }
    
    public void setElement(T elem) {
        element = elem;
    }
    
    public DLNode<T> getPrevious() {
        return previous;
    }
    
    public void setPrevious(DLNode<T> ant) {
        previous=ant;
    }
    
    public String toString() {
        return element.toString();
    }
    
}
