package streamsTest;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import streams.NumberProcesser;

public class NumberProcesserTest {

    private NumberProcesser numberProcesser = new NumberProcesser();

    @Test
    public void testDoubleOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> doubledOddNumbers = numberProcesser.doubleOddNumbers(numbers);
        List<Integer> expected = Arrays.asList(2, 6, 10, 14, 18);
        assertEquals(expected, doubledOddNumbers);
    }

    @Test
    public void testDoubleOddNumbersWithEmptyList() {
        List<Integer> numbers = Arrays.asList();
        List<Integer> doubledOddNumbers = numberProcesser.doubleOddNumbers(numbers);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, doubledOddNumbers);
    }

    @Test
    public void testDoubleOddNumbersWithAllEvenNumbers() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> doubledOddNumbers = numberProcesser.doubleOddNumbers(numbers);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, doubledOddNumbers);
    }

    @Test
    public void testDoubleOddNumbersWithAllOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> doubledOddNumbers = numberProcesser.doubleOddNumbers(numbers);
        List<Integer> expected = Arrays.asList(2, 6, 10, 14, 18);
        assertEquals(expected, doubledOddNumbers);
    }
}