package practice.fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    //fields
    private int quantity;//Поле `quantity` хранит количество чисел, которые следует сгенерировать в ряду Фибоначчи.
    private int prevNum;//- Поле `prevNum` хранит значение предыдущего числа в ряду Фибоначчи.
    private int prevPrevNum;//- Поле `prevPrevNum` хранит значение предыдущего предыдущего числа в ряду Фибоначчи.
    private int counter;//- Поле `counter` хранит текущий индекс в генерации ряда чисел Фибоначчи.

    //constructor
    //- Конструктор `FibonacciIterator(int quantity)` устанавливает начальные значения полей
    // и принимает количество чисел в ряду Фибоначчи для генерации.


    public FibonacciIterator(int quantity) {
        this.quantity = quantity;
        this.prevNum  = 1;
        this.prevPrevNum  = 1;
        this.counter = 1;
    }





    @Override
    public boolean hasNext() {  //- Метод `hasNext()` возвращает `true`, если `counter` меньше или
        // равняется `quantity`, и `false` в противном случае. Он проверяет, остались ли еще числа,
        // которые нужно сгенерировать в ряду.

        return counter <= quantity;
    }

    @Override
    public Integer next() {//- Метод `next()` возвращает следующее число Фибоначчи в ряду.
        // Его логика состоит в том, что для первых двух чисел всегда возвращает 1,
        // а для последующих чисел использует формулу Фибоначчи, вычисляя текущее число как сумму двух
        // предыдущих чисел в ряду. Затем обновляет значения `prevNum` и `prevPrevNum`
        // для следующего вызова `next()`. Возвращает текущее число Фибоначчи.

        if (counter++ <= 2) {
            return 1;
        }
        int currNum = prevNum;//текущее число
        prevNum = prevPrevNum + prevNum; //вычисляем следующее как сумму двух предыдущих
        prevPrevNum = currNum;// переносим текущее число
        return prevNum;
    }
}
