package streamsTest;

import org.junit.jupiter.api.Test;
import streams.StringManipulation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringManipulationTest {

    @Test
    public void testCapitalizeAndSort() {
        String[] inputArray = {"apple", "orange", "banana", "grape"};
        String[] expectedResult = {"Apple", "Banana", "Grape", "Orange"};

        String[] result = StringManipulation.capitalizeAndSort(inputArray);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testCapitalizeAndSortWithEmptyArray() {
        String[] inputArray = {};
        String[] expectedResult = {};

        String[] result = StringManipulation.capitalizeAndSort(inputArray);

        assertArrayEquals(expectedResult, result);
    }
}

