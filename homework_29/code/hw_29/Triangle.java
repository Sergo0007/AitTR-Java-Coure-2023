package hw_29;

public class Triangle extends Shape{
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double s = side * side * Math.sqrt(3) / 4;
        return s;
    }

    @Override
    public double calcPerimeter() {
        return 3 * side;
    }
}
