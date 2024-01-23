package string;
import org.junit.Test;
import string.AnagramCheck;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void testAreAnagrams_PositiveCase() {
        String str1 = "Listen";
        String str2 = "Silent";
        assertTrue(AnagramCheck.areAnagrams(str1, str2));
    }

    @Test
    public void testAreAnagrams_NegativeCase_DifferentLengths() {
        String str1 = "Hello";
        String str2 = "World";
        assertFalse(AnagramCheck.areAnagrams(str1, str2));
    }

    @Test
    public void testAreAnagrams_NegativeCase_SameLengths() {
        String str1 = "Java";
        String str2 = "Python";
        assertFalse(AnagramCheck.areAnagrams(str1, str2));
    }

    @Test
    public void testAreAnagrams_PositiveCase_CaseInsensitive() {
        String str1 = "Racecar";
        String str2 = "RaceCar";
        assertTrue(AnagramCheck.areAnagrams(str1, str2));
    }

    @Test
    public void testAreAnagrams_PositiveCase_WithSpaces() {
        String str1 = "Astronomer";
        String str2 = "Moon starer";
        assertTrue(AnagramCheck.areAnagrams(str1, str2));
    }

    @Test
    public void testAreAnagrams_NegativeCase_WithSpaces() {
        String str1 = "The Morse Code";
        String str2 = "Here come dots";
        assertTrue(AnagramCheck.areAnagrams(str1, str2));
    }
}