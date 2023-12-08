package practice.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {
    //необходимо ответить на вопросы
    //1. Кто из программистов знает больше всего языков(поименно)
    //Ф.И -> количество языков
    //2.Какие языки пользуются популярностью среди наших программистов
    //язык программирования - сколько программистов его знают

    public static void main(String[] args) {
        List<Programmer> programmers = getProgrammers();//заполняем список программистов
        System.out.println("---------Most skilled programmers----------");
        printMostSkilledProgrammers(programmers);

        System.out.println("----------Most popular technologies---------");
        printMostPopularTechnologies(programmers);


    }//end of main

    private static void printMostPopularTechnologies(List<Programmer> programmers) {
        System.out.println("---------Print all technologies---------");
        Iterable<String> technologies = programmers.stream()
                .map(p -> p.getTechnologies())//преобразование обьекта программер в одно его поле с массивом технологий
                .flatMap(t -> Arrays.stream(t))   //каждый из массивов преобразуем в отдельный стрим
                .collect(Collectors.toSet());// собираем результат стримов в лист
        technologies.forEach(System.out::println);
        System.out.println("-----------List of Technologies---------");
        StreamSupport.stream(technologies.spliterator(),false)
                .distinct()
                .forEach(System.out::println);

        System.out.println("---------Grouping By Programmers--------");
        Map<String, Long> techFrequency = programmers.stream()
                .map(Programmer::getTechnologies)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t -> t, Collectors.counting()));

        System.out.println(techFrequency);
        Long max = techFrequency.values().stream()
                .max(Long::compare).orElse(0L);

        techFrequency.entrySet().stream()
                .filter(e -> max.equals(e.getValue()))//взяли только тех у кого = мах
                .forEach(e -> System.out.println(e.getKey()));


    }

    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
        Map<Integer, List<Programmer>> skilledProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(p -> p.getTechnologies().length));
        Integer max = skilledProgrammers.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        skilledProgrammers.get(max).forEach(System.out::println);

        //       Map<Integer,List<Programmer>> skilledProgrammers = new HashMap<>();
//        int max = 0;
//        for (Programmer programmer: programmers) {
//            int key = programmer.getTechnologies().length;//ключ для мапы то количество языков которое он знает
//            max = key > max ? key : max;//обновили max если он стал больше в ходе выполнения цикла
//            skilledProgrammers.putIfAbsent(key,new ArrayList<>());//если такой ключ встретился в первый раз то создаем пустой лист
//            List<Programmer>programmerList = skilledProgrammers.get(key);
//            programmerList.add(programmer);
//
//
//        }
//        System.out.println(skilledProgrammers);
        System.out.println("--------------------");
//        System.out.println(programmers);
//        System.out.println("--------------");
//        programmers.stream()
//                        .forEach(System.out::println);
//        System.out.println("--------------");
//        programmers.forEach(System.out::println);
    }

    private static List<Programmer> getProgrammers() {
        return List.of(
                new Programmer("Peter", "C++", "Python", "Java", "Kotlin"),
                new Programmer("John", "Java"),
                new Programmer("Helen", "Kotlin", "Scala", "Java", "JavaScript"),
                new Programmer("Jacob", "Python", "Go"),
                new Programmer("Mikhail", "Fortran", "Algol", "PL-1")
        );
    }
}//end of class
