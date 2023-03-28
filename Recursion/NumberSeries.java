public class NumberSeries{

    public static void ascSeries(int n){
           if(n == 1){
            System.out.print(n+" ");
            return;
           }
           ascSeries(n-1);
           System.out.print(n+" ");
    }

    public static int descSeries(int n){
        if(n == 0){
            return 1;
        }
        System.out.print(n+" ");
        return descSeries(n-1); 
    }

    public static void main(String[] args) {
        int n = 7;
        ascSeries(n);
        System.out.println();
        descSeries(n);
    }
}