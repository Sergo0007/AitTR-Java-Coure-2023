package homwork.archive.dao;
//4

import homwork.archive.model.Documents;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {
    Archive archive;
    LocalDateTime now = LocalDateTime.now();
    Documents[] doc;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(7);
        doc = new Documents[6];
    }

    @Test
    void addDocument() {
    }

    @Test
    void removeDocument() {
    }

    @Test
    void updateDocument() {
    }

    @Test
    void getDocumentFromArchive() {
    }

    @Test
    void getAllDocumentsArchive() {
    }

    @Test
    void getDocumentBetweenDate() {
    }

    @Test
    void size() {
    }
}