package Test;

import Model.StackUsingArrayList;
import Model.StackUsingDoubleLinkedList;
import Model.StackUsingLinkedList;
import Model.StackUsingVector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactroyTest {

    @Test
    void getInstance() {
        String st = "Vector";
        switch (st){
            case "ArrayList":
                System.out.println("Arraylist");
                break;
            case "Vector":
                System.out.println("Vector");
                break;
            case "SimpleList":
                System.out.println("SimpleList");
                break;
            case "DoubleList":
                System.out.println("DoubleList");
                break;
            default:
                System.out.println("Algo fallo");
                break;
        }
    }
}