public class sortZeroesones {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,0,1,1,0};
        int n=arr.length;

        int zeroes=0;


        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }

        for(int i=0;i<zeroes;i++){
            arr[i]=0;
        }
        for(int i=zeroes;i<n;i++){
            arr[i]=1;
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
