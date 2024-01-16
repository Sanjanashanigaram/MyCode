package keywordstatic;

public class Employee {
    static int employeeNumber = 3456789;

    public static int getEmployeeNumber() {
        return employeeNumber;
    }

    public static void main(String[] args) {

        System.out.println(getEmployeeNumber());
    }
}
