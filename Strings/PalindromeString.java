class PalindromeString{

    public static boolean isPalindrome(String str){

        for(int i=0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       String  str = "noon";
      System.out.println(isPalindrome(str));
    }
}