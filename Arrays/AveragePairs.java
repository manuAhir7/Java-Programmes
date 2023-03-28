import java.util.*;
// Average pairs find function
public class AveragePairs {

    public static void avgPairs(int arr[]){
        //sum calculate
        int i=0,sum=0;
        while(i<arr.length){
            sum += arr[i];
            i++;
        }
        //average of whole
        float avg = (sum/arr.length); 

        //comparing number average and whole average
        for(i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j])/2 == avg){
                    System.out.print("("+arr[i]+","+arr[j]+")");
                }
            }
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
           arr[i] = sc.nextInt();
        }
        avgPairs(arr);//function calling

    }
}
