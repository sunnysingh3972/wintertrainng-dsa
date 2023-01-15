import java.util.Stack;

public class stockSpanproblem {
    public static void claculatespan(int arr[])
    {
        Stack<Integer> s=new Stack<Integer>();
        if(s.isEmpty())
        {
        s.push(0);
        System.out.print("1 ");
        }
        int span;
        for(int i=1;i<arr.length;i++)
        {
            if(!s.isEmpty()&&arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            span=s.isEmpty()?i+1:i-s.peek();
            System.out.print(span+" ");
            s.push(i);

        }

    }
    public static void main(String[] args) {
    int arr[]={100,200,300,400,500};
    claculatespan(arr);
    }
}
