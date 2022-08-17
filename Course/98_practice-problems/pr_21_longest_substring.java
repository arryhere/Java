// //Java Program to find longest substring without repetition

// import java.util.*;

// public class pr_21_longest_substring {

//     public static void longestSubstring(String s){
//         Set<Character> set = new LinkedHashSet<>();
//         String longestTillNow = "";
//         String longestOverall = "";

//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if(set.contains(c)){
//                 set.clear();
//                 longestTillNow = "";
//             }
//             set.add(c);
//             longestTillNow = longestTillNow + c;
//             if(longestTillNow.length()>longestOverall.length()){
//                 longestOverall = longestTillNow;
//             }
//         }
//         System.out.println(longestOverall);

//     }
//     public static void main(String[] args) {
//         String s = "abcdeab";
//         longestSubstring(s);
//     }
    
// }
