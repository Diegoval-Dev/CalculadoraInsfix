package Model;

import java.util.Vector;

public class StackUsingVector<T> extends AbstractStack<T>{
    private Vector<T> listaInterna;

    public StackUsingVector() {
        listaInterna = new Vector<T>();
    }

    @Override
    public int count() {
        return listaInterna.size();
    }

    @Override
    public boolean isEmpty() {
        return listaInterna.isEmpty();
    }

    @Override
    public void push(T value) {
        listaInterna.add(value);
    }

    @Override
    public T pull() {
        return listaInterna.remove(0);
    }

    @Override
    public T peek() {
        return listaInterna.get(0);
    }
}
