import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.library.Category;

public class CategoryTest {

    @Test
    public void shouldGetName(){
        final Category category = new Category("categoryName");
        String res = category.getName();

        Assertions.assertFalse(Boolean.parseBoolean(res = null));
    }
}
