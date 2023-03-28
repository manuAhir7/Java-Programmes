public class reverseArray{

    //reverse array function
    public static void reverse(int arr[]){
        int temp, first=0, last=arr.length-1;
        
        while(first<last){
            //swap
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            //incrementing variables
            first++;
            last--;

        }
    }
    public static void main(String args[]){
        int arr[] = {2,3,7,5,8,3};
        reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    
    }
}