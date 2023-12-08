package hw_60.shipment;

import java.util.Iterator;
import java.util.List;
/*
Container представляет контейнер и также реализует интерфейс Iterable<Box>.
Имеет поля label - маркировка контейнера и boxes - список коробок в контейнере.
В конструкторе устанавливаются маркировка и список коробок, и реализуется метод iterator для итерации по коробкам.
 */

public class Container implements Iterable<Box> {
    String label;
    List<Box> boxes;

    public Container(String label, List<Box> boxes) {
        this.label = label;
        this.boxes = boxes;
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}
