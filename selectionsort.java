
import java.util.*;

public class selectionsort {
    public static void main(String[] args) {

        int arr[] = {10, 5, 6, 8, 2, 1};
        int n = arr.length;

        for(int i = 0; i < n; i++) {

            int min = Integer.MAX_VALUE;
            int mindx = -1;

            for(int j = i; j < n; j++) {

                if(arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
