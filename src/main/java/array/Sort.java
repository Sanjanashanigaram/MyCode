package array;

public class Sort {

        public static void main(String[] args) {
            int[] arr = {5, 3, 2, 1, 4};
            bubbleSort(arr);
            System.out.println("Sorted array:");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

