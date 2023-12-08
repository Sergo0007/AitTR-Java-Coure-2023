package hm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Car {
    // Создадим объект cars, в котором будут храниться строки:ArrayList

    // ArrayList<String> cars = new ArrayList<String>();// Create an ArrayList object,Создание объекта ArrayList
    public static void main(String[] args) {
//        Добавить элементы
//        В классе есть много полезных методов. Например, чтобы добавить элементы в ,
//        используйте метод:ArrayListArrayListadd()
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Bmw");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars + " | ");

        //Доступ к элементу
        //Чтобы получить доступ к элементу в , используйте метод и обратитесь к номеру индекса:ArrayListget()
        cars.get(0);
//        Изменение элемента
//        Чтобы изменить элемент, используйте метод и обратитесь к номеру индекса:set()
        cars.set(0,"opel");
//        Удаление элемента
//        Чтобы удалить элемент, используйте метод и обратитесь к номеру индекса:remove()
        cars.remove(0);
        //Чтобы удалить все элементы в , используйте метод:ArrayListclear()
        cars.clear();
//        ArrayList - размер
//        Чтобы узнать, сколько элементов в ArrayList, используйте метод:size
        cars.size();

//        Цикл по ArrayList
//        Переберите в цикле элементы цикла with и используйте метод, чтобы указать,
//                сколько раз должен выполняться цикл:ArrayListfor size()
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }
        for (String i : cars){
            System.out.println(i);
        }
//        Другие типы
//        Элементы в ArrayList на самом деле являются объектами. В приведенных выше примерах мы создали элементы (объекты) типа "Строка". Помните, что String в Java является объектом (а не примитивным типом). Для использования других типов, таких как int, необходимо указать эквивалентный класс-оболочку: . Для других примитивных типов используйте: для boolean, для char, для double, и так далее:IntegerBooleanCharacterDouble
//
//                Пример
//        Создадим для хранения чисел (добавим элементы типа ):ArrayListInteger
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers){
            System.out.print(i + " | ");
        }
//        Сортировка ArrayList
//        Еще одним полезным классом в пакете является класс, включающий в себя метод сортировки
//        списков в алфавитном или числовом порядке:java.utilCollectionssort()
        ArrayList<String> cars1 = new ArrayList<String>();
        cars1.add("V");
        cars1.add("B");
        cars1.add("F");
        cars1.add("M");
        Collections.sort(cars1);
        for (String i : cars1){
            System.out.println(i);
        }
//        Пример
//        Сортировка ArrayList целых чисел:
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(33);
        myNumber.add(15);
        myNumber.add(20);
        myNumber.add(34);
        myNumber.add(8);
        myNumber.add(12);
        Collections.sort(myNumber);
        for (int i : myNumber){
            
            System.out.println(i);
        }


    }
}
