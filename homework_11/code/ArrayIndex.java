public class ArrayIndex {
//    Задача 2. Написать метод, принимающий массив целых чисел, и возвращающий произведение
//    всех его элементов с четными индексами.


    public static void main(String[] args) {


        int[] randomInt = new int[10];
        int a = -10;
        int b = 10;

        // Заполнение массива случайными числами
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        // Вывод массива на экран
        System.out.print("Массив целых чисел: ");
        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] + " ");
        }

        int IndexElements = calculateIndexElements(randomInt);
        System.out.println("\nПроизведение элементов с четными индексами: " + IndexElements);
    }

    public static int calculateIndexElements(int[] arr) { //метод который находит и возвращает произведение элементов с четными индексами в массиве.
        int index = 0;
        for (int i = 0; i < arr.length; i ++) {
            index *= arr[i];
        }
        return index;
    }
}

