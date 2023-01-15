import java.util.Stack;

public class previousgreaterelement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // System.out.print("-1");

        int arr[] = { 15, 10, 18, 12, 4, 6, 2, 8 };
               s.push(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            while(!s.isEmpty()&&arr[i]>=s.peek())
            s.pop();
            int s1=(s.isEmpty())?-1:s.peek();
            System.out.print(s1+" ");
            s.push(arr[i]);
        }
    }
}
