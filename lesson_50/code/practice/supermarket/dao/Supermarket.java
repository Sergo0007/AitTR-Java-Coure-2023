package practice.supermarket.dao;
//2 side

import practice.supermarket.model.Product;


public interface Supermarket extends Iterable<Product> {
    boolean addProduct(Product product);
    Product removeProduct(long barcode);
    Product findBayBarcode(long barcode);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findProductWithExpireDate();
    int skuQuantity();//количество складских единиц,1 продукт = 1 sky

}
