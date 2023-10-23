public class Mat {
    public static void main(String[] args) {
        int square = squareArea(5); // формула
        int rectangle = rectangleArea(4, 7);
        double pi = pi();
        double circle = circleArea(pi, 8);
        printSquareArea(square);
        printRectangleArea(rectangle);


        double square1 = squareArea(5.0);
        double rectangle1 = rectangleArea(4.0, 5.0);
        System.out.println("Area of your square: = " + square1);
        System.out.println("Area of your rectangle: = " + rectangle1);
        System.out.println("Area of your circle: = " + circle);

    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int rectangleArea(int length, int width) {
        return length * width;


    }

    public static double pi() {
        return 3.1415926;
    }

    public static double circleArea(double pi, double radius) {
        return pi * radius * radius;
    }


    public static void printSquareArea(int square) {
        System.out.println("Square area = " + square);

    }

    public static void printRectangleArea(int rectangle) {
        System.out.println("Rectangle area = " + rectangle);

        System.out.println();
        System.out.println("------var2-----");
    }

    public static double squareArea(double side) {
        return side * side;

    }

    public static double rectangleArea(double length, double width) {
        return length * width;

    }
}