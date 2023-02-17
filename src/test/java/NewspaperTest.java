import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import ru.library.Newspaper;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class NewspaperTest {

    private Instant date;

    @Test
    public void shouldGetDate() {
        Newspaper newspaper = new Newspaper("bookName", date );
      Instant res = newspaper.getDate();

        Assertions.assertNull(res);
    }
}
