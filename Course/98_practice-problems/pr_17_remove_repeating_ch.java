// import java.util.Arrays;
// import java.util.LinkedHashSet;
// import java.util.Set;

// public class pr_17_remove_repeating_ch {

//     public static void removeRepeating(String s){
//         Character[] c = new Character[s.length()];
//         for (int i = 0; i < c.length; i++) {
//             c[i] = s.charAt(i);
//         }
        
//         Set<Character> h1 = new LinkedHashSet<>(Arrays.asList(c));
        
//         Character [] c1 = new Character [h1.size()];
//         h1.toArray(c1);

//         char [] c2 = new char[c1.length];
//         for (int i = 0; i < c2.length; i++) {
//             c2[i] = c1[i];
//         }

//         String s1 = new String(c2);
//         System.out.println(s1);
//     }
//     public static void main(String[] args) {
//         removeRepeating("arijit arijit das arry rahul des");
//     }
    
// }
