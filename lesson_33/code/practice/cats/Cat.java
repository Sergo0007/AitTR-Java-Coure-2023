package practice.cats;

public class Cat  implements Comparable<Cat>{

    private int id;
    private String name;
    private String breed;
    private int age;
    private double wight;

    //constructor

    public Cat(int id, String name, String breed, int age, double wight) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.wight = wight;
    }
     //get and set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", wight=" + wight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

// этот метод позволает проводить сравнение обьектов этого класса
    // он сравнивает текущий обьект (this) c Cat o
    // и возращает целое число.Если оно > 0,то обьекты меняются местами, в остальных случаях оставляем как есть
    @Override
    public int compareTo(Cat o) {
        int res = this.age - o.age;//сравнили года 2х обьектов -this и o
        return res;
    }
}

