import java.util.Arrays;

public class ArrayAppl {
    // создать массив на 20 элементов, случайные целые числа от -50 до 30
// сколько положительных? отрицательных?
// сколько четных? сколько нечетных
// максимальное? минимальное число?
// сортировка
// есть ли заданное число? - найти его индекс
    public static void main(String[] args) {


        int[] numbers = Methods.fillArray(20, -50, 30);
        Methods.printArray(numbers);
        int num = Methods.positiveNum(numbers);
        System.out.println("Positive num: " + num);
        int indexMax = Methods.indexMaxEl(numbers);
        System.out.println("Index of max  element = " + indexMax);
        System.out.println("Max element = " + numbers[indexMax]);
        Methods.bubbleSort(numbers);//сортируем массив
        System.out.println(Arrays.toString(numbers));//печатаем массив




    }
}
