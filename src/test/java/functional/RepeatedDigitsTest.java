package functional;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
public class RepeatedDigitsTest {

    @Test
    public void testFindRepeatedDigits() {
        assertNotEquals(Set.of(2, 3), RepeatedDigits.findRepeatedDigits(123312));
        assertEquals(Set.of(1, 5), RepeatedDigits.findRepeatedDigits(151235));
        assertEquals(Set.of(), RepeatedDigits.findRepeatedDigits(12345));
        assertEquals(Set.of(1, 9), RepeatedDigits.findRepeatedDigits(199199));
    }
}

