package streamsTest;

import org.junit.jupiter.api.Test;
import streams.StringsContainingVowels;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsContainingVowelsTest {

    @Test
    public void testPrintStringsWithVowels() {
        String[] inputArray = {"hello", "world", "apple", "banana", "java", "programming"};
        String expectedOutput = "String: hello, Vowel Count: 2\n" +
                "String: apple, Vowel Count: 2\n" +
                "String: banana, Vowel Count: 3\n" +
                "String: java, Vowel Count: 2\n" +
                "String: programming, Vowel Count: 4\n";

        // Redirect the System.out stream for testing
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        StringsContainingVowels.printStringsWithVowels(inputArray);

        // Reset the System.out stream
        System.setOut(System.out);


    }

    @Test
    public void testPrintStringsWithVowelsNoVowels() {
        String[] inputArray = {"sky", "fly", "try", "myth"};
        String expectedOutput = "";

        // Redirect the System.out stream for testing
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        StringsContainingVowels.printStringsWithVowels(inputArray);

        // Reset the System.out stream
        System.setOut(System.out);

        assertEquals(expectedOutput, outputStream.toString());
    }
}

