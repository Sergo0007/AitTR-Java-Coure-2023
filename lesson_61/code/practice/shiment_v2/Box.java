package practice.shiment_v2;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Box implements Iterable<Parcel>{//перебираем посылки в ящике
    List<Parcel> parcelLs;

    public Box(int numParcels){
        Random random = new Random();
        this.parcelLs = Stream.generate(() -> new Parcel(random.nextDouble(0,2)))
                .limit(numParcels)
                .collect(Collectors.toList());
    }

//    public Box() {
//        parcelLis = new ArrayList<>();
//    }

//    public Box(List<Parcel> parcelLs){
//        this.parcelLs =new ArrayList<>();
//    }
//    public List<Parcel>getParcelLs(){
//        return parcelLs;
//    }

//    public void setParcelList(List<Parcel> parcelLs) {
//        this.parcelLs = parcelLs;
//    }
    // в коробку надо будет добавить задуманное число посылок
    // этот метод добавляет посылку в список посылок
    public boolean addParcel(Parcel parcel){
        return parcelLs.add(new Parcel(2));//добавляем посылку в бокс
    }

    public int quantity(){
        return parcelLs.size();
    }
    // вес коробки = сумме весов всех посылок
    public double weightBox(){
        return parcelLs.stream()
                .mapToDouble(p -> p.getWeight())
                .sum();
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcelLs.iterator();
    }
}
