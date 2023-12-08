package practice.fibonacci;

public class FibonacciAppl {
    //  распечатать первые 8 чисел из ряда Фибоначчи
    // 1, 1, 2, 3, 5, 8, 13, 21 - это должно получиться
    //  - сложить все эти числа
    // sum = 54
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(8);

        int sum = 0;
        for (Integer num : fibonacci){
            sum += num;
            System.out.print(num + " ");
        }
        System.out.println("Sum = " + sum);
    }

}
