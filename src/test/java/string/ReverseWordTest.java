package string;

import org.junit.Test;
import string.ReverseWord;

import static org.junit.Assert.*;

public class ReverseWordTest {

    @Test
    public void testReverseWords_SingleWord() {
        String inputSentence = "Java";
        String expected = "avaJ";
        assertEquals(expected, ReverseWord.reverseWords(inputSentence));
    }

    @Test
    public void testReverseWords_MultipleWords() {
        String inputSentence = "Java J2EE Reverse Me";
        String expected = "avaJ EE2J esreveR eM";
        assertEquals(expected, ReverseWord.reverseWords(inputSentence));
    }

    @Test
    public void testReverseWords_EmptySentence() {
        String inputSentence = "";
        String expected = "";
        assertEquals(expected, ReverseWord.reverseWords(inputSentence));
    }
}
