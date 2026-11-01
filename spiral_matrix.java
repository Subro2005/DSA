public class spiral_matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            // Move right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Move left
            for (int i = right; i >= left && top <= bottom; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;

            // Move up
            for (int i = bottom; i >= top && left <= right; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }
    }
}