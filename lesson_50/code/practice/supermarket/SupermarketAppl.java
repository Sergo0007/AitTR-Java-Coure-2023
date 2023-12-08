package practice.supermarket;

import practice.supermarket.dao.Supermarket;
import practice.supermarket.dao.SupermarketImpl;
import practice.supermarket.model.Product;

import java.time.LocalDate;

public class SupermarketAppl {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        Supermarket myMarket = new SupermarketImpl();
        myMarket.addProduct(new Product(111111,"White Bread","Bread","Kolosok",6.5,now.minusDays(5)));
        myMarket.addProduct(new Product(222222,"ChokoMilk","Dairy","MilkLand",13,now.minusDays(3)));
        myMarket.addProduct(new Product(333333,"Cheese Gauda","Dairy","farmer",22.5,now.minusDays(50)));
        myMarket.addProduct(new Product(444444,"Cheese Chedder","Dairy","MilkLand",30,now.minusDays(85)));
        myMarket.addProduct(new Product(555555,"sweet Buns","Bread","Kolosok",18.3,now.minusDays(25)));

        for (Product p : myMarket){
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Products by Brand: ");
        Iterable<Product> res = myMarket.findByBrand("MilkLand");
        for (Product p : res){
            System.out.println(p);
        }
        System.out.println("Products by Category: ");
        res = myMarket.findByCategory("Bread");
        for (Product p : res){
            System.out.println(res);
        }
        System.out.println("Products with expired");
        res = myMarket.findProductWithExpireDate();
        for (Product p : res){
            System.out.println(p);
        }

    }
}