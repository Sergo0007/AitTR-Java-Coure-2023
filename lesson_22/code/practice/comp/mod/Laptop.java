package practice.comp.mod;

public class Laptop extends Computer {

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

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }




    public String toString() {
        return super.toString() + ", Hours: " + hours + ", Weight: " + weight;
    }
    public boolean equals(Object object){
        if (!(object instanceof Laptop)){
            return false;
        }
        Laptop other = (Laptop) object;
        return super.equals(other) && hours == other.hours && weight == other.weight;
    }


}


