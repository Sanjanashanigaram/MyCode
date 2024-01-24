package collection;

    import java.util.ArrayList;

    public class RemoveLastObject {

        public static void main(String[] args) {
            // Creating an ArrayList of Strings
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Java");
            stringList.add("Python");
            stringList.add("C++");
            stringList.add("JavaScript");

            // Displaying the ArrayList before removal
            System.out.println("ArrayList before removal: " + stringList);

            // Removing the last object from the ArrayList
            if (!stringList.isEmpty()) {
                stringList.remove(stringList.size() - 1);
                System.out.println("Removed the last object.");

                // Displaying the ArrayList after removal
                System.out.println("ArrayList after removal: " + stringList);
            } else {
                System.out.println("ArrayList is empty. Cannot remove the last object.");
            }
        }
    }

