package practice;
//        Задача 1. Задача о яблоках (начальное значение 30 яблок).
//        Запустить цикл, в котором яблоки берутся из корзины до тех пор, пока они там есть.
//        Последнее сообщение: "Яблоки кончились!".

public class Apples {
    public static void main(String[] args) {
        int apples = 30;// старт значения
        int counter = 0;//счетчик
        int appleInCycle = apples;//параметр

        while (appleInCycle > 0) {
            //тело цикла
            System.out.println("Take one apple from basket");
            appleInCycle = appleInCycle - 1;//изменяем параметр цмкла
            // applesInCycle--;
            counter++;//количество выполненых заданий
            System.out.println("The rest of apples " + appleInCycle);

        }
        System.out.println("The job is done,total apples " + counter + "added in pei from " + apples + "in basket");


    }
}