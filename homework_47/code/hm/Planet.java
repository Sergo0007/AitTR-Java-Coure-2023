package hm;

import java.util.Objects;

public class Planet {
    //fields
    private String name;
    private double distanceFromSun;
    private double mass;
    private int numberOfSatellites;

    //constructor
    public Planet(String name, double distanceFromSun, double mass, int numberOfSatellites) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Double.compare(planet.distanceFromSun, distanceFromSun) == 0 && Double.compare(planet.mass, mass) == 0 && numberOfSatellites == planet.numberOfSatellites && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceFromSun, mass, numberOfSatellites);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                ", mass=" + mass +
                ", numberOfSatellites=" + numberOfSatellites +
                '}';
    }
}
