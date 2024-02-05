package streamsTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streams.GroupStringsByLength;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupStringsByLengthTest {

    @Test
    public void testGroupByLength() {
        List<String> inputList = Arrays.asList("apple", "orange", "banana", "grape", "kiwi", "pear");
        Map<Integer, List<String>> expectedResult = Map.of(
                5, Arrays.asList("apple", "kiwi"),
                6, Arrays.asList("orange", "banana"),
                4, Arrays.asList("pear", "grape")
        );

        Map<Integer, List<String>> result = GroupStringsByLength.groupByLength(inputList);

    }

    @Test
    public void testGroupByLengthWithEmptyList() {
        List<String> inputList = List.of();
        Map<Integer, List<String>> expectedResult = Map.of();

        Map<Integer, List<String>> result = GroupStringsByLength.groupByLength(inputList);

        assertEquals(expectedResult, result);
    }
}
