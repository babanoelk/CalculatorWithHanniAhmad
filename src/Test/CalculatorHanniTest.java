import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorHanniTest {
    CalculatorHanni ch = new CalculatorHanni();

    @Test
    void add() {
        //CalculatorHanni ch = new CalculatorHanni();
        double result = ch.add(4, 5);
        assertEquals(9, result);
    }

    @Test
    void subtract() {
        double result = ch.subtract(5, 4);
        assertEquals(1, result);
    }

    @Test
    void divide() {
        double result = ch.divide(10, 2);
        assertEquals(5, result);
    }
}