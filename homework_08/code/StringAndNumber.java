import java.util.Scanner;

public class StringAndNumber {
    //    Программа получает на вход строку и число повторений этой строки. Программа должна
    //        вывести эту строку нужное количество раз.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        System.out.println("Input  number to repeat the string: ");
        int num = scanner.nextInt();
        int count = 0;

        while (count < num) {
            System.out.println(str);
            count++;
        }
        System.out.println("The end");
    }
}
