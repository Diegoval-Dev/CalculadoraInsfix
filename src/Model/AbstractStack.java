package Model;

public abstract class AbstractStack<T> implements IStack<T>{
    int num;

    public abstract void InsertAtStart(T value);

    public abstract void InsertAtEnd(T value);

    public abstract void Insert(T value, int index);

    public abstract T Delete(int index);

    public abstract T DeleteAtStart();

    public abstract T DeleteAtEnd();

    public abstract T Get(int index);

    public abstract boolean IsEmpty();

    public abstract int Count();
}
