public class SubArray {

    public static void sub(int arr[]) {
         for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8};
        sub(arr);
    }
}
