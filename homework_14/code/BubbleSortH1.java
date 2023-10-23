public class BubbleSortH1 {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    public static void fillArray(int[] array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);//заполянем элементы массива случайными числами

        }
    }

    public static int[] sortArray(int[] array) {
        int min = array[0];//инициализация переменной min первым элементом массива
        int indexMin = 0;//инициализируем индекс минимального значения
        for (int i = 0; i < array.length; i++) {/*переборка массива,на каждой интерации выбирается
            текущий элемент в качестве минимального min и его индекс сохраняется в indexMin */
            min = array[i];
            indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexMin = j;
                }

            }
            int tmp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = tmp;
        }
        return array;

    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) { //если левый элемент больше правого то меняем их
                    int tmp = array[j];// в переменную вносим текущий элемент
                    array[j] = array[j + 1];//в текущий элемент вносим следующий элемент
                    array[j + 1] = tmp;// в следующий элемент вносим значение переменной tmp


                }

            }

        }

    }

    public static void split() {
        System.out.println("-------------------------------");
    }
}
