package practice.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.supermarket.dao.Supermarket;
import practice.supermarket.dao.SupermarketImpl;
import practice.supermarket.model.Product;

import java.time.LocalDate;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {
    Supermarket supermarket;
    LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl();

        supermarket.addProduct(new Product(12345,"A","Upi","ABS",3.3,now.minusDays(6)));
        supermarket.addProduct(new Product(343434,"B","Epi","UTS",4.4,now.minusDays(4)));
        supermarket.addProduct(new Product(767899,"C","Lopi","YTS",5.5,now.minusDays(7)));

    }

    @Test
    void addProduct() {
        assertFalse(supermarket.addProduct(null));
        Product product3 = new Product(222222,"D","ZTE","ESP",7.9,now.minusDays(3));
        assertTrue(supermarket.addProduct(product3));//добавили новый продукт
        assertFalse(supermarket.addProduct(product3));//

    }

    @Test
    void removeProduct() {
        Product product = supermarket.removeProduct(12345);
        assertNotNull(product);
        product = supermarket.removeProduct(777777);
        assertNull(product);



    }

    @Test
    void findBayBarcode() {
        Product product = supermarket.findBayBarcode(343434);
        assertEquals(343434,product.getBarCode());
    }

    @Test
    void findByCategory() {
        Iterable<Product> b = supermarket.findByCategory("B");
        for (Product product : b){
            assertEquals("B",product.getCategory());
        }
    }

    @Test
    void findByBrand() {
        Iterable<Product> a = supermarket.findByBrand("OOO");
        for (Product product : a){
            assertEquals("IBS",product.getBrand());
        }
    }

    @Test
    void findProductWithExpireDate() {
        Iterable<Product> e = supermarket.findProductWithExpireDate();
        for (Product product : e){
            assertTrue(product.getDate().isBefore(LocalDate.now()));
        }
    }

    @Test
    void skuQuantity() {
        assertEquals(3,supermarket.skuQuantity());
    }

    @Test
    void iterator() {
        Iterator<Product>iterator = supermarket.iterator();
        assertTrue(iterator.hasNext());
    }
}