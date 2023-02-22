package Model;

import Model.*;
import structure.*;
import structure5.AbstractList;

public class Factroy {
    /**
     * Devuelve el stack del tipo solicitado
     * @param wichStack cual stack se necesita
     * @return
     */
    public AbstractStack<Integer> getInstance(String wichStack){
        switch (wichStack){
            case "ArrayList":
                return new StackUsingArrayList<Integer>();
            case "Vector":
                return new StackUsingVector<Integer>();
            case "SimpleList":
                return new StackUsingLinkedList<Integer>();
            case "DoubleList":
                return new StackUsingDoubleLinkedList<Integer>();
            default:
                return null;
        }
    }
}
