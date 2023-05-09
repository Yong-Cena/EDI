package Lists;
import ADTsException.*;

/**
 * LnkOrdList represents a singly linked implementation of an 
 ordered list.
 */
public class LnkOrdList<T> extends LnkList<T> 
         implements OrderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LnkOrdList()
    {
        super();
    }

    /**
     * Adds the specified element to this list at the location determined by
	 * the element's natural ordering. Throws a NonComparableElementException 
	 * if the element is not comparable.
     *
     * @param element the element to be added to this list
     * @throws NonComparableElementException if the element is not comparable
	 */
    public void add(T element)
    {
        if (!(element instanceof Comparable))
            throw new ADTsException("LnkOrdList");
		
		Comparable<T> comparableElement = (Comparable<T>)element;

        LNode<T> current = head;
		LNode<T> previous = null;
        LNode<T> newNode  = new LNode<T>(element);
        boolean found = false;
      
        if (isEmpty())  // list is empty
        {
            head = newNode;
            tail = newNode;
        }
		else if (comparableElement.compareTo(head.getElement()) <= 0)  
			// element goes in front
		{
            newNode.setNext(head);
            head = newNode;
		}
		else if (comparableElement.compareTo(tail.getElement()) >= 0)  
			// element goes at tail
		{
            tail.setNext(newNode);
            tail = newNode;
		}
        else  // element goes in the middle
        {
            while ((comparableElement.compareTo(current.getElement()) > 0))
			{
				previous = current;
                current = current.getNext();
			}
         
            newNode.setNext(current);
            previous.setNext(newNode);
        }
      
        count++;
		modCount++;
    }    
    
}
