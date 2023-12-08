package practice.supermarket.dao;
//3 side

import practice.supermarket.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket{
    private Collection<Product> products = new ArrayList<>();//List oder ArrayList
    @Override
    public boolean addProduct(Product product) {
        if (product == null || products.contains(product)) {
            return false;
        }
        return products.add(product);
    }
    @Override
    public Product removeProduct(long barcode) {
        Product removed = findBayBarcode(barcode);//нашли продукт по баркоду
        products.remove(removed);//удалили из списка
        return removed;//вернули из метода, который удалили
    }

    @Override
    public Product findBayBarcode(long barcode) {
        for (Product p : products){
            if (p.getBarCode() == barcode){
                return p;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(p -> category.equalsIgnoreCase(p.getCategory()));
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(p -> brand.equalsIgnoreCase(p.getBrand()));
    }

    @Override
    public Iterable<Product> findProductWithExpireDate() {
        LocalDate currentDay = LocalDate.now();
        return findByPredicate(p -> currentDay.isAfter(p.getDate()));
    }
    private Iterable<Product> findByPredicate(Predicate<Product> predicate){
        List<Product> res = new ArrayList<>();
        //перебираем весь список продуктов находим те которые удовлетворяют
        for (Product p : products){
            if (predicate.test(p)){
                res.add(p);
            }
        }
        return res;


    }
    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();//берем итератор от ArrayList
    }
}
