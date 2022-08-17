// /*
// You are playing a card game, where 'n' cards of different colours are arranged in a list on a circular table. 
// The player must move one card at a time, either to left or right. 
// Since the cards are in a circular list, when last card is reached in either direction, the next card is at the other end of the list. 
// You are given with one card colour and one card index, 
// determine the minimum number of left or right moves to reach the given target card from the given start index

// Input:   4          
//         ["red", "blue", "green", "yellow"] 
//         1 
//         "yellow" 
// Output: 2 

// Input:   5 
//         ["black", "grey", "brown", "red", "pink"] 
//         3 
//         "black" 
// Output: 2 
// */

// import java.util.*;

// public class pr_34_minStepsToGetTheCard {
//     public static int shiftCards(ArrayList<String> l, int start, String target){
//         int end = l.indexOf(target);

//         if (end == start){
//             return 0;
//         }
//         if(end > start){
//             int forward = Math.abs(end - start);
//             int backward = (start-0) + ((l.size()-1) - end) + 1;

//             if(forward < backward){
//                 return forward;
//             }
//             else{
//                 return backward;
//             }
//         }
//         else if(end < start){
//             int forward = (end-0) + (l.size()-1) - start + 1;
//             int backward = start - end;
//             if(forward < backward){
//                 return forward;
//             }
//             else{
//                 return backward;
//             }
//         }

//         return -1;


//     }
//     public static void main(String[] args) {
//         String [] tools = {"red","blue","green","yellow","purple"};
//         ArrayList<String> l = new ArrayList<>(Arrays.asList(tools));
//         int start = 1;
//         String target = "blue";
//         System.out.println(shiftCards(l,start,target));


//     }
// }
