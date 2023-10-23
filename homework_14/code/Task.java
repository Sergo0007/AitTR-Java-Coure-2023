import java.util.Scanner;

public class Task {
    //    В сберкассу на трёхпроцентный вклад положили s рублей. Какой станет сумма вклада через n лет.
//    Использовать цикл for.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада, Input the deposit amount: ");
        int sum = scanner.nextInt();

        double deposit = 0.03;

//        System.out.println("Введите годовую ставку,Input the annual rate: ");
//        double deposit = scanner.nextDouble()/100;

        System.out.println("Введите срок вклада,Input the deposit team: ");
        int years = scanner.nextInt();

        for (int i = 1; i <= years; i++) {
            sum += sum * deposit;
            System.out.println("Сумма вкалада в течении, The amount of the deposit during " + i + " года,the years: " + sum);
        }
        System.out.println("------------------");
        System.out.println("Сумма вклада через 5 лет,deposit amount in 5 years: " + sum);
        System.out.println("-------------------");
        scanner.close();

    }
}
