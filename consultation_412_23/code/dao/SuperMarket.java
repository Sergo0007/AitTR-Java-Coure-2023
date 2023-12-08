package dao;

import model.Prod;

public interface SuperMarket {
    boolean addProduct(Prod prod);

    Prod removeProduct(Long barCode);

    Prod findByBarCode(Long barCode);

    Iterable<Prod> findByCategory(String category);

    Iterable<Prod> findByBrand(String brand);

    Iterable<Prod> findProductWithExpDate();

    int skuQuantity();
}
