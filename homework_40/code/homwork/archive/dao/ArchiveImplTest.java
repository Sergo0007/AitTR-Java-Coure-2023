package homwork.archive.dao;
//4

import homwork.archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static homwork.archive.dao.ArchiveImpl.comparator;
import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {
    Archive archive;
    LocalDateTime now = LocalDateTime.now();
    Document[] doc;

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(7);
        doc = new Document[6];
        doc[0] = new Document(1,1,"t1","url1",now.minusDays(7));
        doc[1] = new Document(1,2,"t2","url1",now.minusDays(7));
        doc[2] = new Document(1,3,"t3","url1",now.minusDays(5));
        doc[3] = new Document(2,1,"t1","url1",now.minusDays(7));
        doc[4] = new Document(2,2,"t2","url1",now.minusDays(7));
        doc[5] = new Document(2,3,"t3","url1",now.minusDays(7));

        for (int i = 0; i < doc.length; i++) {
            archive.addDocument(doc[i]);

        }
    }

    @Test
    void addDocument() {
        //нельзя добавить null
         assertFalse(archive.addDocument(null));
        //нельзя добавить имеющееся
        assertFalse(archive.addDocument(doc[1]));
        //проверить возможность добавления
        Document documents = new Document(3,1,"t","url",now);
        assertTrue(archive.addDocument(documents));
        //проверить ожидаемое количество после добавления
        assertEquals(7,archive.size());
        //нельзя превысить capacity
        documents = new Document(3,2,"t","url",now);
        assertFalse(archive.addDocument(documents));

    }

    @Test
    void removeDocument() {
        //удаление документа в наличии
        assertTrue(archive.removeDocument(3,1));//удалили doc[0]
        //удаление документа которого нет
        assertFalse(archive.removeDocument(5,5));///нет в наличии
        //проверка количества
        assertEquals(5,archive.size());
        assertNull(archive.getDocumentFromArchive(3,1));

    }

    @Test
    void updateDocument() {
        assertTrue(archive.updateDocument(1,1,"newUrl"));//обновили url
        assertEquals("newUrl",archive.getDocumentFromArchive(1,1).getUrl());//проверка обновления

    }

    @Test
    void getDocumentFromArchive() {
        assertEquals(doc[0],archive.getDocumentFromArchive(1,1));//проверка нахождение документа в архиве
        assertNull(archive.getDocumentFromArchive(1,3));//проверка на наличие несуществующего дока
    }

    @Test
    void getAllDocumentsArchive() {
        //метод возвращения массива документа
        Document[] expected = {doc[3],doc[4],doc[5]};//документы из второго архива
        Document[] actual = archive.getAllDocumentsArchive(2);//выбрали второй архив
        Arrays.sort(actual);//сортируем массив
        assertArrayEquals(expected,actual);
    }

    @Test
    void getDocumentBetweenDate() {
        LocalDate ld = now.toLocalDate(); // оставляем только дату, убираем время
        Document[] actual = archive.getDocumentBetweenDate(ld.minusDays(6),ld.minusDays(1));
        Arrays.sort(actual); // сортируем массив
        Document[] expected = {doc[0],doc[1],doc[2]};
        assertArrayEquals(expected,actual);
    }
    @Test
    void sizeTest() {
        assertEquals(6, archive.size());
    }
}