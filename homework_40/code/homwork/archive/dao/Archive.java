package homwork.archive.dao;
//часть 2

import homwork.archive.model.Document;

import java.time.LocalDate;

public interface Archive {

    boolean addDocument(Document documents);

    boolean removeDocument(int documentId, int archiveId);

    boolean updateDocument(int documentId, int archiveId, String url);

    Document getDocumentFromArchive(int documentId, int archiveId);

    Document[] getAllDocumentsArchive(int archiveId);

    Document[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo);

    int size();//quantity of documents in all archive

}
