package hom.pets.model;

public class Pet {
    private int id;
    private String type;
    private int age;
    private String nickName;


    public Pet(int id, String type, int age, String nickName) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.nickName = nickName;
    }

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
        this.nickName = nickName;
    }


    public void hunter() {
        System.out.println("Когда все спят я охочусь");
    }

    public void game() {
        System.out.println("Я молод и люблю играть");
    }

    public void sleep() {
        System.out.println("Кода все просыпаются я иду спать");
    }

    public void voice() {
        System.out.println();
    }

    public String toString() {
        return "Pet: " +
                "id: " + id +
                ", type: " + type +
                ", age: " + age +
                ", nickName: " + nickName;
    }

}






