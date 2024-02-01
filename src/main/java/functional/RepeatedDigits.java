package functional;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedDigits {

    // Method to find digits repeated more than once in a given number
    public static Set<Integer> findRepeatedDigits(int number) {
        // Set to store repeated digits
        Set<Integer> repeatedDigits = new HashSet<>();

        // Map to store the count of each digit in the number
        Map<Integer, Integer> digitCountMap = new HashMap<>();

        // Convert the number to a string for easier digit extraction
        String numberStr = String.valueOf(number);

        // Iterate through each digit in the number
        for (char digitChar : numberStr.toCharArray()) {
            // Convert the character digit to an integer
            int digit = Character.getNumericValue(digitChar);

            // Update the count of the digit in the map
            digitCountMap.put(digit, digitCountMap.getOrDefault(digit, 0) + 1);

            // If the count becomes 2, add the digit to the set of repeated digits
            if (digitCountMap.get(digit) == 2) {
                repeatedDigits.add(digit);
            }
        }

        // Return the set of repeated digits
        return repeatedDigits;
    }
}
