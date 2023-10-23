package hw_29;

//Задача 2.
//
//        Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
//        Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//        Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга, один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.
//        Задача 3. Рассчитайте общую площадь кругов из задачи 2.

abstract class Shape {
    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();
}
