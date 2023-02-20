package Model;

import java.util.ArrayList;

public interface IPostfixCalculator {
    boolean isOneItem(IStack<Integer> operandos);
    int suma(int a, int b);
    int resta(int a, int b);
    int multiplicacion(int a, int b);
    int division(int a, int b);
    boolean isOperator(String item);
    ArrayList<String> getItems(String expresion);
    int calculate(String line);
}
