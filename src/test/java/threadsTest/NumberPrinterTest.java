package threadsTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPrinterTest {

    @Test
    public void testEvenNumbers() {
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = 2; i <= 60; i += 2) {
            evenNumbers.append(i).append(" ");
        }
        String expectedEvenNumbers = evenNumbers.toString().trim();

        StringBuilder actualEvenNumbers = new StringBuilder();
        for (int i = 2; i <= 60; i += 2) {
            actualEvenNumbers.append("Even Thread: ").append(i).append("\n");
        }
        String printedEvenNumbers = actualEvenNumbers.toString().trim();

        assertEquals(printedEvenNumbers, expectedEvenNumbers);
    }

    @Test
    public void testOddNumbers() {
        StringBuilder oddNumbers = new StringBuilder();
        for (int i = 1; i <= 59; i += 2) {
            oddNumbers.append(i).append(" ");
        }
        String expectedOddNumbers = oddNumbers.toString().trim();

        StringBuilder actualOddNumbers = new StringBuilder();
        for (int i = 1; i <= 59; i += 2) {
            actualOddNumbers.append("Odd Thread: ").append(i).append("\n");
        }
        String printedOddNumbers = actualOddNumbers.toString().trim();

        assertNotEquals(printedOddNumbers, expectedOddNumbers);
    }
}
