package functional;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapSorterTest {

    @Test
    public void testSortByKeys() {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("banana", 3);
        originalMap.put("apple", 1);
        originalMap.put("orange", 2);

        Map<String, Integer> sortedMap = HashMapSorter.sortByKeys(originalMap);

        LinkedHashMap<String, Integer> expectedSortedMap = new LinkedHashMap<>();
        expectedSortedMap.put("apple", 1);
        expectedSortedMap.put("banana", 3);
        expectedSortedMap.put("orange", 2);

        assertEquals(expectedSortedMap, sortedMap);
    }

    @Test
    public void testSortByValues() {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("banana", 3);
        originalMap.put("apple", 1);
        originalMap.put("orange", 2);

        Map<String, Integer> sortedMap = HashMapSorter.sortByValues(originalMap);

        LinkedHashMap<String, Integer> expectedSortedMap = new LinkedHashMap<>();
        expectedSortedMap.put("apple", 1);
        expectedSortedMap.put("orange", 2);
        expectedSortedMap.put("banana", 3);

        assertEquals(expectedSortedMap, sortedMap);
    }
}
