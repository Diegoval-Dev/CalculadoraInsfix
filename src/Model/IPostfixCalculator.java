package Model;

import java.util.ArrayList;

public interface IPostfixCalculator {
    /**
     * Saber si solo queda un item
     * @param operandos elementos operandose
     * @return si queda un item o no
     */
    boolean isOneItem(AbstractStack<Integer> operandos);

    /**
     * Sumar
     * @param a a
     * @param b b
     * @return suma de a +  b
     */
    int suma(int a, int b);

    /**
     * restar dos elementos
     * @param a a
     * @param b b
     * @return a - b
     */
    int resta(int a, int b);

    /**
     * Multiplicar dos elementos
     * @param a a
     * @param b b
     * @return a*b
     */
    int multiplicacion(int a, int b);

    /**
     * Dividir dos elementos
     * @param a a
     * @param b b
     * @return a / b
     */
    int division(int a, int b);

    /**
     * Es operador o no
     * @param item item
     * @return es operador o no
     */
    boolean isOperator(String item);

    /**
     * Obtener los items de una expresion
     * @param expresion devuelve un arraylist con cada posicion un elementos
     * @return arraylist de elementos
     */
    ArrayList<String> getItems(String expresion);

    /**
     * Calcular
     * @param line linea a calcular
     * @param type tipo de stack
     * @return resultado
     */
    int calculate(String line,String type);
}
