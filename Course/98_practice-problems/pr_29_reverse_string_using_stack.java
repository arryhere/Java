// import java.util.Stack;

// public class pr_29_reverse_string_using_stack {
//     public static void reverseStringUsingStack(String s){

//         Stack<Character> st = new Stack<>();
//         for(int i=0;i<s.length();i++){
//             st.push(s.charAt(i));
//         }
//         char [] c = new char[s.length()];
//         for(int i=0;i<s.length();i++){
//             c[i] = st.pop();
//         }
//         String s2 = new String(c);
//         System.out.println(s2);
//     }
//     public static void main(String[] args) {
//         String s = "hello world !";
//         reverseStringUsingStack(s);
//     }
// }