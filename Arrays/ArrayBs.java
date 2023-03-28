import java.util.Arrays;
//Binary Search in a array
public class ArrayBs{

    public static int search(int arr[], int key){
        //sort array
        Arrays.sort(arr);
        int start = 0, end = arr.length-1;
      
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){//found
                return mid;
            }
            if(arr[mid] < key){//left
                start = mid+1;
            }
            else{
                end = mid-1;//right
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("index for key is:" + search(arr, key));
    }
}
