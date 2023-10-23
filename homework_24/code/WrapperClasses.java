import java.util.concurrent.Callable;

public class WrapperClasses {
    public static void main(String[] args) {
        //Чтобы создать объект-оболочку, используйте класс-оболочку вместо примитива тип.
        // Чтобы получить значение, можно просто напечатать объект:

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println("==================");

//        Поскольку теперь вы работаете с объектами, вы можете использовать определенные методы,
//        чтобы получить сведения о конкретном объекте.Например,
//        следующие методы используются для получения значения,
//        связанного с соответствующий объект-оболочка:
//        , , , , .intValue()byteValue()shortValue()longValue()floatValue()doubleValue()charValue() booleanValue()
//        В этом примере будет получен тот же результат, что и в примере выше:

        Integer myInt1 = 5;
        Double myDouble1 = 5.99;
        Character myChar1 = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble1.doubleValue());
        System.out.println(myChar1.charValue());
        System.out.println("==================");

//        Другим полезным методом является метод,
//        который используется для преобразования объектов-оболочек в строки.toString()
//        В следующем примере мы преобразуем an в a и используем метод класса для вывода
//        длины "строки":Integer String length() String

        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());



            }
        }


















