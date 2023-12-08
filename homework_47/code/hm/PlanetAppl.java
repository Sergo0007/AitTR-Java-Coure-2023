package hm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {
    public static void main(String[] args) {
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", 0.39, 0.55, 0));
        planets.add(new Planet("Venus", 0.72, 0.815, 0));
        planets.add(new Planet("Earth", 1.00, 1.000, 1));
        planets.add(new Planet("Mars", 1.52, 0.107, 2));
        planets.add(new Planet("Jupiter", 5.20, 318.000, 70));
        planets.add(new Planet("Saturn", 9.58, 95.000, 83));
        planets.add(new Planet("Uranus", 19.22, 14.500, 27));
        planets.add(new Planet("Neptune", 30.05, 17.000, 14));

        System.out.println("========Planets========");
        for (Planet planet : planets) {
            System.out.println(planet);
        }
        Comparator<Planet> sortByName = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("=============Sorted by name=============");
        planets.sort(sortByName);

        for (Planet planet : planets) {
            System.out.println(planet);
        }
        System.out.println();

        Comparator<Planet> distance = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getDistanceFromSun(), o2.getDistanceFromSun());
            }
        };
        System.out.println("------------Distance to the Sun-------------");
        planets.sort(distance);

        for (Planet planet : planets) {
            System.out.println(planet);
        }
        Comparator<Planet> mass = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Double.compare(o1.getMass(), o2.getMass());
            }
        };
        System.out.println("---------- Mass---------");
        planets.sort(mass);

        for (Planet planet : planets) {
            System.out.println(planet);
        }
        Comparator<Planet> numberOfSatellites = new Comparator<Planet>() {
            @Override
            public int compare(Planet o1, Planet o2) {
                return Integer.compare(o1.getNumberOfSatellites(), o2.getNumberOfSatellites());
            }
        };
        System.out.println("^^^^^^^^^Number of satellites^^^^^^^^^^^");
        planets.sort(numberOfSatellites);

        for (Planet planet : planets) {
            System.out.println(planet);
        }


    }

}
