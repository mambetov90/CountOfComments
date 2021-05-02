import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestBookLombok {

    BookLombok book = new BookLombok();

    @Before
    public void setUp() {
        book.setAuthor("Mihail Bulgakov");
        book.setBookName("The Master un Margarita");
        book.setGenre("Novel");
        book.setIsbn("2323145");
        book.setYear(1967);
    }

    @Test
    public void bookTest1() {
        assertThat(book.getAuthor()).isEqualTo("Mihail Bulgakov");
        assertThat(book.getBookName()).isEqualTo("The Master un Margarita");
        assertThat(book.getGenre()).isEqualTo("Novel");
        assertThat(book.getIsbn()).isEqualTo("2323145");
        assertThat(book.getYear()).isEqualTo(1967);
    }

    @After
    public void tearDown(){
        book = null; //object is removed

    }
}
