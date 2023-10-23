package practice;
//        Задача 1. Имеются оценки абитуриента из его аттестата, всего 20 оценок.
//        Найдите средний балл абитуриента.

public class Abiturient {
    public static void main(String[] args) {

        //обьявили и заполнили массив
        int[] marks = {2,3,3,1,4,1,3,2,1,1,3,2};
          int sumOfMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            sumOfMarks += marks[i];// sumOfMarks = sumOfMarks + marks[i];

        }
        double averageMrk = (double) sumOfMarks / marks.length;
        System.out.println("Average mark: " + averageMrk);
        System.out.printf("Average mark: %.2f", averageMrk);

    }
}
