package hm;
//        Задача 2. Создайте класс Country со следующими полями:
//
//        название;
//        население(в млн.);
//        континент. Создайте связный список, содержащий 11 стран из разных континентов.
//        Получите списки этих стран, отсортированные по:
//        алфавиту;
//        по размеру населения в стандартном и обратном порядках;
//        принадлежности континенту и размеру населения в порядке от большего к меньшему.

import java.util.Comparator;
import java.util.LinkedList;

public class CountryAppl {
    public static void main(String[] args) {
        LinkedList<Country> countries = new LinkedList<>();

        countries.add(new Country("China", 1_338_094_418, "Asia"));
        countries.add(new Country("India", 1_177_955_904, "Asia"));
        countries.add(new Country("USA", 309_824_646, "North America"));
        countries.add(new Country("Indonesia", 245_512_357, "Asia"));
        countries.add(new Country("Brazil", 192_572_592, "South America"));
        countries.add(new Country("Pakistan", 168_800_039, "Asia"));
        countries.add(new Country("Bangladesh", 158_255_312, "Asia"));
        countries.add(new Country("Nigeria", 146_019_909, "West Africa"));
        countries.add(new Country("Russia", 141_935_896, "Europe"));
        countries.add(new Country("Japan", 127_288_419, "Asia"));
        countries.add(new Country("Mexico", 09.955_400, "South America"));

        System.out.println("--------- Quantity Countries----------");
        System.out.println(" Quantity Countries: " + countries.size());
        System.out.println("------------------------");

        Comparator<Country> alphabet = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("----------------------------");
        System.out.println("-------Sorted Alphabet---------");
        countries.sort(alphabet);
        for (Country c : countries) {
            System.out.println(c.getName() + " : " + c.getPopulation() + " - " + c.getContinent());

        }
        System.out.println("-------------------");

        Comparator<Country> population = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Double.compare(o1.getPopulation(), o2.getPopulation());
            }
        };
        System.out.println("--------Sorted Population-----------");
        countries.sort(population);
        for (Country c : countries) {
            System.out.println(c.getName() + " : " + c.getPopulation() + " - " + c.getContinent());
        }
        System.out.println("------------------------");
        System.out.println("-------Sorted Population Reserve-------- ");
        countries.sort(population.reversed());
        for (Country c : countries) {
            System.out.println(c.getName() + " : " + c.getPopulation() + " - " + c.getContinent());
        }
        System.out.println("------------------");
        Comparator<Country> continentPopulation = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                int res = o2.getContinent().compareTo(o1.getContinent());
                if (res == 0) {
                    res = Double.compare(o2.getPopulation(), o1.getPopulation());
                }
                return res;
            }
        };
        System.out.println("-----------Sorted Continent and Population--------");
        countries.sort(continentPopulation);
        for (Country c : countries) {
            System.out.println(c.getName() + " : " + c.getPopulation() + " - " + c.getContinent());
        }


    }


}
