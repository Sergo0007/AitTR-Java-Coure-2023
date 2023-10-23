import java.util.Scanner;

public class Salary {
    //    Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
//    если базовая зарплата 500$. За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%,
//    за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
//    Сколько лет проработал работник вводится с клавиатуры.
    public static void main(String[] args) {

        int baseSalary = 500;
        int experience3 = 10;
        int experience5 = 50;
        int experience10 = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("input experience");
        int workExperience = scanner.nextInt();

        switch (workExperience) {
            case 1:
            case 2:
                baseSalary = 500;
                System.out.println("Стаж работы до 2 лет c окладом " + baseSalary + " доллаов" );
                break;
            case 3:
            case 4:
                baseSalary = baseSalary + baseSalary * experience3 / 100;
                System.out.println("Стаж работы от 3 до 5 лет зарплата " + baseSalary + " долларов");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                baseSalary = baseSalary + baseSalary * experience5 / 100;
                System.out.println("Стаж работы от 5 до 9 лет зарплата " + baseSalary + " долларов");
                break;
            case 10:
                baseSalary = baseSalary + baseSalary * experience10 / 100;
                System.out.println("Стаж работы от 10  лет зарплата " + baseSalary + " долларов");
                break;




        }


    }
}