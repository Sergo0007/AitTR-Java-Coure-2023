public class Count {
    public static void main(String[] args) {
        double productA = 10.0; // цена товара А
        double aDiscountA = 2.5; // скида на товар А
        double productB = 15.0; // цена на товар Б
        double bDiscountB = 1.5; // скидка на товар Б

        double couponDiscount = 5.0; // дополнтильная скидка по купону

        int aCount = 5; // количнство покупок товара А
        int bCount = 3; // количество покупок товара Б

        double aTotalCount = productA * aCount; // вычисление стоимости товаров до скидки
        double bTotalCount = productB * bCount;
        double totalCount = aTotalCount + bTotalCount;// вычесление общей суммы товаров
        System.out.println("Общая сумма за покупки без скидки " + totalCount + " евро");

        double totalDiscount = aTotalCount * aDiscountA / 100 + bTotalCount * bDiscountB / 100;// скидка
        double totalCountDiscount = totalDiscount;
        System.out.println("Сумма покупки со скидкой " + totalCountDiscount + " евро");

        if (totalCountDiscount > 100){
            System.out.println("Если Вы купили на сумму больше ста евро Вам положена скидка " + couponDiscount);
        } else {
            System.out.println("Вы не купили на сумму 100 евро, купите еще что нибудь");
        }


    }
}
