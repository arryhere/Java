
// //package com.company;

// public class pr_35_stringMatching {
//     public static boolean asciiMethod(String str){
//         if(str == null || str.equals("")){
//             return false;
//         }
//         else{
//             for(int i=0 ; i<str.length() ; i++){
//                 char ch = str.charAt(i);

//                 if( !(ch>='a' && ch<='z') && !(ch>='0' && ch<='9') && !(ch>='A' && ch<='Z') && !(ch==' ') ){
//                     return false;
//                 }

//             }
//             return true;
//         }
//     }

//     public static boolean regexMethod(String str){
//         if(str == null || str.equals("")){
//             return false;
//         }
//         else{
//             if(str.matches("[a-zA-Z0-9 ]*")){
//                 return true;
//             }
//             else{
//                 return false;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         String str = null;
//         String str1 = "ArijitDas 1999";
//         String str2 = "ArijitDas 1999$";

//         System.out.println("--------------asciiMethod--------------");

//         System.out.println(asciiMethod(str));
//         System.out.println(asciiMethod(str1));
//         System.out.println(asciiMethod(str2));

//         System.out.println("--------------regexMethod--------------");

//         System.out.println(regexMethod(str));
//         System.out.println(regexMethod(str1));
//         System.out.println(regexMethod(str2));

//     }
// }