package Model;

import java.util.Stack;

public class InfixToPosfix {
    /**
     * convierte una expresion infix a posfix
     * @param infix cadena en infix
     * @return cadena en posfix
     */
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (stack.isEmpty() || stack.peek() != '(') {
                    throw new IllegalArgumentException("Expresión inválida");
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                throw new IllegalArgumentException("Expresión inválida");
            }
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    /**
     * Signos
     * @param c elemennto
     * @return numero
     */
    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
}
