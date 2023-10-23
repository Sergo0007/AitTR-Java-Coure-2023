public class NumbersAndArray {
    //    Задача 1. Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его нечетных
//    элементов (не индексы!, а сами элементы).
    public static void main(String[] args) {

        int[] randomInt = new int[10];

        int a = -10;
        int b = 10;
        for (int i = 0; i < randomInt.length; i++) {
            randomInt[i] = (int) (Math.random() * (b - a + 1) + a);

        }
        for (int i = 0; i < randomInt.length; i++) {
            System.out.print(randomInt[i] + " ");


        }
        int sum = 0;
        for (int i = 0; i < randomInt.length; i++) {

            if (randomInt[i] % 2 != 0) {
                System.out.println(" \n Не четный элемент: " + randomInt[i]);
                sum += randomInt[i];
                System.out.println();

            }
        }
        System.out.println("Cумма не четных элементов: " + sum );
    }
}
