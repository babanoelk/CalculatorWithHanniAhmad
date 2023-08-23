import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorAhmadTest {

    @Test
    void addTwoNumbers() {
        CalculatorAhmad calculatorAhmad = new CalculatorAhmad();
        double test = calculatorAhmad.addTwoNumbers(30.50, 29.50);
        assertEquals(60, test);
    }

    @Test
    void multiplyTwoNumbers() {
        CalculatorAhmad calculatorAhmad = new CalculatorAhmad();
        double test = calculatorAhmad.multiplyTwoNumbers(10.00, 30.00);
        assertEquals(300, test);
    }

    @Test
    void minusTwoNumbers() {
        CalculatorAhmad calculatorAhmad = new CalculatorAhmad();
        double test = calculatorAhmad.minusTwoNumbers(50, 5);
        assertEquals(45, test);
    }


}