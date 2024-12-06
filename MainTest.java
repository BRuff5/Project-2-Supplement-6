import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.*;

public class MainTest {

    //Test
    public void testGenerateRandomIntegerList() {
        int size = 10;
        List<Integer> randomList = Main.generateRandomIntegerList(size);
        
        // Check the size of the generated list
        assertEquals(size, randomList.size(), "The size of the list should match the input size.");
        
        // Check if all elements are within the range 0-99
        for (Integer number : randomList) {
            assertTrue(number >= 0 && number < 100, "All numbers should be between 0 and 99.");
        }
    }

    //Test
    public void testCountOccurrences() {
        List<Integer> testList = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        Map<Integer, Integer> expectedOccurrences = new HashMap<>();
        expectedOccurrences.put(1, 1);
        expectedOccurrences.put(2, 2);
        expectedOccurrences.put(3, 3);
        expectedOccurrences.put(4, 4);
        
        Map<Integer, Integer> actualOccurrences = Main.countOccurrences(testList);
        
        assertEquals(expectedOccurrences, actualOccurrences, "The occurrences map should match the expected result.");
    }

    //Test
    public void testSortIntegerList() {
        List<Integer> unsortedList = Arrays.asList(5, 3, 8, 1, 2);
        List<Integer> expectedSortedList = Arrays.asList(1, 2, 3, 5, 8);
        
        List<Integer> actualSortedList = Main.sortIntegerList(unsortedList);
        
        assertEquals(expectedSortedList, actualSortedList, "The sorted list should match the expected result.");
    }

    //Test
    public void testGenerateRandomIntegerListWithZeroSize() {
        List<Integer> randomList = Main.generateRandomIntegerList(0);
        
        // Check that the generated list is empty
        assertTrue(randomList.isEmpty(), "The list should be empty when the input size is zero.");
    }

    //Test
    public void testCountOccurrencesWithEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        Map<Integer, Integer> expectedOccurrences = new HashMap<>();
        
        Map<Integer, Integer> actualOccurrences = Main.countOccurrences(emptyList);
        
        assertEquals(expectedOccurrences, actualOccurrences, "The occurrences map should be empty for an empty input list.");
    }

    //Test
    public void testSortIntegerListWithEmptyList() {
        List<Integer> emptyList = Arrays.asList();
        List<Integer> sortedList = Main.sortIntegerList(emptyList);
        
        assertTrue(sortedList.isEmpty(), "The sorted list should be empty when the input list is empty.");
    }
    

    private void assertEquals(int size, int size0, String the_size_of_the_list_should_match_the_inp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertTrue(boolean b, String all_numbers_should_be_between_0_and_99) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertEquals(Map<Integer, Integer> expectedOccurrences, Map<Integer, Integer> actualOccurrences, String the_occurrences_map_should_match_the_expe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertEquals(List<Integer> expectedSortedList, List<Integer> actualSortedList, String the_sorted_list_should_match_the_expected) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
