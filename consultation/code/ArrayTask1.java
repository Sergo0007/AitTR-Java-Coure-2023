public class ArrayTask1 {
    public static void main(String[] args) {

        int[] source = {1, 5, 1, 3, 5, 98};
        int arrLength = source.length;
//        int lastElementInArray = source[arrLength - 1];


        for (int i = 0; i < source.length; i++) {
            int currentValue = source[i]; // i = 0,currentValue = 1 | i = 1,currentValue = 5
            int counter = 0;

            for (int j = 0; j < arrLength; j++) {
                if (currentValue == source[j]) {
                    counter++;

                }

            }


            System.out.println("Число " + currentValue + " , аовторяется " + counter + " раз(а)");


        }
    }
}
