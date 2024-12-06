import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
* Function to general a random list of integers where the size of the list is a parameter
* Function to take a list of integers and return a map where each integer is a key and the number of occurrences for each integer is the value.
* Function to sort a list in ascending order
*/

public class Main{ 

    private static final Random RANDOM = new Random();

    /**
     * Generates a random list of integers.
     *
     * @param size the size of the list 
     * @return a List of randomly generated integer
     */
    public static List<Integer> generateRandomIntegerList(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size must be non-negative");
        }

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integerList.add(RANDOM.nextInt(100)); // Generate random integers between 0-99
        }
        return integerList;
    }

    /**
     * Counts the occurrences of each integer in list.
     *
     * @param integerList the list of integers to count occurrences
     * @return a Map where each integer is a key and its occurrences in the list
     */
    public static Map<Integer, Integer> countOccurrences(List<Integer> integerList) {
        if (integerList == null) {
            throw new IllegalArgumentException("Input list must not be null");
        }

        Map<Integer, Integer> occurrencesMap = new HashMap<>();
        for (Integer number : integerList) {
            occurrencesMap.put(number, occurrencesMap.getOrDefault(number, 0) + 1);
        }
        return occurrencesMap;
    }


    /**
     * The main method to demonstrate the functionality of functions
     *
     * @param args command line arguments 
     */
    public static void main(String[] args) {

        // Generate a list of random integers
        List<Integer> randomList = generateRandomIntegerList(10);
        System.out.println("Random List: " + randomList);

        // Count occurrences of each integer in the list
        Map<Integer, Integer> occurrences = countOccurrences(randomList);
        System.out.println("Occurrences: " + occurrences);
    }
}