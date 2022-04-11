import java.util.ArrayList;
import java.util.Stack;

public class ds_4_Stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());

        ArrayList<Integer> a = new ArrayList<>(s);
        System.out.println(a);
        System.out.println(a.get(0));
        
    }
    
}
