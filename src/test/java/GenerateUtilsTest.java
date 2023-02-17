import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.library.Book;
import ru.library.GenerateUtils;
import ru.library.Newspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static ru.library.GenerateUtils.faker;


public class GenerateUtilsTest {


    @Test
    public void shouldDGenerateSomeBooks() {
        final List<Book> books = new ArrayList<>();
       String res = String.valueOf(books.add(new Book(faker.book().title(), faker.book().author())));

        Assertions.assertNotNull(res);

    }

    @Test
    public void shouldGenerateSomeNewsPapers() {
        final List<Newspaper> newsPapers = new ArrayList<>();
        String res1 =String.valueOf(newsPapers.add(new Newspaper(faker.book().title(), faker.date().past(20,
                TimeUnit.DAYS).toInstant())));

        Assertions.assertNull(res1=null);
    }

}
