package practice.computer;

import practice.computer.model.Computer1;
import practice.computer.model.Laptop1;
import practice.computer.model.Smartphone1;

public class ComputerAppl1 {
    public static void main(String[] args) {

        double a = 10;//upper casting делается по умолчанию
        int b = (int) a;//down casting
        Computer1[] shop = new Computer1[5];
        shop[0] = new Computer1("i9", 12, 512, "HP");
        shop[1] = new Laptop1("i5", 16, 512, "Asus", 3, 2.5);
        shop[2] = new Laptop1("i5", 24, 1024, "Medion", 4, 2.5);
        shop[3] = new Smartphone1("Snapdragon", 6, 120, "Xiaomi", 48, 0.200, 1234567898);
        printArray(shop);
        int total = getTotalSsdCapacity(shop);
        System.out.println("Total ssd capacity = " + total);
        Laptop1 laptop1 = (Laptop1) shop[1];//down casting
        laptop1.setHours(4.5);
        System.out.println(laptop1);
        System.out.println(shop[1]);

        int totalHours = getTotalhoursLaptop(shop);
        System.out.println("Total Hoours Laptop: " + totalHours);

        int totalssdL = getTotalSsdLaptop(shop);
        System.out.println("Total SSD Laptops: " + totalssdL);


    }

    public static void printArray(Computer1[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);

            }
        }
    }

    public static int getTotalSsdCapacity(Computer1[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                res += arr[i].getSdd();
            }


        }
        return res;


    }

    public static int getTotalhoursLaptop(Computer1[] arr) {
        int totalHours = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop1 && !(arr[i] instanceof Smartphone1)) {
                totalHours += ((Laptop1) arr[i]).getHours();//down casting//сначала кастинг затем getHours

            }

        }
        return totalHours;
    }
    public static int getTotalSsdLaptop(Computer1[] arr) {
        int totalSsdLaptop = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Laptop1 && !(arr[i] instanceof Smartphone1)) {
                totalSsdLaptop += arr[i].getSdd();

            }

        }
        return totalSsdLaptop;
    }

}