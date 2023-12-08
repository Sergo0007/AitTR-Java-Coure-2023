package m_book.library;
//2.Создаем интерфейс Library с методами

public interface Library {
    boolean addBook(Book book);
    Book removeBook(long isbn);
    Book findBook(String author);
    int quantity();
    void printBook();



}


