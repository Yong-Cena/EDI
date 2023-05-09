package Lists;
import ADTsException.*;

/**
 * LnkUnordList represents a singly linked implementation of an 
 unordered list.
 */
public class LnkUnordList<T> extends LnkList<T> 
         implements UnorderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LnkUnordList()
    {
        super();
    }

    /**
     * Adds the specified element to the front of this list.
     *
     * @param element the element to be added to the list
	 */
    public void addToFront(T element)
    {
        LNode<T> newNode  = new LNode<T>(element);
      
        if (isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
		else 
		{
            newNode.setNext(head);
            head = newNode;
		}
      
        count++;
		modCount++;
    }
	
	/**
     * Adds the specified element to the rear of this list.
     *
     * @param element the element to be added to the list
	 */
    public void addToRear(T element)
    {
        LNode<T> newNode  = new LNode<T>(element);
		
        if (isEmpty())
        {
            head = newNode;
            tail = newNode;
        }
		else 
		{
            tail.setNext(newNode);
            tail = newNode;
		}
				
        count++;
		modCount++;
    }

    /** Adds the specified element before the specified target.
     * Assumption: if target does not exist, the element will be added
     *  at the end of the list.
     */
    public void addBefore (T element, T target) {
		
	boolean found = false;
	LNode<T> current = null;
        LNode<T> ant= null;
	LNode<T> newNode = new LNode<T>(element);

        // Caso vacio. Al final.
        if (isEmpty()) {
            newNode.setNext(null);
            head = newNode;
            tail = head;
            found= true;
        }
        
        // Caso de que coincida con el primero.
        if( !found && target.equals(head.getElement()) ) {
            // newNode, con element, se agrega al inicio de la lista
            found= true;
            newNode.setNext(head);
            head= newNode;
        }
        
        // Va a ciclar sólo si no lo encontró, en los dos casos anteriores
        if( !found ) {
            ant= head;
            current= head.getNext();
        }        		
        while ( !found && current != null) {
            if (target.equals(current.getElement())) {
                found = true;
	        newNode.setNext(ant.getNext());
                ant.setNext(newNode);
            }
            else {
                ant= current;
                current = current.getNext();	           
            }
        }
        		
        if( !found ) {
            // newNode, con element, se agrega al final de la lista
            found= true;
            newNode.setNext(null);
            tail.setNext(newNode);
            tail= newNode;
        }        		
        count++;
	modCount++;
    }	
	
    /**
     * Adds the specified element to this list after the given target.
     *
     * @param  element the element to be added to this list
	 * @param  target the target element to be added after
	 * @throws ElementNotFoundException if the target is not found
	 */
    public void addAfter(T element, T target) {
        if( isEmpty() ) throw new 
            ADTsException("LnkUnordList isEmpty, & element nof found");
		
        boolean found = false;
	LNode<T> current = head;
	LNode<T> newNode = new LNode<T>(element);
	
        // Caso de que coincida con el ultimo.
        if( target.equals(tail.getElement())) {
            // newNode, con element, se agrega al final de la lista
            found= true;
            newNode.setNext(null);
            tail.setNext(newNode);
            tail= newNode;
        }
        while (current != null && !found) {
            if (target.equals(current.getElement())) {
                found = true;
	        newNode.setNext(current.getNext());
	        current.setNext(newNode);
            }
            else
                current = current.getNext();	           
        }
        
	if (!found) throw new 
            ADTsException("LnkUnordList"); 			
                		
        count++;
	modCount++;
    }

}
