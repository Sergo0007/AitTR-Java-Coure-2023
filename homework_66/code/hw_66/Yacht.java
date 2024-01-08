package hw_66;
//          Создать класс «Яхта». В классе должна храниться следующая информация:
//
//          производитель(верфь);
//          год выпуска;
//          длина;
//          материал корпуса (дерево, пластик, металл);
//          стоимость.

public class Yacht {

    private String manufacturer;
    private int yearOfIssue;
    private double length;
    private String material;
    private double price;

    public Yacht(String manufacturer, int yearOfIssue, double length, String material, double price) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.material = material;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public double getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Yacht{" +
                "manufacturer='" + manufacturer + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", length=" + length +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
