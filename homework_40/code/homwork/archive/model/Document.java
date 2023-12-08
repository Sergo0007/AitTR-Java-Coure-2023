package homwork.archive.model;

import java.time.LocalDateTime;
import java.util.Objects;

//1 создаем класс Документ
public class Document implements Comparable<Document> {
    // fields
    private int archiveId;
    private int documentId;
    private String title;
    private String url;
    private LocalDateTime date;

    //constructor


    public Document(int archiveId, int documentId, String title, String url, LocalDateTime date) {
        this.archiveId = archiveId;
        this.documentId = documentId;
        this.title = title;
        this.url = url;
        this.date = date;
    }
    //getters and setters


    public int getArchiveId() {
        return archiveId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;

    }

    @Override
    public String toString() {
        return "Documents{" +
                "archiveId=" + archiveId +
                ", documentId=" + documentId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document documents = (Document) o;
        return archiveId == documents.archiveId && documentId == documents.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(archiveId, documentId);
    }

    @Override
    public int compareTo(Document o) {
        //надо определить как сортировать обьекты в массиве по двум полям archiveId, documentId
        int res = Integer.compare(archiveId, o.archiveId);
        return res != 0 ? res : Integer.compare(documentId, o.documentId);

    }
}




