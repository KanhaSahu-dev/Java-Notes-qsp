import java.util.Stack;

public class stack_1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for(int i = 1;i<=10;i++){
            s.push(i);
        }

        System.out.println(s.peek());

        System.out.println(s.search(10));//Expected output 5

        System.out.println(s.capacity());

        System.out.println(s.pop());

        System.out.println(s.capacity());


        
    }
}
