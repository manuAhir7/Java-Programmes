//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
		sc.close();
	}
}


class Solution
{
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(arr[i] + arr[j] + arr[j+1] == 0 ){
                    return true;
                }
            }
        }
        return false;
    }
}