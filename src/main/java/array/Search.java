package array;

public class Search {

    public static void main(String[] args) {
        int[] arr = {34,56,12,11,45,67,78,43,323,34,43};
        int searchElement = 323,i;
        for( i=0;i<arr.length;i++)
            if(arr[i]==searchElement){
                System.out.println("elemenent found at index "+ (i+1));
                break;
            }
        if(i==arr.length)
            System.out.println("Element not found");
    }
}
