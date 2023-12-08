package hw_59;
//        Задача 1. По аналогии с классом User создать класс Student с полями: id, firstName, lastName,
//        birtDay, course, groupNum (номер группы), country, gender(пол). В приложении DekanatAppl
//        создать студентов из разных стран, которые учатся на разных курсах, в разных группах.
//        Сделать списки студентов по курсам, по группам, отсортированные по фамилиям и возрасту.
//        Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?
//        Дополнительное задание (**): добавить у каждого студента поле int[] marks с его оценками и
//        рассчитать средний балл.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DekanatAppl {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student(1, "Frank", "Uparo", 18, 2005_1_1, "male", "Ger", 1, 7);
        students[1] = new Student(2, "Eric", "Izaro", 20, 2003_2_11, "male", "Usa", 3, 12);
        students[2] = new Student(3, "Rita", "Otto", 21, 2002_6_7, "female", "Fr", 4, 77);
        students[3] = new Student(4, "Ari", "Willas", 22, 2001_5_5, "male", "It", 5, 8);
        students[4] = new Student(5, "Susana", "Vogel", 19, 2004_3_4, "female", "Gre", 2, 34);

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            studentList.add(students[i]);

        }
        pintStudents(studentList);
        pintStudentsSortedByAge(studentList);
        sortedByLastNameAndAge(studentList);
        sortedByBrithDate(studentList);



        


    }

    public static void pintStudents(List<Student> studentList) {
        System.out.println("-----------------------------");
        studentList.stream()
                .forEach(System.out::println);
        System.out.println("-------------------------------");
    }

    private static void pintStudentsSortedByAge(List<Student> studentList) {
        System.out.println("-----------------------------");
        studentList.stream()
                .map(s -> {
                    return new Student(
                            s.getId(),
                            s.getFirstName(),
                            s.getLastName(),
                            s.getAge(),
                            s.getBritDay(),
                            s.getGender(),
                            s.getCountry(),
                            s.getCourse(),
                            s.getGroupNum());


                })
                .sorted(Comparator.comparing(Student ::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
    private static void sortedByLastNameAndAge(List<Student> studentList){
        System.out.println("-----------------------------");
        studentList.stream()
                .sorted(Comparator.comparing(Student :: getAge).
                thenComparing(Student :: getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
    private static void sortedByBrithDate(List<Student> studentList){
        System.out.println("-------BrithDate-------");
        studentList.stream()
                .sorted(Comparator.comparing(Student::getBritDay))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-----------------");
       //средний возраст всех студентов
        double averageAgeAllStudents = studentList.stream()
                .mapToDouble(Student::getAge).average().orElse(0.0);
        System.out.println("Average age of all students: " + averageAgeAllStudents);
        System.out.println("------------------");

        //средний возраст по курсу


        }
//        private Object averageAgeByCourse(List<Student> studentList){
//        studentList.stream()
//                .collect(Collectors.groupingBy(Student::getCourse, Collectors.averagingDouble(Student::getAge)));
//        return null;

        }
   // }

