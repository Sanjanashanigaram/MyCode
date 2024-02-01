package functional;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringRotationCheckerTest {

    @Test
    public void testRotations_PositiveCase() {
        assertTrue(StringRotationChecker.areRotations("abcde", "deabc"));
        assertTrue(StringRotationChecker.areRotations("12345", "45123"));
        assertTrue(StringRotationChecker.areRotations("hello", "lohel"));
    }

    @Test
    public void testRotations_NegativeCase() {
        assertFalse(StringRotationChecker.areRotations("abcde", "edcba"));
        assertFalse(StringRotationChecker.areRotations("hello", "world"));
    }
}

