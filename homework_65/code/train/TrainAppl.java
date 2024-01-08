//package train;

import org.junit.platform.commons.function.Try;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//public class TrainAppl {
//
//
//    public static void main(String[] args)   {
//
//        (BufferedReader try {
//            br = new BufferedReader(new FileReader("train.csv"))
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }) {
//
//
//            String str = br.readLine();
//            String[] cells = str.split(",");
//            printCells(cells);
//            List<Titanik> list = new ArrayList<>();
//            int counter = 0;
//            str = br.redLine();
//
//            while (str != null) {
//                counter++;
//                cells = str.split(",");
//                double fare = Double.parseDouble(cells[9]);
//                boolean isSurvived = cells[1].equals("1");
//                int pClass = Integer.parseInt(cells[2]);
//                boolean isFemale = cells[5].equals("female");
//                double age = cells[6].length() == 0 ? 19 : Double.parseDouble(cells[6]);
//                list.add(new Titanik(fare, pClass, isSurvived, isFemale, age));
//                str = br.readLine();
//
//            }
//            for (Titanik titanik : list) {
//                System.out.println(titanik);
//            }
//            double totalsum = list.stream()
//                    .mapToDouble(n -> n.getFare())
//                    .sum();
//            System.out.println("Sum of fare: " + totalsum);
//            double avgFirstClass = list.stream()
//                    .filter(f -> f.getpClass() == 1)
//                    .mapToDouble(Titanik::getFare)
//                    .average().orElse(0);
//            System.out.println("Average price of a fare: " + avgFirstClass);
//
//
//            int survived = list.stream()
//                    .filter(s -> s.isSurvived())
//                    .collect(Collectors.toList())
//                    .size();
//            System.out.println("Surv: " + survived);
//            System.out.println("sum of  death: " + (list.size() - survived));
//
//            long sumSurvMale = list.stream()
//                    .filter(s -> s.isSurvived)
//                    .filter(s -> !s.isFemale && s.getAge() >= 18)
//                    .count();
//            System.out.println("");
//            System.out.println("sum of survivors male: " + sumSurvMale);
//
//            long sumSurvFemale = list.stream()
//                    .filter(s -> s.isSurvived)
//                    .filter(s -> !s.isFemale && s.getAge() >= 18)
//                    .count();
//            System.out.println("");
//            System.out.println("sum of survivors female: " + sumSurvFemale);
//
//            long sumSurvChilder = list.stream()
//                    .filter(s -> s.isSurvived)
//                    .filter(s -> !s.isFemale && s.getAge() < 18)
//                    .count();
//            System.out.println("");
//            System.out.println("sum of survivors children: " + sumSurvChilder);
//
//            long sumDeathMale = list.stream()
//                    .filter(s -> s.isSurvived)
//                    .filter(s -> !s.isFemale && s.getAge() >= 18)
//                    .count();
//            System.out.println("");
//            System.out.println("sum of death male: " + sumDeathMale);
//
//            long sumDeathFemale = list.stream()
//                    .filter(s -> s.isSurvived)
//                    .filter(s -> !s.isFemale && s.getAge() >= 18)
//                    .count();
//            System.out.println("");
//            System.out.println("sum of death female: " + sumDeathFemale);
//
//            long sumDeathChilder = list.stream()
//                    .filter(s -> s.isSurvived)
//                    .filter(s -> !s.isFemale && s.getAge() < 18)
//                    .count();
//            System.out.println("");
//            System.out.println("sum of death male: " + sumDeathChilder);
//
//
//        }
//    }
//}