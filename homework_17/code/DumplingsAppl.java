import java.util.Random;
//        Задача  (повторение и закрепление темы массивы, заполнение массива с помощью датчика случайных чисел)
//        Задача про поиск "счастливого пельменя".
//        Часть 1. Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
//        Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя.
//        Часть 2. Хозяйка налепила для гостей 30 пельменей. В один из пельменей она положила монету,
//        которая увеличивает вес пельменя на 15 грамм. Напишите программу,
//        которая ищет счастливый пельмень.

public class DumplingsAppl {

    public static void main(String[] args) {

        int[] dumplings = new int[30];
        Random random = new Random();
        for (int i = 0; i < dumplings.length; i++) {
            dumplings[i] = random.nextInt(35 - 25) + 25;

        }
        int happyIndex = random.nextInt(dumplings.length);
        dumplings[happyIndex] += 15;
        System.out.println("Вес пельменей: ");
          for (int i = 1; i < dumplings.length; i++) {
            System.out.println("Пельмень " + i + ": " + dumplings[i] + " грамм");

        }
        System.out.println("Бинго!!! Вы поймали единственный пельмень с монеткой");
        for (int i = 0; i < dumplings.length; i++) {
            if (dumplings[i] >= 40){
                System.out.println("Счастливый пельмень " + i);

            }/*изначально планировалось писать этот код в двух файлах как было показано Вами на разборе
            домашнего задания но на консультации пошли по этому пути,после чего доработал и решил оставить
            его в таком виде.С методами fillArray ,BirnaryArray,...поработать отдельно.
            */


        }

    }
}
