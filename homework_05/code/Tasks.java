public class Tasks {
//    Задача 1. Задать в программе три стороны треугольника. Проверить выполнимость
//    неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
//    Сообщить результат - существует или нет треугольник с заданными сторонами.
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 4;

        if (a < b + c && b < a + c && c < b + a){
            System.out.println("Triangle");

        }else{
            System.out.println("No triangle");
        }

    }
}
