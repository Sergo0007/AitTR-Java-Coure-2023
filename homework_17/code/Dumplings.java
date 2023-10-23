public class Dumplings {// Dumplings обьект

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }
    public static void fillArray(int[] array,int a,int b){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (b - a + 1) + a);

        }
    }
    public  static  int findHappyDumpling(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array.length >= 40){
                return i;
            }

        }
        return -1;
    }

}
