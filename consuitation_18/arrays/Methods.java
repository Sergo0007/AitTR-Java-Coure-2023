public class Methods {
    //печать массива
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }

    }

    //метод заполняет массив длиной n элементов случайными числами в интервале от а до б
    public static int[] fillArray(int n, int a, int b) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);

        }
        return arr;//возращаем массив(обьект)
    }

    //сколько положитьлных?
    public static int positiveNum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //если элемент массива > 0,то счетчик увеличим
            if (arr[i] >= 0) {
                count++;
            }

        }
        return count;
    }

    //поиск  индекса максимального элемента массива
    public static int indexMaxEl(int[] arr) {
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            //если найдется еще больший элемент массива то мах = этому элементу
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }

        }
        return indexMax;

    }

    //bubble sort
    //сравниваем левый элемент с правым элементо(cтоят рядом) и если левый больше правого,то
    //меняем местами.То есть больший элемент будет всплывать к правому концу массива
    //arr[i]/текущий элемент массива,arr[i+1] это соседний элемент справа
    //это надо повторять после всплытия каждого пузырька
    public static int[] bubbleSort(int[] arr) {
        // int tmp =0;
        for (int i = 0; i < arr.length - 1 - i; i++) {
            for (int j = 0; j < arr.length  - 1; j++) {
             if(arr[j] > arr[j + 1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;


             }

                }
            }
        return arr;

    }
}
