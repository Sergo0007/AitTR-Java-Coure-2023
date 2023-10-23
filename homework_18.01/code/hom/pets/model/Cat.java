package hom.pets.model;

import hom.pets.model.Pet;

public class Cat extends Pet {
    private String breed;
    private double weight;
    private double height;

    public Cat(int id, String type, int age, String nickName, String breed, double weight, double height) {
        super(id, type, age, nickName);
        this.breed = breed;
        this.weight = weight;
        this.height = height;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return   "Cat : " +
                "id: " + getId() +   // Используем методы геттеры
                ", type: " + getType() +
                ", age: " + getAge() +
                ", nickName: " + getNickName() +
                ",breed: " + breed +
                ", weight: " + weight +
                ", height: " + height;
    }
}






