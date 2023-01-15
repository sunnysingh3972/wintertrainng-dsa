import java.util.Stack;

public class reversestack {
    public static void solve(Stack<Integer> s, int count, int size) {
        if (count == size / 2)
            {s.pop();
                return;
            }
        int n = s.peek();
        s.pop();
        solve(s, count + 1, size);
        s.push(n);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.size());
        solve(s, 0, s.size());
        System.out.println(s);

    }
}
