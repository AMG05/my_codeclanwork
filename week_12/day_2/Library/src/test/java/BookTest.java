import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {


        private Library library;
        private Book book;

        @Before
        public void before(){
            book = new Book("Rebecca", "Jill","Drama");
        }

        @Test
        public void bookHasATitle(){
            assertEquals("Rebecca", book.getTitle());
        }


}
