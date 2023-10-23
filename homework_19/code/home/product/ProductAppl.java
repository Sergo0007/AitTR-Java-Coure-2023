package home.product;
//        Создать класс Product, с полями
//        private String name; private long barCode; private double price;
//        Создать класс Food расширяющий класс Product с полем private String expDate;,
//        которое хранит дату истечения срока годности.
//        Создать класс MeatFood расширяющий класс Food с полем private String meatType;,
//        которое хранит тип мяса из которого изготовлен продукт.
//        Создать класс MilkFood расширяющий класс Food с полями private String milkType;
//        private double fat;, которые хранят тип молока и жирность продукта соответственно.
//        Во всех классах переопределить метод toString.

import home.product.model.Food;
import home.product.model.MeatFood;
import home.product.model.MilkFood;
import home.product.model.Product;

public class ProductAppl {
    public static void main(String[] args) {

        Product[] products = new Product[4];
        products[0] = new Product("Cream", 30925018, 0.95);
        products[1] = new Food("Banana", 10590912, 1.20, "01-01-24");
        products[2] = new MeatFood("Chicken legs", 77788812, 1.99, "02-03-24", "Chicken");
        products[3] = new MilkFood("Ice", 33344456, 1.05, "12-12-23", "Cow's milk", 3.2);

        allProducts(products);
        System.out.printf(" Total price: %.2f ", totalPrice(products));

    }
    public static void allProducts(Product[] products) {// метод печатающий все продукты из массива
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);

        }
    }

    public static double totalPrice(Product[] products) {//метод возвращающий сумму цен всех продуктов.
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getPrice();


        }
        return totalPrice;
    }
}
