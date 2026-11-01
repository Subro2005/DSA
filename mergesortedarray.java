public class mergesortedarray {
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 40, 50};
        int arr2[] = {60, 70, 80, 90, 100};

        int arr3[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from arr1
        while (i < arr1.length) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements from arr2
        while (j < arr2.length) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        for (int a = 0; a < arr3.length; a++) {
            System.out.print(arr3[a] + " ");
        }
    }
}