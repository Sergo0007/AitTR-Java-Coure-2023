public class RetAppl {
//    Задача 3. Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//    Реализуйте метод, который получает на вход исходный массив и возвращает массив,
//    содержащий только положительные числа из исходного массива.

    public static void main(String[] args) {

        int[] firstArray = new int[20];


        ReturningArr.fillArray(firstArray, -100, 100);
        ReturningArr.printArray(firstArray);
        ReturningArr.bubbleSort(firstArray);
        System.out.println("Пузырьковая сортировка, bubble array: ");
        ReturningArr.printArray(firstArray);
        System.out.println("Исходный массив,original array: ");
        ReturningArr.printArray(firstArray);
        ReturningArr.split();


        int[] lastArray = ReturningArr.positiveNumbers(firstArray);
        System.out.println("Массив с положительными числами, array with positive numbers: ");
        ReturningArr.printArray(lastArray);

    }
}
