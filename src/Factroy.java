import Model.IStack;
import Model.StackUsingArrayList;
import Model.StackUsingLinkedList;
import Model.StackUsingVector;
import structure.*;
import structure5.AbstractList;

public class Factroy {
    public IStack<Integer> getInstance(String wichStack){
        switch (wichStack){
            case "ArrayList":
                return new StackUsingArrayList<Integer>();
                break;
            case "Vector":
                return new StackUsingVector<Integer>();
                break;
            case "SimpleList":
                return new StackUsingLinkedList<Integer>();
                break;
            case "DoubleList":
                break;
            default:
                break;
        }
    }
}
