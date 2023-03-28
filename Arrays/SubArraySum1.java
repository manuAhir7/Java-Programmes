import java.util.*;

public class SubArraySum1 {

    public static int  ArraySum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                System.out.println(sum);
            }
        }
        return sum;
        
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        
        int result = ArraySum(arr);
        System.out.println(result);
    }
}
