public class Test{

    public static int minSwaps(int nums[]){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            for(int j=i+1; j<nums.length;j++){
                if(curr > nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {10,19,6,5,4};
        int result = minSwaps(nums);
        System.out.println(result);
    }
}