package homwork.archive.dao;
//часть 2

import homwork.archive.model.Documents;

import java.time.LocalDate;

public interface Archive {

    boolean addDocument(Documents documents);

    boolean removeDocument(int documentId, int archiveId);

    boolean updateDocument(int documentId, int archiveId, String url);

    Documents getDocumentFromArchive(int documentId, int archiveId);

    Documents[] getAllDocumentsArchive(int archiveId);

    Documents[] getDocumentBetweenDate(LocalDate dateFrom, LocalDate dateTo);

    int size();//quantity of documents in all archive

}
