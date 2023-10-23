public class Pet {

    //Задача 1. Создать класс Pet (Домашнее животное) с приватными полями:

    //поля
    private int id;
    private String type;
    private int age;
    private String nickName;

    //конструктор класса Pet

    public Pet(int id, String type, int age, String nickName) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.nickName = nickName;
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {

    }

    public void display() {
        System.out.println(" ID: " + id + " Type: " + type + " Age: " + age + " NickName: " + nickName);

    }

    public void swimm() {
        System.out.println(" I swim,я плаваю ");
    }

    public void crawl() {
        System.out.println(" I crawling,я ползаю ");
    }

    public void reaction() {
        System.out.println(" I'm quick ,у меня быстрая реакция ");
    }

    public void hunter() {
        System.out.println(" I'm hunting,я охочусь ");
    }
}



