package hw_66;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class YachtAppl {
    public static void main(String[] args) {
        List<Yacht> yachts = new ArrayList<>();
        yachts.add(new Yacht("Trans", 2020, 19.50, "plastic", 100000.0));
        yachts.add(new Yacht("See", 2023, 25.00, "metal_plastic", 55000.0));
        yachts.add(new Yacht("Stern", 2015, 26.5, "wood", 35000.0));
        yachts.add(new Yacht("Amber", 2017, 37.5, "metal", 155000.0));
        yachts.add(new Yacht("Zero", 2019, 45.00, "metal", 78000.0));

        //отобразить все яхты;
        System.out.println("---------All_Yachts----------");
        yachts.forEach(System.out::println);
        System.out.println();


        //отобразить яхты, сделанные из указанного материала корпуса
        System.out.println("---------Yachts made from metal--------");
        String material = "metal";
        yachts.stream()
                .filter(yacht -> yacht.getMaterial().equals(material))
                .forEach(System.out::println);
        System.out.println();

        //отобразить яхты дороже указанной цены
        System.out.println("--------More expensive than specified price------");
        double price = 60000.0;
        yachts.stream()
                .filter(yacht -> yacht.getPrice() > price)
                .forEach(System.out::println);
        System.out.println();

        //отобразить яхты, чей год выпуска находится в заданном диапазоне;
        System.out.println("--------yachts made during the years from... to...-------");
        int startYear = 2018;
        int endYear = 2023;
        yachts.stream()
                .filter(yacht -> yacht.getYearOfIssue() >= startYear && yacht.getYearOfIssue() <= endYear)
                .forEach(System.out::println);
        System.out.println();

        //отсортировать яхты в порядке убывания стоимости
        System.out.println("-------to sort the yachts out from max price to the min----------");
        yachts.stream()
                .sorted(Comparator.comparingDouble(Yacht::getPrice).reversed())
                .forEach(System.out::println);
        System.out.println();

        //получить среднюю стоимость яхты из созданного набора
        System.out.println("---------Average price---------");
        double averagePrice = yachts.stream()
                .mapToDouble(yacht -> yacht.getPrice())
                .average().orElse(0);
        System.out.println(" yacht's average price: " + averagePrice);


    }
}
