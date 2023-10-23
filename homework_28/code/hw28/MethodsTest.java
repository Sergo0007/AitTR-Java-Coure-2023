package hw28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    Methods methods;


    @BeforeEach
    void setUp() {
        methods = new Methods();

    }

    @Test
    void positiveNumbers() {
        int[] array = {-1, -3, -5, 0, 2, 4, 6, 9};
        assertEquals(4, methods.positiveNumbers(array));
    }

    @Test
    void negativeNumbers() {
        int[] array = {-3, -5, -7, -4, 0, 6, 8, 2, 1};
        assertEquals(4, methods.negativeNumbers(array));
    }

    @Test
    void evenNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(4, methods.evenNumbers(array));
    }

    @Test
    void zeroNumbers() {
        int[] array = {7, 8, 9, 0, 6, 5, 4, 3};
        assertEquals(1, methods.zeroNumbers(array));
    }
}