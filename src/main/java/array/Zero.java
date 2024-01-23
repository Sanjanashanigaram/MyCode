package array;
import java.util.*;
public class Zero {

        public static void main(String[] args) throws Exception {
            int[] nums = {0, 0, 1, 0, 3, 0, 5, 0, 6};
            int i = 0;
            System.out.print("\nOriginal array: \n");
            for (int n : nums)
                System.out.print(n + "  ");

            // Use a loop to move zeros to the end of the array.
            for (int j = 0, l = nums.length; j < l;) {
                if (nums[j] == 0)
                    j++;
                else {
                    // Swap the non-zero element with the first available zero.
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j++;
                }
            }

            // Fill the remaining positions with zeros.
            while (i < nums.length)
                nums[i++] = 0;

            // Print the array after moving zeros to the end.
            System.out.print("\nAfter moving 0's to the end of the array: \n");
            for (int n : nums)
                System.out.print(n + "  ");
            System.out.print("\n");
        }
    }


