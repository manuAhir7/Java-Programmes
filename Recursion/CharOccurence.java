// import java.util.*;

// public class CharOccurence {

//     public static int firstOccur(String str, char ch){
//         if (str.length() == 0 || str == null) {
//             return -1;
//         }
    
//         int indexInRest = lastIndexOf(ch, str.substring(1));
//         char first = str.charAt(0);
    
//         // recursive call to find the last matching character
//         if (first == ch) {
//             return 1 + indexInRest; // this might not work properly
//         } else
//             return indexInRest;
        
//     }
//     public static void main(String[] args) {
//         String str = "adncdlmctaadt";
//         char ch = 'c';
//     }
// }
