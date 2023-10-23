public class ArrayAppl_02
//        Задача 1. Дополните класс ArrayMethods методами, которые находят:
//        минимальный элемент в массиве
//        индекс минимального элемента в массиве В классе ArrayAppl задайте собственный массив
//        из целых чисел на 10 элементов, найдите минимальный элемент и его индекс
{
    public static void main(String[] args) {

        int[] rubi = {12,2,5,7,15,20,9,10,12,14};

        ArrayMethods_02.printArray(rubi);
        int min = ArrayMethods_02.minArray(rubi);
        System.out.println("Minimum: = " + min);

        ArrayMethods_02.split();

        ArrayMethods_02.minArrayIndex(rubi);
        int minIndex = ArrayMethods_02.minArrayIndex(rubi);
        System.out.println("Index of min element: = " + minIndex);

        ArrayMethods_02.split();

        ArrayMethods_02.sortArrayIntAsc(rubi);
        ArrayMethods_02.printArray(rubi);






    }
}
