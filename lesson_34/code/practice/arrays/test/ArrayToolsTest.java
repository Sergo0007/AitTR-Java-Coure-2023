package practice.arrays.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.arrays.utils.ArrayTools;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9,7,4,7,2,5,1,0};
        arrStr = new  String[]{"one","two","three","for","five"};
    }
    @Test
    void testPintArray(){
        System.out.println("-----testPrintArray---------");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }
    @Test
    void testSearch(){
        System.out.println("------test search--------");
        int index = ArrayTools.search(arrStr,"four");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrStr,"six");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum,4);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum,6);
        System.out.println("index = " + index);
    }

    }
