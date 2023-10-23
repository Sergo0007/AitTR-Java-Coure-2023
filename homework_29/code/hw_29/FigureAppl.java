package hw_29;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] figures = new Shape[4];
        figures[0] = new Circle(3);
        figures[1] = new Circle(2);
        figures[2] = new Triangle(7);
        figures[3] = new Square(9);

        double totalArea = 0;

        double totalPerimeter = 0;


        for (int i = 0; i < figures.length; i++) {
            Shape figure = figures[i];
            totalArea += figure.calcArea();
            totalPerimeter += figure.calcPerimeter();

        }
        System.out.printf("Общая площадь всех фигур: %.2f\n",totalArea);
        System.out.printf("Общий периметр всех фигур: %.2f\n",totalPerimeter);

        double totalCircleArea = 0;
        for (int i = 0; i < figures.length; i++) {
            Shape figure = figures[i];
            if (figure instanceof Circle){
                totalCircleArea  += figure.calcArea();

            }

        }
        System.out.printf("Общая площадь кругов: %.2f\n",totalCircleArea);

        }
    }