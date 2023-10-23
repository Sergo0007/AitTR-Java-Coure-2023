package practice.computer.model;

 public class Tablet extends Laptop{

   private String system;

    public Tablet(String cpu, int ram, int sdd, String brand, double hours, double weight, String system) {
       super(cpu, ram, sdd, brand, hours, weight);
        this.system = system;
   }

   public String getSystem() {
       return system;
    }
    public String toString(){
        return super.toString() + ", System: " + system;
    }
}
