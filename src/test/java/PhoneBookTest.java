import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    void testAdd() {
        PhoneBook phoneBook = new PhoneBook();

        assertEquals(1, phoneBook.add("Иван", "111"));
    }

    @Test
    void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иван", "111");

        assertEquals("Иван", phoneBook.findByNumber("111"));
    }

    @Test
    void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иван", "111");

        assertEquals("111", phoneBook.findByName("Иван"));
    }
}