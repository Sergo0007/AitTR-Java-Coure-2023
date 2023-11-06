package homwork.archive.dao;

import homwork.archive.model.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

//часть 3
public class ArchiveImpl implements Archive {

    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getDate().compareTo(d2.getDate());//date field
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());//documentId field

    };
    //fields
    private Document[] documents;
    private int size;

    public ArchiveImpl(int capacity) {
        documents = new Document[capacity];
    }


    @Override
    public boolean addDocument(Document document) {
        if (document == null || size == documents.length || getDocumentFromArchive(document.getDocumentId(), document.getArchiveId()) != null) {
            return false;
        }
        //ищем индекс куда вставить
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        //обработка индекса
        index = index >= 0 ? index : -index - 1;
        //раздвигаем массив с индекса на 1 место вправо
        System.arraycopy(documents, index, documents, index + 1, size - index);
        documents[index] = document;
        size++;
        return true;
    }

    @Override
    public boolean removeDocument(int documentId, int archiveId) {
        //ищем документ
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId && documents[i].getArchiveId() == archiveId) {
                //надвигаем массив на найденную позицию i удаляемого фото
                System.arraycopy(documents, i + 1, documents, i, size - 1 - i);
                documents[--size] = null;
                // size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateDocument(int documentId, int archiveId, String url) {
        Document document = getDocumentFromArchive(documentId, archiveId);//нашли документ
        if (document == null) {
            return false;
        }
        document.setUrl(url); // обновили url
        return true;
    }

    @Override
    public Document getDocumentFromArchive(int documentId, int archiveId) {
        Document pattern = new Document(archiveId, documentId, null, null, null);//определили тот обьект с которым сравниваем
        for (int i = 0; i < size; i++) {
            if (pattern.equals(documents[i])) {
                return documents[i];
            }

        }
        return null;
    }

    @Override
    public Document[] getAllDocumentsArchive(int archiveId) {
        return findByPredicate(d -> d.getArchiveId() == archiveId);
    }

    private Document[] findByPredicate(Predicate<Document> predicate) {
        Document[] res = new Document[size];
        int j = 0;//cчетчик найденных документов
        for (int i = 0; i < size; i++) {
            if (predicate.test(documents[i])) {
                res[j] = documents[i];
                j++;
            }
        }
        //заполнили массив, но в нем после j идут null
        return Arrays.copyOf(res, j);//вернули обрезанный массив без элементов null
    }

    @Override
    public Document[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Document pattern = new Document(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());//вводим объектную переменную
        int from = -Arrays.binarySearch(documents,0,size,pattern,comparator) -1;//находим индекс начального документа(левый край)
        // from = from >= 0 ? from : -from -1;
        pattern = new Document(0,Integer.MAX_VALUE,null,null, LocalDateTime.of(dateTo, LocalTime.MAX));//находим индекс конечного документа (правый край)
        int to = -Arrays.binarySearch(documents,0,size,pattern,comparator) -1;
       // to = to >= 0 ? to : to -1;
        return Arrays.copyOfRange(documents,from,to);//Range диапазон создаем новый массив с нужным документом
    }

    @Override
    public int size() {
        return size;
    }

}

