package practice.linked_list;

import practice.city_bus.Bus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GermanyAppl {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        //adding the city of the capital

        cities.add("Stuttgart");
        cities.add("München");
        cities.add("Berlin");
        cities.add("Potsdam");
        cities.add("Bremen");
        cities.add("Hamburg");
        cities.add("Wiesbaden");
        cities.add("Schwerin");
        cities.add("Hannover");
        cities.add("Düsseldorf");
        cities.add("Mainz");
        cities.add("Saarbrücken");
        cities.add("Dresden");
        cities.add("Magdeburg");
        cities.add("Kiel");
        cities.add("Erfurt");

        System.out.println("-------Print cities---------");
        cities.size();
        for (String c : cities){
            System.out.println(c +  ", ");

        }
        System.out.println("-----Added Hamburg to the middle of the list-----");
        cities.remove("Hamburg");
        cities.add(7,"Hamburg");
        for (String c : cities){
            System.out.println(c);
        }
        System.out.println("-------Remove all cities-------");
        cities.remove();
        System.out.println(cities);



    }
}
