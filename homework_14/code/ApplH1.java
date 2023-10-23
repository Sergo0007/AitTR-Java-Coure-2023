public class ApplH1 {
    public static void main(String[] args) {
        int[] bubble = new int[10];
        int a = 0;
        int b = 10;

        System.out.println("до сортировки и генерации: ");
        BubbleSortH1.printArray(bubble);//до сортировки и генерации
        System.out.println("Генерациия: ");
        BubbleSortH1.fillArray(bubble,0,10);
        BubbleSortH1.printArray(bubble);//после генерации

        System.out.println("Сортировка: ");
        BubbleSortH1.sortArray(bubble);
        BubbleSortH1.printArray(bubble);
        BubbleSortH1.split();

        System.out.println("Пузырьковая сортировка: ");
        BubbleSortH1.bubbleSort(bubble);
        BubbleSortH1.printArray(bubble);
        BubbleSortH1.split();


        int[] friendBubble = new int[20];
        int c = 0;
        int d = 20;

        System.out.println("до сортировки и генерации: ");
        BubbleSortH1.printArray(friendBubble);//до сортировки и генерации
        System.out.println("Генерациия: ");
        BubbleSortH1.fillArray(friendBubble,0,20);
        BubbleSortH1.printArray(friendBubble);

        System.out.println("Сортировка: ");
        BubbleSortH1.sortArray(friendBubble);
        BubbleSortH1.printArray(friendBubble);
        BubbleSortH1.split();

        System.out.println("Пузырьковая сортировка: ");
        BubbleSortH1.bubbleSort(friendBubble);
        BubbleSortH1.printArray(friendBubble);
        BubbleSortH1.split();
    }


}
