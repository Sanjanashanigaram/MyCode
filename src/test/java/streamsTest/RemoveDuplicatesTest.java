package streamsTest;

import org.junit.jupiter.api.Test;
import streams.RemoveDuplicates;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicatesWithDuplicates() {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 3, 2, 5, 6, 6, 7);
        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testRemoveDuplicatesWithoutDuplicates() {
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> expectedResult = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> inputList = List.of();
        List<Integer> expectedResult = List.of();

        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        assertEquals(expectedResult, result);
    }
}
