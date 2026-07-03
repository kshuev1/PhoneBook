import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

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

    @Test
    void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Сергей", "333");
        phoneBook.add("Анна", "111");
        phoneBook.add("Борис", "222");

        assertIterableEquals(
                List.of("Анна", "Борис", "Сергей"),
                phoneBook.printAllNames()
        );
    }
}