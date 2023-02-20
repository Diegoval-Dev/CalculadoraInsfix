package Model;

import java.util.ArrayList;

public class Posfix implements IPostfixCalculator{
    private static boolean instance_flag = false;
    private static Posfix posfix;
    private Posfix() throws PosfixException{

    }
    @Override
    public boolean isOneItem(IStack<Integer> operandos) {
        return false;
    }

    @Override
    public int suma(int a, int b) {
        return 0;
    }

    @Override
    public int resta(int a, int b) {
        return 0;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return 0;
    }

    @Override
    public int division(int a, int b) {
        return 0;
    }

    @Override
    public boolean isOperator(String item) {
        return false;
    }

    @Override
    public ArrayList<String> getItems(String expresion) {
        return null;
    }

    @Override
    public int calculate(String line) {
        return 0;
    }
}
