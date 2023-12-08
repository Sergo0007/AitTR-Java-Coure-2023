package m_book.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] book;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(6);
        book = new Book[5];
        book[0] = new Book(978L, "Мирзакарим Норбеков", "Опыт дурака", 2021);
        book[1] = new Book(999L,"Мирзакарим Норбеков","Как стать миллионером",1999);
        book[2] = new Book(789L, " Александр Дюма", "Три мушкетера", 1989);
        book[3] = new Book(890L, "Виктор Суворов", "Аквариум", 2000);

        //добавим элементы массива в company
        for (int i = 0; i < book.length; i++) {
            library.addBook(book[i]);
        }
    }
    @Test
    void addBook() {
        // не можем добавить null
        assertFalse(library.addBook(null));
        // не можем добавить второй раз, уже существующую книгу
        assertFalse(library.addBook(book[1]));
        Book book1 = new Book(100L,"Barry Burd","Java 7", 2014);// создали новую книгу
        assertTrue(library.addBook(book1));// добавили новую книгу
        assertEquals(4,library.quantity());// теперь в библиотеке  книг
        // создаем еще одну новую книгу
        Book book2 = new Book(899L,"XXX","ZZZ",2222);// создали новую книгу
        assertTrue(library.addBook(book2));// не можем превысить



    }

    @Test
    void removeBook() {

        assertEquals(book[3],library.removeBook(890L));
        assertEquals(2,library.quantity());
        assertNull(library.removeBook(100L));
        assertNull(library.findBook("XXX"));
    }

    @Test
    void findBook() {
        assertEquals(book[0],library.findBook( "Мирзакарим Норбеков"));
        assertNull(library.findBook("xxx"));







    }

    @Test
    void quantity() {
        assertEquals(3,library.quantity());

    }

    @Test
    void printBook() {
        library.printBook();
    }
}

