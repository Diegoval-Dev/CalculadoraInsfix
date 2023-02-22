package Model;

public class DoubleLinkedList<T> extends AbstractList<T>{
    private DoubleNode<T> start;
    private DoubleNode<T> end;
    private int count;

    /**
     * Constructor
     */
    public DoubleLinkedList() {
        start = null;
        end = null;
        count = 0;
    }

    /**
     * Insertar al inicio
     * @param value valor
     */
    @Override
    public void InsertAtStart(T value) {
        DoubleNode<T> newNode = new DoubleNode<T>(value);

        if (IsEmpty()) {

            start = newNode;
            end = newNode;
            start.setNext(start);
            start.setPrevious(start);
        } else {

            newNode.setNext(start);
            start.setPrevious(newNode);
            newNode.setPrevious(end);
            end.setNext(newNode);
            start = newNode;
        }

        count++;
    }

    /**
     * Insertar al final
     * @param value valor
     */
    @Override
    public void InsertAtEnd(T value) {

        DoubleNode<T> newNode = new DoubleNode<T>(value);

        if (IsEmpty()) {

            start = newNode;
            end = newNode;
            start.setNext(start);
            start.setPrevious(start);
        } else {

            newNode.setPrevious(end);
            newNode.setNext(start);
            start.setPrevious(newNode);
            end.setNext(newNode);
            end = newNode;
        }

        count++;

    }

    /**
     * Insertar en un punto
     * @param value valor
     * @param index indice
     */
    @Override
    public void Insert(T value, int index) {

        if (IsEmpty()) //if the list is empty then insert at start
        {
            InsertAtStart(value);
        }
        else
        {
            if (index >= Count()) //if the index is equal or greater than count then insert at end
            {
                InsertAtEnd(value);
            }
            else if (index == 0) //If the index to insert is 0 and the list is not empty
            {
                InsertAtStart(value);
            }
            else if ((index > 0) && (index < Count())) //Index between 1 (second element) and Count() - 1 previous the last one
            {
                DoubleNode<T> newNode = new DoubleNode<T>(value);
                DoubleNode<T> temp = start;
                int i = 0;

                //Search the position where the node will be inserted
                while ((temp != null) && (i < index)) {
                    temp = temp.getNext();
                    i++;
                }

                //doing the insertion
                newNode.setNext(temp);
                newNode.setPrevious(temp.getPrevious());
                temp.setPrevious(newNode);
                newNode.getPrevious().setNext(newNode);
                count++;
            }
        }

    }

    /**
     * Eliminar de un indice
     * @param index indice
     * @return null
     */
    @Override
    public T Delete(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Eliminar al inicio
     * @return se elimino
     */
    @Override
    public T DeleteAtStart() {
        if (!IsEmpty()) {

            if (Count() == 1) {
                DoubleNode<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValue();
            } else {
                DoubleNode<T> temp = start;
                end.setNext(temp.getNext());
                temp.getNext().setPrevious(end);
                start = temp.getNext();
                count--;
                return temp.getValue();
            }

        } else {
            return null;
        }

    }

    /**
     * Eliminar al final
     * @return final
     */
    @Override
    public T DeleteAtEnd() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Obtener un elemento de un indice
     * @param index indice
     * @return elemento
     */
    @Override
    public T Get(int index) {
        if (!IsEmpty())
        {
            if (index == 0)
            {
                return start.getValue();
            }
            else if (index == (Count() - 1))
            {
                return end.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1)))
            {
                DoubleNode<T> temp = start;
                int i = 0;
                while ((temp != null) && (i != index))
                {
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null)
                {
                    return temp.getValue();
                }
                else
                {
                    return null;
                }
            }
            else
            {
                return null;
            }
        }

        return null;

    }

    /**
     * Saber si la lista esta vacia
     * @return si esta vacio o no
     */
    @Override
    public boolean IsEmpty() {
        return count == 0;
    }

    /**
     * Saber la cantidad de elementos de la lista
     * @return cantidad de elementos
     */
    @Override
    public int Count() {
        return count;
    }
}
