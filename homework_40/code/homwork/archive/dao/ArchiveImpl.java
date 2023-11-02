package homwork.archive.dao;

import homwork.archive.model.Documents;

import java.time.LocalDate;
import java.util.Comparator;

//часть 3
public class ArchiveImpl implements Archive {

    static Comparator<Documents> comparator = (d1, d2) -> {
        int res = d1.getDate().compareTo(d2.getDate());//date field
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());//documentId field

    };
    //fields
    private Documents[] documents;
    private int size;

    public ArchiveImpl(int capacity) {
        documents = new Documents[capacity];
    }


    @Override
    public boolean addDocument(Documents documents) {
        return false;
    }

    @Override
    public boolean removeDocument(int documentId, int archiveId) {
        return false;
    }

    @Override
    public boolean updateDocument(int documentId, int archiveId, String url) {
        return false;
    }

    @Override
    public Documents getDocumentFromArchive(int documentId, int archiveId) {
        return null;
    }

    @Override
    public Documents[] getAllDocumentsArchive(int archiveId) {
        return new Documents[0];
    }

    @Override
    public Documents[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Documents[0];
    }

    @Override
    public int size() {
        return 0;
    }

}

