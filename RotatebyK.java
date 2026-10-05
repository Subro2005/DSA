import java.util.Arrays;

public class RotatebyK {
    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};
        int n=arr.length;
        int k=2;
        k=k%n;

        for(int i=0;i<k;i++){
            int last=arr[n-1];

            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
           arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));





    }
}
