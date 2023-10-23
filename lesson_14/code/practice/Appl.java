package practice;

public class Appl {

    public static void main(String[] args) {
        int[] array = {-12,5,36,28,-16,100,82,64,57,5};
        BubbleSortV2.printArray(array);// печать до сортировк
        BubbleSortV2.bubbleSort(array);
        BubbleSortV2.printArray(array);//после сотрировки

        System.out.println(Math.min(34,-5));

    }
}
