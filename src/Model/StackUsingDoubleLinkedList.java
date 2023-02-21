package Model;

public class StackUsingDoubleLinkedList<T> extends AbstractStack<T>{
    private DoubleLinkedList<T> listaInterna;

    public StackUsingDoubleLinkedList() {
        this.listaInterna = new DoubleLinkedList<T>();
    }

    @Override
    public int count() {
        return listaInterna.Count();
    }

    @Override
    public boolean isEmpty() {
        return listaInterna.IsEmpty();
    }

    @Override
    public void push(T value) {
        listaInterna.InsertAtStart(value);
    }

    @Override
    public T pull() {
        return listaInterna.Delete(0);
    }

    @Override
    public T peek() {
        return listaInterna.Get(0);
    }
}
