package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {
    //field class
    private Car[] cars; // массив для объектов типа Car
    private int size; // текущее кол-во автомобилей в массиве

    // конструктор
    public GarageImpl(int capacity) {
        cars = new Car[capacity];
        this.size = 0;
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car; // добавляем в массив car в конец массива (первая свободная позиция)
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                Car temp = cars[i];
                cars[i] = cars[--size]; // ставим на место удаляемого элемента ставим последнй из массива
                cars[size] = null;//затираем последний элемент в массиве
                return temp;

            }
        }
        return null;
    }



    @Override
    public Car findCarByRegNumber(String regNumber) {
        //пробегаем по массиву ищем по условиям элемент массива
        for (int i = 0; i < size; i++) {
            if(cars[i].getRegNumber().equals(regNumber)){
                return cars[i];
            }


        }
        return null;
    }
    // Шаг 1 - подсчет кол-ва рез-ов count
    // Шаг 2 - создаем массив длиной count
    // Шаг 3 - заполняем этот массив результатами поиска/отбора по критерию
    // Для отбора элементов будем использовать интерфейс Predicate


    @Override
    public Car[] findCarsByModel(String model) {
        return findCarByPredicate(c -> model.equals(c.getModel()));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return  findCarByPredicate(c -> company.equals(c.getCompany()));
    }

    @Override
        public Car[] findCarsByEngine ( double min, double max){
            return findCarByPredicate(c -> c.getEngine() >= min && c.getEngine() <= max);
        }

        @Override
        public Car[] findCarsByColor (String color){
            return findCarByPredicate(c -> color.equals(c.getColor()));

        }
        public int size(){
        return size;
        }

        private Car[] findCarByPredicate (Predicate < Car > predicate) {
            int count = 0;
            for (int i = 0; i < size; i++) {//обегаем массив
                if (predicate.test(cars[i])) {//проверяем все элементы на тест в предикате
                    count++;
                }

            }
            Car[] res = new Car[count];
            //fill array
            for (int i = 0, j = 0; j < res.length; i++) {
                if (predicate.test(cars[i])) {
                    res[j] = cars[i];
                    j++;
                }

            }
            return res;

        }
        public static void printCars(Car[] cars){
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);

            }
        }
    }


