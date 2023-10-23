import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator1Test {
    Calculator1 calculator;


    @BeforeEach
    void setUp() {
         calculator = new Calculator1();

    }

    @Test
    void addTest() {
        assertEquals(5,calculator.add(4,1));
    }

    @Test
    void subtractTest() {
        assertEquals(10,calculator.subtract(20,10));
    }

    @Test
    void multiplyTest() {
        assertEquals(15,calculator.multiply(5,3));

    }

    @Test
    void divideTest() {
        assertEquals(6,calculator.divide(18,3));
        calculator.divide(18,0);

    }

    @Test
    void remainderTest() {
        assertEquals(0,calculator.remainder(15,15));
        calculator.remainder(5,0);
    }
}