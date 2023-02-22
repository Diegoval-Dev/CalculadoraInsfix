package Model;

import java.util.ArrayList;

public class Posfix implements IPostfixCalculator{
    private static boolean instance_flag = false;
    private static Posfix posfix;

    /**
     * Constructor
     * @throws PosfixException
     */
    private Posfix() throws PosfixException{
        instance_flag = true;
    }

    /**
     * Obtiene el single de la instancia
     * @return instancia de clase
     */
    public static Posfix getPosfixInstance(){
        if(instance_flag){
            return posfix;
        }else{
            posfix = new Posfix();
            return posfix;
        }
    }

    /**
     * Saber si solo queda un item
     * @param operandos elementos operandose
     * @return si queda un item o no
     */
    @Override
    public boolean isOneItem(AbstractStack<Integer> operandos) {
        return operandos.count() == 1;
    }
    /**
     * Sumar
     * @param a a
     * @param b b
     * @return suma de a +  b
     */
    @Override
    public int suma(int a, int b) {
        return a + b;
    }
    /**
     * restar dos elementos
     * @param a a
     * @param b b
     * @return a - b
     */
    @Override
    public int resta(int a, int b) {
        return a - b;
    }
    /**
     * Multiplicar dos elementos
     * @param a a
     * @param b b
     * @return a*b
     */
    @Override
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    /**
     * Dividir dos elementos
     * @param a a
     * @param b b
     * @return a / b
     */
    @Override
    public int division(int a, int b) {
        return a / b;
    }
    /**
     * Es operador o no
     * @param item item
     * @return es operador o no
     */
    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/");
    }
    /**
     * Obtener los items de una expresion
     * @param expresion devuelve un arraylist con cada posicion un elementos
     * @return arraylist de elementos
     */
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
    /**
     * Calcular
     * @param line linea a calcular
     * @param stackType tipo de stack
     * @return resultado
     */
    @Override
    public int calculate(String line, String stackType) {
        Posfix calculadora = Posfix.getPosfixInstance();
        Factroy fc = new Factroy();
        AbstractStack<Integer> stack = fc.getInstance(stackType);
        ArrayList<String> calculo = new ArrayList<>();
        String caracter;
        int resultado = 0;

        calculo = calculadora.getItems(line);
        int cantElementos = calculo.size();

        for (int i = 0; i < cantElementos; i++) {
            String elemento = calculo.get(i);
            if(calculadora.isOperator(elemento)){
                int var1,var2;
                var2 = stack.pull();
                var1 = stack.pull();
                switch (elemento){
                    case "+":
                        resultado = calculadora.suma(var1,var2);
                        stack.push(resultado);
                        break;
                    case "-":
                        resultado = calculadora.resta(var1,var2);
                        stack.push(resultado);
                        break;
                    case "*":
                        resultado = calculadora.multiplicacion(var1,var2);
                        stack.push(resultado);
                        break;
                    case "/":
                        resultado = calculadora.division(var1,var2);
                        stack.push(resultado);
                        break;
                }
            }else {
                stack.push(Integer.parseInt(elemento));
            }
        }
        return stack.pull();
    }

}
