public class ocurranceofx {
        public static void main(String[] args) {

            int x=5;
            int arr[]={3,5,2,6,5,2,9,5};
            int count=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    count++;
                }
            }
            System.out.println(count);

        }
    }


