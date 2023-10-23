package goat.product;

import goat.product.dao.Supermarket;
import goat.product.model.Food;
import goat.product.model.Product;

public class SupermarketApp {
    public static void main(String[] args) {
        Supermarket kiosk = new  Supermarket(4);//новый супермаркет создаем с помощью конструктора
        kiosk.addProduct(new Product(1000,"Gift card",20));
        System.out.println(kiosk.getQuantity());
        kiosk.addProduct(new Food(2000,"Sosages",5,"20.10.2023",false));
        kiosk.addProduct(new Food(3000,"Goat cheese",13,"31.12.2023",true));
        System.out.println(kiosk.getQuantity());
        kiosk.addProduct(null);
        kiosk.addProduct(new Food(4000,"Pork fat",3,"15.11.2023",true));
        boolean check = kiosk.addProduct(new Food(4000,"Pork fat",3,"15.11.2023",true));
        System.out.println(check);
        System.out.println(kiosk.addProduct(new Product(5000,"Book",2)));
        System.out.println(check);
        kiosk.printAllProducts();
        Product product = kiosk.findProduct(2000);
        System.out.println(product);
        System.out.println("___________________");
        System.out.println(kiosk.updateProduct(4000,34));
        kiosk.updateProduct(2000,35.00);
        System.out.println(product);
        System.out.println("______________");
        kiosk.deleteProduct(2000);
        kiosk.printAllProducts();
        //add ance again
        System.out.println();

    }

}
