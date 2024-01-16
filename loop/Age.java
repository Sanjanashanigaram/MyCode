package loop;

public class Age {

    public static void main(String[] args) {
        // Example usage:
        int personAge = 4;
        classifyAge(personAge);
    }

    // Function to classify age into kid, teen, or adult
    public static void classifyAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
