package varibles;

public class MethodsAdvAppl {
    public static void main(String[] args) {
        // длина окружнрсти L = 2 * Pi * r
        double constanta = pi();
        System.out.println(constanta);
        printPi(constanta);
        double res = circleLenght(100);
        System.out.println("L = " + res);
        /*
        В методе main происходит следующее:

       Создается переменная constanta и присваивается значение, возвращаемое методом pi().
       Этот метод возвращает значение числа Пи (π), равное 3.1415926.
       Затем выводится значение переменной constanta с помощью System.out.println.
       Вызывается метод printPi(constanta), который просто выводит значение числа Пи,
       переданное в качестве аргумента.
       Далее вызывается метод circleLenght(100), который рассчитывает длину окружности с радиусом 100 и
       возвращает это значение.
       Затем выводится результат расчета длины окружности с помощью System.out.println.
         */

    }


    public static double circleLenght(double radius) {
        double l = 2 * pi() * radius;
        return l;
         /*2. Метод circleLenght(double radius)
     принимает радиус окружности в качестве аргумента и использует метод pi()
     для получения значения числа Пи. Затем он рассчитывает длину окружности
     по формуле L = 2 * π * r и
     возвращает результат.
     */
    }

    public static void printPi(double p) {// метод просто печатает
        System.out.println("Pi = " + p);
    } /* 3.Метод printPi(double p) принимает значение числа Пи в качестве аргумента и
      выводит его с сообщением "Pi = ".

     */

    public static double pi() { // double - метод должен вернуть такой тип
        double pi = 3.1415926;
        return pi;
        /*
       4. Метод pi() просто возвращает значение числа Пи (3.1415926) с плавающей точкой (тип double).
         */
    }

}
