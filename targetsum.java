public class targetsum {
    public static void main(String[] args) {
        int target=5;
        int arr[]={3,2,4,3,1,2,3,4,5};
        int count=0;

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
