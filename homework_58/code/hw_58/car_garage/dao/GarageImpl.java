package hw_58.car_garage.dao;

import hw_58.car_garage.model.Car;

import java.awt.*;
import java.util.Arrays;

public class GarageImpl implements Garage {
    private List cars;

//    public Garage(Car[] cars){
//        this.cars = Arrays.asList(cars)
//
//    }
//    public Stream getCarsStream(){
//        return cars.stream();
//    }

    @Override
    public boolean addCar(Car car) {
        return false;
    }

    @Override
    public Car removeCar(String regNumber) {
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return new Car[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
