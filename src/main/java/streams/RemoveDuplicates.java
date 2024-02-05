package streams;
import java.util.List;
import java.util.stream.Collectors;
public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> inputList) {
        // Use Java streams to remove duplicates
        List<Integer> distinctList = inputList.stream()
                .distinct()
                .collect(Collectors.toList());

        return distinctList;
    }
}
