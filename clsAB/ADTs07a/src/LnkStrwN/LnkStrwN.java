
package LnkStrwN;
import java.util.Iterator;
import ADTsException.ADTsException;

/** Clase para manejar una estructura enlazada. */
public class LnkStrwN<T> {
    /** "count", number of nodes or elements,
     * "front", first node or element */  
    private int count;
    private LNode<T> front;

    /** Crea una Estructura Enlazada vacía */
    public LnkStrwN() {
        count = 0;
        front = null;
    }
    
    /** Agrega el elemento especificado en la posicion pos.
     * Si pos<=1, agrega en la posición 1;
     * si pos>count, agrega en la posicion count+1. */
    public void add(T element, int pos) {
        LNode<T> node= new LNode<T>(element);
        LNode<T> current;
        int i;

        if( this.isEmpty() ) {    // Linked Structure vacia
            front= node;
        } else {    //Estructura no vacía.
            if( pos <= 1 ) {
                node.setNext(front);    //Inserta en la posición 1.
                front= node;
            } else {
                //Inserta en una posición >= 2.
                i= 1;
                current= front;
                while( i<(pos-1) && current.getNext() != null ) {
                    i++;        //Avanzar en la estructura.
                    current= current.getNext();
                } 
                //Inserta el nuevo nodo.
                node.setNext( current.getNext() );
                current.setNext( node );
            }
        }
        count++;
    }

    /** Remueve el elemento en la posicion pos y regresa una referencia
     * a el. Lanza una ADTsException si la posicion
     * esta fuera de los limites.
     */
    public T remove(int pos) {
        LNode<T> current, previous= null;
        T result= null;
        int i;

        if( pos<1 || pos>size() ) {
            throw new ADTsException(
                    "remove(): Not Found, posicion fuera de limites o vacio.");
            // Queda incluido el estado de vacio
        }

        if( pos==1 ) {     //Recupera el elemento del nodo de la posición 1.
            result= front.getElement();
            front= front.getNext();
        } else {
            //Recupera el elemento de un nodo en posición >= 2.
            i= 1; current= front;   
            while( i<pos ) {   //Recorre la estructura hasta el nodo en pos.
                previous= current;
                current= current.getNext();
                i++;
            }
            //Recupera el elemento del nodo de la posición pos.
            result= current.getElement();
            previous.setNext(current.getNext());
        }
        count--;
        return result;
    }

    /** Regresa una referencia al elemento que está en la posicion pos.
     * Lanza una ADTsException si la posicion
     * esta fuera de los limites.
     */
    public T get(int pos) {
        LNode<T> current;
    
        if( pos<1 || pos>size() ) {
            throw new ADTsException(
                    "get(): Not Found, posicion fuera de limites o vacio.");
            // Queda incluido el estado de vacio
        }
        
        current= front;
        for( int i=1; i<pos; i++ ) {
            current= current.getNext();
        }

        return current.getElement();
    }

    /** Coloca el elemento especificado en la posicion pos.
     * Lanza una ADTsException si la posicion
     * esta fuera de los limites. */
    public void set(T element, int pos) {
        LNode<T> current;
    
        if( pos<1 || pos>size() ) {
            throw new ADTsException(
                    "set(): Not Found, posicion fuera de limites o vacio.");
            // Queda incluido el estado de vacio
        }
        
        current= front;
        for( int i=1; i<pos; i++ ) {
            current= current.getNext();
        }
            
        current.setElement(element);
    }

    /** Regresa true si la estructura esta vacia o falso en caso contrario. */
    public boolean isEmpty() {
        return (count == 0);
    }

    /** Regresa la cantidad de elementos en la estructura. */
    public int size() {
        return count;
    }

    /** Returns an iterator for the elements currently in this set.
     */
    public Iterator<T> iterator() {
        return ( new LnkStrwNIter<T>(front) );
    }
  
  
    /** Regresa una cadena representando a la estructura. */
    @Override
    public String toString() {
        
        String result = "{LS:" + count +":";
        LNode<T> current = front;

        if( front == null) {
            result = result + " <EMPTY>";
        }
        while (current != null) {
            result = result + " " + (current.getElement()).toString() + ",";
            current = current.getNext();
        }
        result = result + " }";
        return result;
    }
    
    //++++++++++ Problema 39 ++++++++++
    
    public void addFirst(T dato){
        LNode<T> npri = new LNode(dato);  // Construye un nodo
        npri.setNext(front);   // Enlaza el nuevo con el primero
        front = npri;    // Redefine el primero
        count++;
    }
    
    public void addLast(T dato){
        LNode<T> nult = new LNode(dato);  // Construye un nodo
        
        if (this.isEmpty())
            front = nult;
        else {
            LNode<T> naux = front;
            
            while (naux.getNext() != null)
                naux = naux.getNext();
            naux.setNext(nult);
        }
        count++;
    }

    
    public T removeFirst(){
        T elem = null;

        if( this.isEmpty() ) {
            throw new ADTsException(
                    "removeFirst(): Not Found, posicion fuera de limites o vacio.");
        }
        
        elem = front.getElement();
        LNode<T> naux = front;
        front = front.getNext();
        naux.setNext(null);
        count--;

        return elem;
    }
    
    public T removeLast(){
        T elem = null;

        if( this.isEmpty() ) {
            throw new ADTsException(
                    "removeFirst(): Not Found, posicion fuera de limites o vacio.");
        }
        
        LNode<T> nult, nant;

        nult = front;
        nant = null;
        while (nult.getNext() != null){
            nant = nult;
            nult = nult.getNext();
        }
        elem = nult.getElement();
        if (nant == null)        // nult == primero. HAY UN SOLO NODO
            front = null;
        else
            nant.setNext(null);
        count--;

        return elem;
    }
    
    //++++++++++ Problema 39alfa ++++++++++
    
    public int searchPos(T elemdata) {
        T aux;
        int pos= -1; // no encontrado
        int ind= 1; // posicion del primero
        LNode<T> current = front;
        while( current != null) {
            aux= current.getElement();
            if(aux.equals(elemdata)) {
                pos= ind;
                current= null;
            } else {
                current= current.getNext();
                ind++;
            }
        }
        return pos;
    }

    //++++++++++ Problema 45 ++++++++++

    public void mix2lseN(LnkStrwN otralse) {
        if( otralse==null || this.isEmpty() || otralse.isEmpty() ) {
            throw new ADTsException(
                    "mixlseN: <otralse> con null, o alguna LnkStrwN vacia");
        }
        
        int tamthis, tamotra;
        tamthis= this.size();
        tamotra= otralse.size();
        
        LNode currthis, currotra, sigthis,sigotra;
        //auxiliar para el caso this<otro    1.this  2.otro
        LNode ante=null;
        
        currthis= this.front;
        currotra= otralse.front;
        //Notese que gracias a que son de la misma clase, pueden obtenerse sus atributos privados
        
        int tammen= Math.min(tamthis, tamotra);
        for(int i=1; i<=tamthis;i++)
        {
            sigthis= currthis.getNext();
            sigotra= currotra.getNext();
            
            ante=currotra;
            
            currthis.setNext(currotra);
            currotra.setNext(sigthis);
            
            currthis=sigthis;
            currotra=sigotra;
            
            this.count++;
            otralse.count--;
        }
        
        if(tamthis<tamotra)
        {
            ante.setNext(currotra);
            this.count= this.count + (tamotra-tamthis);
            otralse.count= otralse.count - (tamotra-tamthis);
        }
        
        /*Segunda solucion
        while(currthis != null && currotra != null)
        {
            sigthis= currthis.getNext();
            sigotra= currotra.getNext();
            
            currthis.setNext(currotra);
            currotra.setNext(sigthis);
        
            surrthis= sigthis;
            currotra= sigotra;
            this.count++;
            otralse.count++;
        ]
        
        if(currthis == null && currotra != null)
        {
            //El ultimo en ser agregado y este mismo apunta a null: debe apuntar a currotra.getNext(original)
            this.addLast((T) currotra);
        ]
        */
        
        otralse.front= null;
    }
    
}
