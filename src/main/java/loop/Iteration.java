package loop;

public class Iteration {
    public static void main(String args[]) {

        int count = 5;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - i; j++) {
                System.out.print("+");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}