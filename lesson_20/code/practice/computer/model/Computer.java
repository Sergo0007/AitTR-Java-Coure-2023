package practice.computer.model;

public class Computer {

    private String cpu;
    private int ram;
    private int sdd;
    private String brand;

    public Computer(String cpu, int ram, int sdd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.sdd = sdd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSdd() {
        return sdd;
    }

    public void setSdd(int sdd) {
        this.sdd = sdd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    public void display() {
//        System.out.print("Brand: " + brand + ", CPU: " + cpu + ", RAM " + ", SDD: " + sdd);
  //  }
    public String toString(){
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM " + ", SDD: " + sdd;
    }
}
