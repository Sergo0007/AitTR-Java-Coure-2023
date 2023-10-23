public class Sportsman {
//        Задача 3. В первый день спортсмен пробежал s километров,
//        а затем он каждый день увеличивал пробег
//        на 10 % от предыдущего значения. Определите номер того дня,
//        на который пробег спортсмена составит не менее target километров.
//        Программа получает на вход действительные числа s и target и должна
//        вывести одно натуральное число.
    public static void main(String[] args) {

         double startOfTraining = 1;
         double dailyLoad = 0.1;
         double target = 5;
         int days = 0;

         while (startOfTraining <= target){
             startOfTraining += startOfTraining * dailyLoad;
             System.out.println();
             days++;
             System.out.println("You have reached the target in " + target + days +" days");

        }


    }
}
