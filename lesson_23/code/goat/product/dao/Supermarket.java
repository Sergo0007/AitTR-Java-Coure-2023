package goat.product.dao;

import goat.product.model.Product;

public class Supermarket {
    private Product[] products;//массив типа Product
    private int quantity;//текущее количество продуктов в массиве (на складе)

    public Supermarket(int capacity) {
        products = new Product[capacity];//создаем новый обькет

    }

    public boolean addProduct(Product product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {

            return false;
        }
        products[quantity] = product;//добавляем в конец массива
        quantity++;
        return true;
    }


    public Product findProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {

                return products[i];
            }

        }
        return null;


    }

    public Product updateProduct(long barcode, double price) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
            products[i].setPrice(price);
            return products[i];

        }


    }
     return null;
}

    public boolean deleteProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode){
                products[i] = null;
                for (int j = 0; j < products.length - 1; j++) {
                    products[j] = products[j + 1];

                }
                quantity--;
                products[products.length - 1] = null;
                return true;


            }

        }

        //TODO remove Product
        // найти продукт в массиве по его баркоду и удалить элемент массива:
        // пусть удаляемый продукт стоит на i-м индексе, тогда все элементы массива надо сдвинуть с места i + 1 на
        // 1 позицию влево, последний элемент присвоить null, длину массива уменьшить на 1.
        return false;
        /*  решение задачи группы 34.1.public boolean removeProduct(long barCode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barCode) {
                products[i] = products[quantity - 1];
                products[quantity - 1] = null;
                quantity--;
                return true;
            }
        }
        return false; */
    }

    public void printAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }else {
                System.out.println("Sorry, the product is temporality missing ");

            }
        }
    }

    public int getQuantity() {
        return quantity;
    }
}