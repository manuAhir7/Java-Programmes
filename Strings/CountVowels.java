import java.util.Arrays;

public class CountVowels {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        //we dont need to check uppercase and lowercase char
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check their length are equal or not
        if(str1.length() == str2.length()){
            //converted into character array
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            //sorted character array so we can compare same character repeats or not
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            //comparison between to character array
            boolean result = Arrays.equals(str1CharArray, str2CharArray);

            //if result is true else false
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            }
            else{
                System.out.println(str1 + "and " + str2 + "are not anagrams of each other" );
            }
        }
        //lengths of string are not equals
        else{
            System.out.println("Length of string are not equals");
        }
    }
}

