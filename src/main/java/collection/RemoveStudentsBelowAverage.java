package collection;
import java.util.ArrayList;
class Student {
    String firstName;
    String lastName;
    double gpa;
public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        }
        }
public class RemoveStudentsBelowAverage {
    public static void main(String[] args) {
        // Creating an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Alice", "Smith", 3.2));
        studentList.add(new Student("Bob", "Johnson", 3.8));
        studentList.add(new Student("Eva", "Williams", 3.0));

        // Displaying the ArrayList before removal
        System.out.println("Students before removal:");
        for (Student student : studentList) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }

        // Calculate the average GPA
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.gpa;
        }
        double averageGPA = totalGPA / studentList.size();

        // Remove students with GPA less than the average GPA
        studentList.removeIf(student -> student.gpa < averageGPA);

        // Displaying the ArrayList after removal
        System.out.println("\nStudents after removal:");
        for (Student student : studentList) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }
    }
}
