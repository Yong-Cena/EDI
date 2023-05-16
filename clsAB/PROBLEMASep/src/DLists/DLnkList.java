
package DLists;
import java.util.*;    // Iterator
import ADTsException.*;

/*
Represents a doubly linked implementation of a list. 
The front of the list is kept by "head" and the rear by "tail". 
It uses two sentinel nodes and will be extended to create concrete lists.
*/
public class DLnkList<T> implements ListADT<T>, Iterable<T>
{    
    protected DLNode<T> head,tail;
    protected int count;

    public DLnkList() {
        head = new DLNode<>();
        tail = new DLNode<>();
        tail.setPrevious(head);
        head.setNext(tail);
        count = 0;    }
 
    /**
     * Adds the specified element to the front of this list.
     * be added to the list
    */
    public void addFirst(T element){
        DLNode<T> newNode  = new DLNode<T>(element);
        DLNode<T> ct;
      
        if (isEmpty()){
            newNode.setNext(tail);
            newNode.setPrevious(head);
            head.setNext(newNode);
            tail.setPrevious(newNode);
        } else {
            ct= head.getNext();
            newNode.setNext(ct);
            newNode.setPrevious(head);
            head.setNext(newNode);
            ct.setPrevious(newNode);
	}
        count++;
    }    

	/**
     * Adds the specified element to the rear of this list.
     */
    public void addLast(T element) {
        DLNode<T> newNode  = new DLNode<T>(element);
        DLNode<T> ch;
		
        if (isEmpty()) {
            newNode.setNext(tail);
            newNode.setPrevious(head);
            head.setNext(newNode);
            tail.setPrevious(newNode);
        } else	{
            ch= tail.getPrevious();
            newNode.setNext(tail);
            newNode.setPrevious(ch);            
            ch.setNext(newNode);
            tail.setPrevious(newNode);
	}
        count++;
    }
    
    @Override
    public T first() throws ADTsException {
        if (isEmpty())
            throw new ADTsException ("list"); 
        DLNode<T> first = head.getNext();
        return first.getElement();
    }

    @Override
    public T last() throws ADTsException {
        if (isEmpty())
            throw new ADTsException ("list"); 
        DLNode<T> last = tail.getPrevious();
        return last.getElement();
    }

    
    @Override
    public T removeFirst() throws ADTsException {
        T result = first();
        removeNode(head.getNext());
        return result;
    }
    
    @Override
    public T removeLast () throws ADTsException {
        T result = last();
        removeNode(tail.getPrevious());
        return result;
    }

    // Metodo iterativo, navegando
    public int find(T target) {
        DLNode<T> current = head.getNext();
        int result= -1, pos = 0;
        while (current != tail) {
            pos++;
            if (current.getElement().equals(target)) {
                current= tail;
                result= pos;
            } else
                current = current.getNext();
        }
        return result;
    }

    // Usando el iterador
    private DLNode<T> findIt(T target) {
        DLNode<T> current = head.getNext();   
        DLNode<T> result = null;
        Iterator<T> it = this.iterator();
        while (result==null && it.hasNext()) {
            if (it.next().equals(target))
                result = current;
            else
                current = current.getNext();
        }
        return current;
    }
    
    // Metodos indicrecto recursivo
    public int findRv(T target) {
        int pos= 0;
        return findRv(target, head.getNext(), pos);
    }
   
    private int findRv(T target, DLNode<T> current, int pos) {
        pos++;
        int result= -1;
        if ( current == tail ) {
            result= -1;
        } else
            if ( target.equals(current.getElement()) )
                result= pos;
   	else
            result= findRv(target, current.getNext(), pos);
        
        return result;
    }

    
    @Override
    public boolean contains (T target) {
        return (find(target) != -1);
    }
     
    @Override
    public Iterator<T> iterator() {
        return new DoubleIterator<> (head.getNext());
    }
   
    private void removeNode(DLNode<T> node) {
        DLNode<T> before;   
        DLNode<T> after;
        before = node.getPrevious();       
        after = node.getNext();
        before.setNext(after); 
        after.setPrevious(before);
        node.setPrevious(null);
        node.setNext(null);
        count--;
    }    
    
    @Override
    public final void clear() {
        head = new DLNode<>();
        tail = new DLNode<>();
        tail.setPrevious(head);
        head.setNext(tail);
        count = 0;
    }
    
    @Override
    public int size() {
        return count;
    }
   
    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public String toString() {
        String result = "  {DLnkList";

        if( this.isEmpty() ) {
            result = result + ", is EMPTY";
        } 

        DLNode<T> current = head.getNext();

        while (current.getNext() != null) {
            result = result + ", " + current.getElement();
            current = current.getNext();
        }
        
        result = result + "}";
        return result;
    }   
   
}
