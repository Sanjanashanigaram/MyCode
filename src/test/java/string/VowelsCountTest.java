package string;

import org.junit.Test;
import string.VowelsCount;

import static org.junit.Assert.*;

public class VowelsCountTest {

    @Test
    public void testBasicCase() {
        assertEquals(3, VowelsCount.countVowels("Hello World"));
    }


    @Test
    public void testNoVowels() {

        assertEquals(0, VowelsCount.countVowels("Rhythm"));
    }

    @Test
    public void testAllVowels() {
        assertEquals(5, VowelsCount.countVowels("aeiou"));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, VowelsCount.countVowels(""));
    }


    @Test
    public void testStringWithNumbersAndSymbols() {
        assertEquals(0, VowelsCount.countVowels("123!@#$"));
    }


    @Test
    public void testStringWithRepetition() {
        assertEquals(6, VowelsCount.countVowels("hellohellohello"));
    }
}
