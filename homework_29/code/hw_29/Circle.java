package hw_29;

public class Circle extends Shape{

    public Circle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return 3.14 * side * side;
    }

    @Override
    public double calcPerimeter() {
        return 2 * 3.14 * side;
    }
}



