import org.junit.*;

import java.util.List;

public class MainTest {


    @Test
    void testGenerateRandomIntegerList_Size10() {
        // Test with size 10
        List<Integer> randomList = Main.generateRandomIntegerList(10);
        assertNotNull(randomList, "The generated list should not be null");
        assertEquals(10, randomList.size(), "The size of the list should be 10");
    }

    @Test
    void testGenerateRandomIntegerList_Size0() {
        // Test with size 0
        List<Integer> randomList = Main.generateRandomIntegerList(0);
        assertNotNull(randomList, "The generated list should not be null");
        assertEquals(0, randomList.size(), "The size of the list should be 0");
    }

    @Test
    void testGenerateRandomIntegerList_NegativeSize() {
        // Test with negative size
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.generateRandomIntegerList(-1);
        });
        assertEquals("Size must be non-negative", exception.getMessage(), "Expected IllegalArgumentException with specific message");
    }
}
