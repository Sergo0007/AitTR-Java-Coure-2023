package homework_28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsArrayTest {


    MethodsArray methodsArray;

    @BeforeEach
    void setUp() {
        methodsArray = new MethodsArray();

    }

    @Test
    void sum() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(15, methodsArray.sum(array));

    }

    @Test
    void search() {
        int[] array = {0, 2, 9, 7, 5, 3};
        assertEquals(false, methodsArray.search(array, 4));
        //assertTrue();


    }
}