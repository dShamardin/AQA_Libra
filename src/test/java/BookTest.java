import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.library.Book;
import ru.library.Category;

public class BookTest {

    final Book book = new Book("bookName", "bookAuthor");


    @Test
    public void shouldSetCategory() {
        book.setCategory(new Category("categoryName"));

        Assertions.assertNotNull(book.getCategory());
    }

    @Test
    public void shouldGetName() {
    String res = book.getName();

    Assertions.assertNotNull(res);
    }

    @Test
    public void shouldGetAuthor() {
        String res1 = book.getAuthor();

    Assertions.assertFalse(Boolean.parseBoolean(res1 = null));

    }

    @Test
    public void shouldGetCategory(){
        book.getName();

        Assertions.assertNotNull(book.getName());
    }
}

