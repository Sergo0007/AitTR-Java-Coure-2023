package dao;

import model.Prod;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SuperMarketSetImpl implements SuperMarket {
    //field
   // Prod[] prods;
    Set<Prod> prodSet;
    //int size;//текущее количество товаров
    int capacity;//максимальное возможное количество товаров SKU

    //constructor
    public SuperMarketSetImpl() {
        prodSet = new HashSet<>();
       // this.capacity = capacity;
    }
    public SuperMarketSetImpl(List<Prod>prodList){
      this();
      for (Prod p : prodList){
          addProduct(p);
      }

    }

    @Override
    public boolean addProduct(Prod prod) {
        if(prod == null){
            return false;
        }
        return prodSet.add(prod);
    }


    @Override
    public Prod removeProduct(Long barCode) {
        Prod removed = findByBarCode(barCode);
        prodSet.remove(removed);
        return removed;
    }

    @Override
    public Prod findByBarCode(Long barCode) {
        return prodSet.stream()
                .filter(p -> p.getBarCode() == barCode)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Iterable<Prod> findByCategory(String category) {
        return prodSet.stream()
                .filter(p -> p.getCategory().equals(category))
                .toList();
    }

    @Override
    public Iterable<Prod> findByBrand(String brand) {
        return prodSet.stream()
                .filter(p -> p.getBrand().equals(brand))
                .toList();
    }

    @Override
    public Iterable<Prod> findProductWithExpDate() {
        LocalDate currentDay = LocalDate.now();//текущая дата
        return prodSet.stream()
                .filter(p -> p.getExpDate().isAfter(currentDay))
                .toList();

    }

    @Override
    public int skuQuantity() {
        return prodSet.size();
    }
}
