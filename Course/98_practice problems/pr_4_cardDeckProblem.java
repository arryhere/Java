// We have a stack of n number of cards, each card numbered 1 to n from top so the first card is card 1
// & the last card is card n. Let’s say we throw away the first card & then move the 2nd card to the
// last. Let’s keep doing this until we are just left with one card. Check image 1.

// So, for example if n is 3 then the cards would be 1,2,3 so for first iteration we would throw away 1
// & move 2 to the bottom so now the stack would become 3,2. On 2nd iteration we throw away 3 &
// we are left with only one card '2'.


import java.util.ArrayList;
import java.util.Scanner;

public class pr_4_cardDeckProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();

        System.out.print("Enter the n.o of cards - ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            a1.add(i);
        }

        //System.out.println(a1); // use only to print the initial array.

        int j=0;
        while (j<n-1) {

            a1.remove(a1.get(0));
            a1.add(a1.get(0));
            a1.remove(a1.get(0));

            j++;
        }

        System.out.println("Original Deck - "+n);
        System.out.println("Method #1 ______________ Brute force method");
        System.out.print("Last Remaining card - "+a1);
        System.out.println("");
        System.out.println("Iterations - "+j);

        sc.close();
    }
}
