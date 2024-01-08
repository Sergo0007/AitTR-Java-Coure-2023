package train;

import java.util.Objects;

public class Titanik {
    double fare;
    int pClass;
    boolean isSurvived;
    boolean isFemale;
    double age;

    public Titanik(double fare, int pClass, boolean isSurvived, boolean isFemale, double age) {
        this.fare = fare;
        this.pClass = pClass;
        this.isSurvived = isSurvived;
        this.isFemale = isFemale;
        this.age = age;
    }

    public double getFare() {
        return fare;
    }

    public int getpClass() {
        return pClass;
    }

    public boolean isSurvived() {
        return isSurvived;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public double getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Titanik titanik = (Titanik) o;
        return Double.compare(titanik.fare, fare) == 0 && pClass == titanik.pClass && isSurvived == titanik.isSurvived && isFemale == titanik.isFemale && age == titanik.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fare, pClass, isSurvived, isFemale, age);
    }

    @Override
    public String toString() {
        return "Titanik{" +
                "fare=" + fare +
                ", pClass=" + pClass +
                ", isSurvived=" + isSurvived +
                ", isFemale=" + isFemale +
                ", age=" + age +
                '}';
    }
}
