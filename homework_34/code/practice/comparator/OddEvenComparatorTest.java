package practice.comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OddEvenComparatorTest {
    Integer[] numbers;


    @BeforeEach
    void setUp() {
        numbers = new Integer[] {1, 4, 3, 2, 5, 6, 9, 8, 7, 3};


    }


    @Test
    void oddEvenComparator() {
        Arrays.sort(numbers,new OddEvenComparator());
        System.out.println(Arrays.toString(numbers));


    }

}