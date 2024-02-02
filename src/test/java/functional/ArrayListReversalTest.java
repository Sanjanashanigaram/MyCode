package functional;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class ArrayListReversalTest {

    @Test
    public void testReverseArrayList_Integer() {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);

        ArrayList<Integer> expectedReversed = new ArrayList<>();
        expectedReversed.add(3);
        expectedReversed.add(2);
        expectedReversed.add(1);

        ArrayListReversal.reverseArrayList(originalList);

        assertEquals(expectedReversed, originalList);
    }

    @Test
    public void testReverseArrayList_String() {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("apple");
        originalList.add("banana");
        originalList.add("orange");

        ArrayList<String> expectedReversed = new ArrayList<>();
        expectedReversed.add("orange");
        expectedReversed.add("banana");
        expectedReversed.add("apple");

        ArrayListReversal.reverseArrayList(originalList);

        assertEquals(expectedReversed, originalList);
    }
}
