package functional;

import java.util.*;

public class HashMapSorter {

    // Method to sort a HashMap by keys
    public static <K extends Comparable<? super K>, V> Map<K, V> sortByKeys(HashMap<K, V> map) {
        TreeMap<K, V> sortedMap = new TreeMap<>(map);
        return sortedMap;
    }

    // Method to sort a HashMap by values
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValues(HashMap<K, V> map) {
        List<Map.Entry<K, V>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, Map.Entry.comparingByValue());

        LinkedHashMap<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}

