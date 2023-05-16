
package LnkStrwN;
import java.util.Iterator;
import PROBLEMAS.Personaw;
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

    public int mix2lseN(LnkStrwN otralse) {
        if( otralse==null || this.isEmpty() || otralse.isEmpty() ) {
            throw new ADTsException(
                    "mix2lseN: <otralse> con null, alguna LS vacia");
        }

        // Hay al menos un nodo en cada una de las dos LnkStrwN
        LNode<T> currthis, currotra, sigthis, sigotra,
                antethis=null;
        currthis = front;
        currotra = otralse.front;    // por ser de la misma clase
        
        // Parte en que ambas LnkStrwN tienen la misma cantidad de nodos-elementos
        while( (currthis!=null) && (currotra!=null)  ) {
            sigthis = currthis.getNext();
            sigotra = currotra.getNext();
            currthis.setNext(currotra);    // Insertando en this, de otralse
            antethis = currotra;    // Recordando el anterior nodo de this
            currotra.setNext(sigthis);    // Completando la insercion
            currthis = sigthis;
            currotra = sigotra;
            this.count++;    // Incrementa el this.size()
            otralse.count--;    // Decrementa el otralse.size()
        }
        // Si "this" es igual o mas larga en nodos que "otralse", ya esta completa. 

        // Si "this" es de menor tamaño, todavia faltan pasar nodos de "otralse"
        if( currotra!=null ) {
            antethis.setNext(currotra);    // Agregando nodo de otralse, a this
            this.count = this.count + otralse.count;
            otralse.count = 0;
        }    // else: this >=  otralse: nada mas que hacer
        
        otralse.front = null;    // Dejando otralse vacia.
        return this.count;
    }
    
    // Esqueleto para el caso recursivo del metodo mix2lseN(...)
   public void intercala(LnkStrwN otralse){
        if(this.isEmpty() && !otralse.isEmpty()){
            front= otralse.front;
            otralse.front = null;
        }
        else if (!this.isEmpty() && !otralse.isEmpty())
            intercala(front, otralse.front);
    }
    
    private void intercala(LNode<T> uno, LNode<T> dos){
        if (dos != null){
            LNode<T> aux = uno.getNext();
            uno.setNext(dos);
            intercala(dos, aux);
        }
    }

    // ++++++++++++++++
    /** Problema 40: elimina el nodo anterior al que contiene el dato info
     * dado como parametro. Regresa true, si lo elimino; false, si no.
     */
    public boolean eliminaAnteriorA(T info) 
                throws ADTsException {
        if( info == null ) {
            throw new ADTsException("LinkedStruct: <info> con null");
        }

        LNode<T> current, previous= null, anteprevious= null;
        boolean elimi= false;
        int i= 1;

        if( !isEmpty() ) {
            //Recorre la estructura, mientras haya nodos y no se encuentre info.
            i= 1;
            current= this.front;    //Inicio de la estructura.
            while( i<=size() && !elimi ) {
                if (current.getElement().equals(info)) {
                    elimi= true;     //Lo encontro y puede haber eliminacion.
                } else {    //Avanza al siguiente nodo.
                    anteprevious= previous;
                    previous= current;
                    current= current.getNext();
                    i++;
                }
            }
            if( elimi ) {   // elimi : true
                if( i == 1 ) {   
                    //Caso 3: el info esta en pos. 1 y no hay nodo a eliminar.
                    elimi= false;
                } else {    // pos > 1
                    // Encontro el info en una posicion >= 2.
                    // En lugar del siguiente codigo: remove(pos-1)
                    if( anteprevious == null ) {
                        //Elimina el nodo de la pos. 1.
                        front= current;    // Caso 4
                    } else {
                        //Elimina nodo a partir de pos>=2.
                        anteprevious.setNext(current);    // Caso 5
                    }
                    count--;
                }
            }   // else: Caso 2: el info no esta, elimi : false.
        }    // else, Caso 1: regresa elimi : false
        return elimi;
    }
  
    /** Problema 41: elimina el nodo posterior al que contiene el dato info
     * dado como parametro. Regresa true, si lo elimino; false, si no.
     */
    public boolean eliminaSiguienteDe(T info) 
                throws ADTsException {

        if( info == null ) {
            throw new ADTsException("LinkedStruct: <info> con null");
        }
        
        LNode<T> current, poste= null, sigposte = null;
        boolean elimi= false;
        int i= 1;

        if( !isEmpty() ) {
            //Recorre la estructura, mientras haya nodos y no se encuentre info.
            i= 1;
            current= this.front;    //Inicio de la estructura.
            while( i<=size() && !elimi ) {
                if (current.getElement().equals(info)) {
                    elimi= true;     //Lo encontro y puede haber eliminacion.
                } else {    //Avanza al siguiente nodo.
                    current = current.getNext();
                    i++;
                }
            }
            if( elimi ) {   // elimi : true
                if( i == size() ) {   
                    //Caso 3: el info esta en ultima pos y no hay nodo a eliminar.
                    elimi= false;
                } else {    // pos>=1 e pos<size() 
                    // Encontro el info en una pos >=1 y < size().
                    // En lugar del siguiente codigo: remove(pos+1)
                    // Caso 4: Elimina el nodo de la pos==size(), o
                    // Caso 5: Elimina el nodo de una pos>=1 y <size()
                    poste = current.getNext();    // <= penultimo nodo
                    sigposte = poste.getNext();
                    current.setNext(sigposte);
                    count--;
                }
            }   // else: Caso 2: el info no esta, elimi : false.
        }    // else, Caso 1: regresa elimi : false
        return elimi;
    }
  
    /** Problema 42: inserta un nuevo elemento antes que el elemento refer
     * dado como parametro. Regresa true, si lo inserto; false, si no.
     */
    public boolean insertaAntesQue(T refer, T nuevo)
                throws ADTsException {
        if( refer==null || nuevo==null) {
            throw new ADTsException(
                    "LinkedStruct: <refer> y <nuevo>, con null");
        }
        
        LNode<T> current, previous= null, anteprevious= null;
        boolean insert= false;
        int i = 1;

        if( !isEmpty() ) {
            //Recorre la estructura mientras haya nodos y no se encuentre refer.
            i= 1;
            current= front;    //Inicio de la estructura.
            while( i<=size() && !insert ) {
                if (current.getElement().equals(refer)) {
                    insert= true;     //Lo encontro y puede haber insercion.
                } else {    //Avanza al siguiente nodo.
                    anteprevious= previous;
                    previous= current;
                    current= current.getNext();
                    i++;
                }
            }
            LNode<T> nodoNuevo =
                    new LNode(nuevo);  // Nuevo nodo y elemento
            if( insert ) {   // insert=true, refer encontrado
                if( i == 1 ) {   
                    //Caso 3: el refer esta en pos 1 y se puede insertar nuevo
                    nodoNuevo.setNext(front);
                    front = nodoNuevo;
                } else {    // pos > 1
                    // Caso 4: refer en una pos >= 2 y pos<=size(): inserta.
                    anteprevious = previous;
                    previous = nodoNuevo;
                    anteprevious.setNext(previous);
                    previous.setNext(current);
                }
                count++;
            }    // else, Caso 2: el refer no esta, insert : false.
        }    // else, Caso 1: regresa insert : false
        return insert;
    }

    /** Problema 43: elimina todos los elementos repetidos de una
     * LinkedStruct, dejando una ocurrencia de cada elemento.
     * Regresa como resultado el total de elementos eliminados.
     * Los elementos de LinkedStruct estan ORDENADOS, por lo tanto
     * los repetidos ocupan posiciones consecutivas.
     */
    public int eliminaTodosRepetidosOrdenado() {
        
        LNode<T> current, previous= null;        
        int totelim = 0, pos = 1;
        T aux = null;

        /*
        El siguiente codigo es muy ineficiente, por el uso de
        get() y remove(), cada vez, recorriendo toda la estructura.
        while( pos <= size() ) {    //Recorre la estructura.
            aux= get(pos);         //Obtiene el primero "distinto".
            pos++;              //Para obtener el siguiente.
            while( pos <= size() && aux.equals( get(pos) ) ) {
                remove(pos);     //Elimina los que son iguales.
                totelim++;
            }
        }*/
        current = front;    // El primero nunca sera eliminado
        while( current != null) {    //Recorre la estructura.
            aux = current.getElement();
            previous = current;
            current = current.getNext();    //Obtiene el primero "distinto".
            while( current != null && aux.equals( current.getElement() )) {
                current = current.getNext();    //Elimina los que son iguales.
                previous.setNext( current );
                totelim++;
                count--;
            }
        }

        return totelim;
    } 
    
    /** Problema 44: elimina todos los elementos repetidos de una
     * LinkedStruct, dejando una ocurrencia de cada elemento.
     * Regresa como resultado el total de elementos eliminados.
     * Los elementos de LinkedStruct estan DESORDENADOS, por lo tanto
     * los repetidos pueden estar en cualquier lugar del LinkedStruct.
     */
    public int eliminaTodosRepetidosDesordenado() {
        
        LNode<T> current, previous= null, previous1 = null;        
        int totelim = 0, pos = 1;
        T aux = null;

        current = front;    // El primero nunca sera eliminado
        while( current != null) {    //Recorre la estructura.
            aux = current.getElement();
            previous = current;
            previous1 = previous;
            current = current.getNext();    //Obtiene el siguiente.
            while( current != null ) {
                if( aux.equals( current.getElement() ) ) {
                    current = current.getNext();    //Elimina el que es igual.
                    previous1.setNext( current );
                    totelim++;
                    count--;                    
                } else {
                    previous1 = current;    // Avanza
                    current = current.getNext();
                }
            }
            current = previous.getNext();
        }

        return totelim;        
    }        

    public int persmen15ls() {
        return -1;
    }
}
