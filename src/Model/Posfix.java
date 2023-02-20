package Model;

import java.util.ArrayList;

public class Posfix implements IPostfixCalculator{
    private static boolean instance_flag = false;
    private static Posfix posfix;
    private Posfix() throws PosfixException{
        instance_flag = true;
    }
    public static Posfix getPosfixInstance(){
        if(instance_flag){
            return posfix;
        }else{
            posfix = new Posfix();
            return posfix;
        }
    }
    @Override
    public boolean isOneItem(IStack<Integer> operandos) {
        return operandos.count() == 1;
    }

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/");
    }

    @Override
    public ArrayList<String> getItems(String expresion) {
        ArrayList<String> arrItems = new ArrayList();
        String lineWithoutSpaces = expresion.replaceAll(" ","");
        int lineLength = lineWithoutSpaces.length();
        for (int i = 0; i < lineLength; i++) {
            String item = String.valueOf(lineWithoutSpaces.charAt(i));
            arrItems.add(item);
        }
        return arrItems;
    }

    @Override
    public int calculate(String line) {
        return 0;
    }
}
