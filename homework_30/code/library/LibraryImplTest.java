package library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;
    Book[] book;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(5);
        book = new Book[4];
        book[0] = new Book(978L, "Мирзакаим Норбеков", "Опыт дурака", 2021);
        book[1] = new Book(789L, " Александр Дюма", "Три мушетера", 1989);
        book[2] = new Book(890L, "Виктор Сувовров", "Аквариум", 2000);

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
        Book book2 = new Book(899,"XXX","ZZZ",2222);// создали новую книгу
        assertTrue(library.addBook(book2));// не можем превысить capacity


    }

    @Test
    void removeBook() {

        assertEquals(book[1],library.removeBook(789L));
        assertEquals(2,library.quantity());
        assertNull(library.removeBook(100L));
        assertNull(library.findBook(100L));
    }

    @Test
    void findBook() {

        assertEquals(book[1],library.findBook(789L));

        assertNull(library.findBook(888L));



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

