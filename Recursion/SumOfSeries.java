public class SumOfSeries {
    //Calculate sum of n natural numbers
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        //stores n value and goes decreasing and summation together
        return (n+sum(n-1));
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
}
