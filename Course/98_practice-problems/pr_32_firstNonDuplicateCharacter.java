// public class pr_32_firstNonDuplicateLetter {

//     public static void getUniqueCharacter(String s){
//         char [] c = new char [s.length()];
//         for(int i=0;i<s.length();i++){
//             c[i] = s.charAt(i);
//         }
//         int flag = -1;
//         int count = 0;
//         for(int i=0;i<c.length;i++){
//             for(int j=0;j<c.length;j++){
//                 if(i == j){
//                     continue;
//                 }
//                 if(c[i] == c[j]){
//                     count++;
//                 }
//             }
//             if(count == 0){
//                 flag = i;
//                 break;
//             }
//             else{
//                 count = 0;
//             }
//         }
//         if(flag == -1){
//             System.out.println(-1);
//         }
//         else{
//             System.out.println(flag+1);
//         }
//     }
//     public static void main(String[] args) {
//         String s = "naabdebccd";
//         getUniqueLetter(s);
//     }
// }
