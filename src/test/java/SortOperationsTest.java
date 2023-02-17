import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.library.Book;
import ru.library.Newspaper;
import ru.library.SortOperations;

import java.util.*;


public class SortOperationsTest {

    @Test
    public void shouldCheckIfBookHasCategory() {
        Book book = new Book("bookName", "bookAuthor");
        String checkbook = String.valueOf(book.getCategory());

        Assertions.assertNotNull(checkbook);
    }


  //  public void shouldGetBooksCategories(List<Book> books) {
      // Book book = new Book("bookName", "bookAuthor");
   //     final Set<Category> categories = new HashSet<>();

    //    String bookcategory =books.forEach(book->{}); categories.add(book.getCategory()

     //   Assertions.assertNotNull(bookcategory);


    @Test
    public void shouldSortNewspapersByDate() {



    }


}


