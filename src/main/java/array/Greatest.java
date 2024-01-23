package array;

public class Greatest {

    public static void main(String args[]) {
        int numbers[] = new int[]{55, 32, 45, 98, 82, 11, 9, 39, 50};
        int small = numbers[0];
        int large = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > large)
                large = numbers[i];
            else if (numbers[i] < small)
                small = numbers[i];
        }
        System.out.println("Largest Number is : " + large);
        System.out.println("Smallest Number is : " + small);
    }
}

