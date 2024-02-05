package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {

    public static Map<Integer, List<String>> groupByLength(List<String> inputList) {
        // Use Java streams to group strings by length

        return inputList.stream()
                .collect(Collectors.groupingBy(String::length));
    }
}

