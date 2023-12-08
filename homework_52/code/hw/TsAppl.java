package hw;

import java.sql.Array;
import java.util.Set;
import java.util.TreeSet;

public class TsAppl {
    public static void main(String[] args) {
        // Создаем tree set
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(6);
        set.add(9);
        set.add(5);
        set.add(7);
        set.add(6);
        set.add(6);
        set.add(8);
        System.out.println("Tree set : " + set);
        // Удаляем элемент из tree set
        set.remove(6);
        System.out.println(" Tree set remove element: " + set);
        System.out.println("---------------");
        set.addAll(set);
        System.out.println(set);

        System.out.println();
        System.out.println("----------------");

        Set<String> set1 = new TreeSet<>();
        set1.add("Student");
        set.add(9);
        set1.add("Viva");
        System.out.println(set1);

        TreeSet ts = new TreeSet();
        ts.add("C");
        ts.add("F");
        System.out.println(ts);


    }


}
