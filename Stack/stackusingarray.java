public class stackusingarray {
int arr[];
int cap;
int top;
 stackusingarray(int n)
{
    cap=n;
    top=-1;
    arr=new int [cap];
}
 void push(int n)
{if(top==cap-1)
    System.out.println("overflow");
    top++;
    arr[top]=n;

}
int pop()
{
    if(top==-1)
    {
        System.out.println("Underflow");
    }
    int res=arr[top];
    top--;
    return res;
}
int peek()
{
    int res=arr[top];
    return res;
}
int size()
{
    return top+1;
}
boolean isEmpty()
{
    if(top==-1)
    return true;
    return false;
}
public static void main(String[] args) {
    stackusingarray s=new stackusingarray(10);
    s.push(10);
    s.push(11);
    s.push(12);
    System.out.println(s.size());
    System.out.println(s.pop());
    System.out.println(s.peek());
    System.out.println(s.isEmpty());
}
}
