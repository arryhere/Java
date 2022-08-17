
// import java.util.*;

// public class pr_33_firstNonDuplicateCharacter_hashMap {
//     public static void getUniqueLetterHashMap(String s){
//         char [] c = new char[s.length()];
//         for(int i=0;i<c.length;i++){
//             c[i] = s.charAt(i);
//         }

//         HashMap<Character, Integer> h = new HashMap<>();
//         for(int i=0;i<c.length;i++){
// //            if(h.containsKey(c[i])){
// //                h.put(c[i],h.get(c[i])+1);
// //            }
// //            else{
// //                h.put(c[i],1);
// //            }
//             h.put(c[i],h.getOrDefault(c[i],0)+1);

//         }

//         char u = ' ';
//         for(Map.Entry<Character, Integer> e:h.entrySet()){
//             if(e.getValue() == 1){
//                 u = e.getKey();
//                 break;
//             }
//         }

//         if(u == ' '){
//             System.out.println(-1);
//         }
//         else{
//             System.out.println(s.indexOf(u)+1);
//         }
//     }
//     public static void main(String[] args) {
//         getUniqueLetterHashMap("hackthegame");
//     }
// }
