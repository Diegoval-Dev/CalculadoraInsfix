package Test;

import Model.InfixToPosfix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPosfixTest {

    @Test
    void infixToPostfix() {
        System.out.println(InfixToPosfix.infixToPostfix("2 + 3 * 4"));
    }

    @Test
    void precedence() {
    }
}