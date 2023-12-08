package m_book.library;

//3.Создаем класс LibraryImpl для реализации интерфейса Library
public class LibraryImpl implements Library {

    Book[] books;//fields
    int size;

    public LibraryImpl(int capacity) {
        books = new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        //не добавляем null,не превышаем capacity,не добавляем существующий элемент
        if (book == null || size == books.length || findBook(book.getAuthor()) != null) {
            return false;
        }
        books[size] = book;//новая книга
        size++;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book victim = books[i];
                books[i] = books[size - 1];//на место найденной поставили последнюю существ. в массиве
                books[size - 1] = null;// обнулили последнюю
                size--;
                return victim;


            }
        }
        return null;


    }

    @Override
    public Book findBook(String author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {// нашелся элемент массива, у которого совпал isbn
                return books[i];// вернули найденный элемент массива типа Book
            }
        }

        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }

    }
}






