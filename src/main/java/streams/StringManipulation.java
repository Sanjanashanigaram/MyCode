package streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringManipulation {

    public static String[] capitalizeAndSort(String[] inputArray) {
        // Capitalize the first letter of each string
        String[] capitalizedArray = Arrays.stream(inputArray)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toArray(String[]::new);

        // Sort the strings in alphabetical order
        Arrays.sort(capitalizedArray);

        return capitalizedArray;
    }
}

