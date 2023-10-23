public class BinarySearchAppl {
//    Задача 2. Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//    Выполните сортировку полученного массива. Попало ли число 0 в этот массив?
//    (выяснить с помощью binary search) Если да, то на какое место (индекс) в массиве?
//    Если нет, то на какой индекс его следует поставить?

    public static void main(String[] args) {

        int[] bubbleIndex = new int[20];

        BinarySearchMethod.fillArray(bubbleIndex, -100, 100);
        System.out.println("Генерация: ");
        BinarySearchMethod.printArray(bubbleIndex);
        BinarySearchMethod.split();

        BinarySearchMethod.bubbleArray(bubbleIndex);
        System.out.println("Соритровка от bubble: ");
        BinarySearchMethod.printArray(bubbleIndex);
        BinarySearchMethod.split();

        System.out.println("Поиск по индексу: ");
        int index = BinarySearchMethod.binarySearch(bubbleIndex, 0);
        System.out.println(index);

        index = BinarySearchMethod.binarySearch(bubbleIndex, 42);
        System.out.println(index);


    }
}
