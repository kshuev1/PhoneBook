import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    void testAdd() {
        PhoneBook phoneBook = new PhoneBook();

        assertEquals(1, phoneBook.add("Иван", "111"));
    }
}