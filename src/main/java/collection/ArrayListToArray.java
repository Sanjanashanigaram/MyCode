package collection;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");

        // Converting ArrayList to Array
        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);

        // Displaying the Array elements
        System.out.println("Array elements:");
        for (String element : stringArray) {
            System.out.println(element);
        }
    }
}
