package hw_60.shipment;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
/*
Box представляет коробку и реализует интерфейс Iterable<Parcel>, что позволяет итерироваться по посылкам в
 коробке. Имеет поле parcels - список посылок в коробке.
В конструкторе устанавливается список посылок, и реализуется метод iterator для итерации по посылкам.
 */

public class Box implements Iterable<Parcel> {
    List<Parcel> parcels;

    public Box(List<Parcel> parcels) {
        this.parcels = parcels;
    }

    @Override
    public Iterator<Parcel> iterator() {
        return parcels.iterator();
    }


}
