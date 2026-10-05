import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int start=arr[0];
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                System.out.println(arr[mid]+"");
                return;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }

}
