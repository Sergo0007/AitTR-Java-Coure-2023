package practice.comp.mod;

public class Smartphone extends Laptop {
    private long imei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double hours, double weight, long imei) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.imei = imei;
    }

    public long getImei() {
        return imei;
    }

    public String toString() {
        return super.toString() + ", IMEI: " + imei;
    }

    @Override
    public boolean equals(Object obejct) {
        if (!(obejct instanceof Smartphone)){
            return false;
        }
        Smartphone other = (Smartphone) obejct;
        return imei == other.imei;

    }


    }
