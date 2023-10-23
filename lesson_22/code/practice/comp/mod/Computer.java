package practice.comp.mod;

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
        return "Brand: " + brand + ", CPU: " + cpu + ", RAM " + ram + ", SDD: " + sdd;
    }
    public boolean equals(Object object){
        if (!(object instanceof Computer)){
            return false;
        }
        Computer other = (Computer) object;
        return cpu.equals(other.cpu) && ram == other.ram && sdd == other.sdd && brand.equals(other.brand);
//         (всеpublic boolean equals(Object object) {: Это объявление метода equals. Метод принимает один аргумент типа Object, так как он переопределен из класса Object. Он возвращает boolean, указывая, равны ли объекты или нет.
//
//                    if (!(object instanceof Computer)) {: Эта строка проверяет, является ли переданный объект (object) экземпляром класса Computer. Если нет, то метод возвращает false, потому что объекты разных классов не могут быть равными.
//
//                        Computer other = (Computer) object;: Здесь выполняется приведение типа (cast) объекта object к типу Computer, так как мы уже проверили, что object является экземпляром Computer.
//
//                        return cpu.equals(other.cpu) && ram == other.ram && sdd == other.sdd && brand.equals(other.brand);: Эта строка сравнивает различные характеристики текущего объекта (this) с характеристиками объекта other.
//
//                        cpu.equals(other.cpu) сравнивает процессоры на равенство, используя метод equals() для сравнения строк (предполагается, что cpu - это строка).
//                                ram == other.ram сравнивает объем оперативной памяти (ram) на равенство. В данном случае, сравнение происходит по значению (сравниваются целые числа).
//                                sdd == other.sdd сравнивает объем SSD (sdd) на равенство по значению (целые числа).
//                        brand.equals(other.brand) сравнивает бренды (brand) на равенство, используя метод equals() для сравнения строк.
//                                Если все эти условия выполняются характеристики объектов совпадают), то метод возвращает true, указывая, что объекты равны. В противном случае, он возвращает false.
    }
}
