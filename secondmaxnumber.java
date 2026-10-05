public class secondmaxnumber {
    public static void main(String[] args) {
        int arr[]={1,9,10,8,5};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){

                max=arr[i];

            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondmax){
               secondmax=arr[i];

            }

        }
        System.out.println(secondmax);
    }
}
