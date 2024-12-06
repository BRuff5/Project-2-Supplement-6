import org.junit.*;

import java.util.List;
import java.util.Map;

public class MainTest {
    //Test
    void testExample() {
        List<Integer> list = List.of(1, 2, 3);
        assertNotNull(list, "List should not be null");
        assertEquals(3, list.size(), "List size should be 3");
    }


    private void assertNotNull(List<Integer> list, String list_should_not_be_null) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertEquals(int i, int size, String list_size_should_be_3) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
