package streams;

public class StringsContainingVowels {

    public static void printStringsWithVowels(String[] inputArray) {
        for (String str : inputArray) {
            int vowelCount = countVowels(str);

            if (vowelCount > 0) {
                System.out.println("String: " + str + ", Vowel Count: " + vowelCount);
            }
        }
    }

    private static int countVowels(String str) {
        // Count the number of vowels in a given string
        return (int) str.toLowerCase().chars()
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();
    }
}

