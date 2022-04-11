// import java.util.HashSet;

// public class pr_14_print_repeating_ch {

//     public static void repeatingCharacters(String s){
//         HashSet<Character> h = new HashSet<Character>();

//         char [] c = new char[s.length()];
//         for(int i=0;i<c.length;i++){
//             c[i] = s.charAt(i);
//         }

//         for(int i=0;i<c.length;i++){
//             for(int j=i+1;j<c.length;j++){
//                 if(c[i]==c[j]){
//                     h.add(c[i]);
//                 }
//             }
//         }
//         h.remove(' ');
//         System.out.println(h);
        
//     }
//     public static void main(String[] args) {
//         String s = "Hello Hello -- World";
//         repeatingCharacters(s);
//     }
// }
