public class Cube {// Dumplings обьект
    //поле
    private int side;//стороны куба

    //конструктор
    public Cube(int side) {
        this.side = side;
    }
    //методы

    public int calculatePerimeter() {//формула периметра
        return 12 * side;
    }

    public int calculateSurfaceOfArea() {// формула площади
        return 6 * side * side;
    }

    public int calculateVolume() {// формула обьема
        return side * side * side;
    }

    public void display() {
        System.out.println("Perimeter: " + calculatePerimeter() + ", Area: " + calculateSurfaceOfArea() +
                ",Volume: " + calculateVolume());

    }
    public void split(){
        System.out.println("-------------------");
    }
}