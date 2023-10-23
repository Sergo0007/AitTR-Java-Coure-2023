public class Dice {
//        Задача 2. Бросьте кубик с 6-ю гранями 20 раз. Подсчитайте, сколько раз выпала каждая цифра.
    public static void main(String[] args) {

        int[] dice = new int[20];
        int a = 1; //переменная для датчика случайных чисел,левый край
        int b = 6;
       // заполняем массив бросками кубика
        for (int i = 0; i < dice.length ; i++) {
            dice[i] = (int) (Math.random() *(b - a + 1) + a);

        }
        System.out.println();
        int [] counts = new int[6];//// Создаем массив для подсчета выпадений каждой цифры
        for (int i = 0; i < dice.length; i++) {
            dice[i] = (int) (Math.random() * (b - a + 1) + a);
            counts[dice[i] - 1]++;// увеличиваем соответствующий счетчик

        }
        // Выводим результаты
        for (int number = 1;number <= 6;number++) {
            int count = counts[number - 1];
            System.out.println("Цифра " + number + " выпала " + count + " раз ");

        }

    }
}
