import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.library.Book;
import ru.library.SearchOperations;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SearchOperationsTest {

    @Test
    public void shouldGetBookByNameAndAuthor(String name, String author) {
      final List<Book> books = new ArrayList<>();
      Optional<Book> resultbook =  books.stream().filter(
                book -> Objects.equals(book.getName(), name) && Objects.equals(book.getAuthor(), author)
        ).findFirst();

        Optional<Book> resultbook1 =  books.stream().filter(
                book -> Objects.equals(book.getName(), name) && Objects.equals(book.getAuthor(), author)
        ).findAny();

        Assertions.assertNotSame(resultbook,resultbook1);
    }

    @Test
    public void shouldGetBookByName(String name, List<Book> books) {
        Optional<Book> resultbookname =  books.stream().filter(book -> Objects.equals(book.getName(), name)
        ).findFirst();

        Assertions.assertNotNull(resultbookname);
    }

}
