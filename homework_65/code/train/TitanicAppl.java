package train;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Считать файл train.csv, сделать расчеты:
//Задание 1. Подсчитайте общую стоимость проезда (выручка от рейса).
//Задание 2. Посчитайте средний тариф для 1,2,3 классов путешествия.
//Задание 3. Подсчитайте общее количество выживших и погибших пассажиров.
//Задание 4. Подсчитайте общее количество выживших и погибших мужчин, женщин и детей (до 18 лет).
public class TitanicAppl {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("train.csv"))) {
            String str = br.readLine();
            String[] cells = str.split(",");
            printCells(cells);
            List<Titanik> list = new ArrayList<>();//обьявляем новую структуру для своих данных
            int counter = 0;
            str = br.readLine();

            while (str != null) {

                counter++;
                cells = str.split(",");
                double fare = Double.parseDouble(cells[10]);
                boolean isSurvived = cells[1].equals("1");
                int pClass = Integer.parseInt(cells[2]);
                boolean isFemale = cells[5].equals("female");
                double age = cells[6].length() == 0 ? 19 : Double.parseDouble(cells[6]);
                list.add(new Titanik(fare, pClass, isSurvived, isFemale, age));//наполняем лист
                str = br.readLine();
                printCells(cells);
            }
            double totalSum = list.stream()
                    .mapToDouble(n -> n.getFare())
                    .sum();
            System.out.println("Sum of fare: " + totalSum);

            double avgFare = list.stream()
                    .mapToDouble(n -> n.getFare())
                    .average().orElse(0);
            System.out.println("Average price of a fare: " + avgFare);

            for (int pClass = 1; pClass <= 3; pClass++) {
                int finalPClass = pClass;
                double avgPrice = list.stream()
                        .filter(f -> f.getpClass() == finalPClass)
                        .mapToDouble(Titanik::getFare)
                        .average()
                        .orElse(0);
                System.out.println("Average price Class: " + pClass + " : " + avgPrice);
            }



                int sumSurv = list.stream()
                        .filter(s -> s.isSurvived())
                        .collect(Collectors.toList())
                        .size();
                System.out.println("Sum of survivors: " + sumSurv);//sum of survivors(1)
                System.out.println("Sum of death: " + (list.size() - sumSurv));//sum of death(0)

                long sumSuvMale = list.stream()
                        .filter(s -> s.isSurvived)
                        .filter(s -> !s.isFemale && s.getAge() >= 18)
                        .count();
                System.out.println("Sum of survivors male: " + sumSuvMale);//sum of survivors male

                long sumDeathMale = list.stream()
                        .filter(s -> !s.isSurvived)
                        .filter(s ->!s.isFemale && s.getAge() >= 18)
                        .count();
                System.out.println("Sum of death male: " + sumDeathMale);

                long sumSuvFemale = list.stream()
                        .filter(s -> s.isSurvived)
                        .filter(s -> s.isFemale && s.getAge() >= 18)
                        .count();
                System.out.println("Sum of survivors Female: " + sumSuvFemale);//sum of survivors female

                long sumDeathFemale = list.stream()
                        .filter(s -> !s.isSurvived)
                        .filter(s -> s.isFemale && s.getAge() >= 18)
                        .count();
                System.out.println("Sum of death Female: " + sumDeathFemale);

                long sumSuvChildren = list.stream()
                        .filter(s -> s.isSurvived)
                        .filter(s -> s.getAge() < 18)
                        .count();
                System.out.println("Sum of survivors children: " + sumSuvChildren);

                long sumDeathChildren = list.stream()
                        .filter(s -> !s.isSurvived)
                        .filter(s -> s.getAge() < 18)
                        .count();
                System.out.println("Sum of death children: " + sumDeathChildren);//sum of death children(0)

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static void printCells(String[] cells) {
        for (String cell : cells){
            System.out.print(cell + " - " + "\t");

        }
        System.out.println();
    }


}
