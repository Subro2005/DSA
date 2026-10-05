public class ocurranceofxgreater {
    public static void main(String[] args) {
        int x=5;
        int arr[]={2,3,4,5,4,3,5,9,8,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>5){
                count++;
            }
        }
        System.out.println(count);

    }
}
