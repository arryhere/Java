// //package com.company;

// import java.util.Arrays;

// public class ARRY_38_enum {
//     private enum Mobile{
//         APPLE(100),XIAOMI(50),REALME(55),SAMSUNG(80),ONEPLUS(70);

//         int price;
//         Mobile(){       //IT IS PRIVATE
//             this.price = 80;
//             System.out.println("constructor of enum Mobile!");
//         }
//         Mobile(int p){
//             this.price = p;
//         }
//         private int getPrice(){
//             return price;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(Planets.EARTH);
//         System.out.println(Arrays.toString(Planets.values()));

//         System.out.println(Arrays.toString(Mobile.values()));
//         Mobile m = Mobile.APPLE;
//         switch (m){
//             case APPLE:
//                 System.out.println("apple");
//                 break;
//             case SAMSUNG:
//                 System.out.println("samsung");
//                 break;
//             case XIAOMI:
//                 System.out.println("xiaomi");
//                 break;
//             case REALME:
//                 System.out.println("realme");
//                 break;
//             case ONEPLUS:
//                 System.out.println("oneplus");
//                 break;
//             default:
//                 System.out.println("null");
//                 break;
//         }

//         System.out.println(Mobile.APPLE.getPrice());
//         System.out.println(Mobile.SAMSUNG.getPrice());
//         System.out.println(Mobile.REALME.ordinal());
//         Mobile [] m_arr = Mobile.values();
//         System.out.println(Arrays.toString(m_arr));
//     }
// }
