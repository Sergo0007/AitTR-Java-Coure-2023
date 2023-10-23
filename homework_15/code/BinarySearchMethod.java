public class BinarySearchMethod {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    public static void fillArray(int[] array, int a, int b) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);

        }
    }

    public static void bubbleArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }


            }

        }
    }

    public static int binarySearch(int[] array, int num) {
        int left = 0;//устанавливаем начальный индекс слева массива
        int right = array.length - 1;//устанавливаем начальный индекс справа массива
        while (left <= right) {//пока индекс слева не станет больше индекса справа
            int mid = (left + right) / 2;//находим средний индекс массива
            if (array[mid] == num) {//если значение по среднему индексу равно искомому числу
                return mid;//возвращаем индекс среднего элемента который равен искомому чмслу
            } else if (num < array[mid]) {//если искомое число меньше значения по среднему индексу
                right = mid - 1;//уменьшаем правую границу поиска на одну позицию левее среднего элемента
            } else {//иначе искомое число больше значения по среднему индексу
                left = mid + 1;//увеличиваем левую границу поиска на одну позицию правее среднего элемента

            }
        }
        //если элемент не найден,возвращаем отрицательное значение.
        //это значение,где элемент должен быть вставлен
        return -left - 1;

    }
    public static void split(){
        System.out.println("_________________________");
    }


}
