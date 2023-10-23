package practice.computer.model;

public class Laptop extends Computer1 {

    private double hours;
    private double weight;

    public Laptop(String cpu, int ram, int sdd, String brand, double hours, double weight) {
        super(cpu, ram, sdd, brand);
        this.hours = hours;
        this.weight = weight;
    }

    public double getHours() {
        return hours;
    }

    public double getWeight() {
        return weight;
    }
    //переопределение метода display


//    public void display() {
//        super.display();
//        System.out.print(", Hours: " + hours + ", Weight: " + weight);

    //  }

    public String toString() {
        return super.toString() + ", Hours: " + hours + ", Weight: " + weight;
    }

}


