package Model;

import java.util.Vector;

public class StackUsingVector<T> implements IStack<T>{
    private Vector<T> listaInterna;

    public StackUsingVector(Vector<T> listaInterna) {
        this.listaInterna = listaInterna;
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
