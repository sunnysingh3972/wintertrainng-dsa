class TwoStacks{
    int arr[];
    int cap,top1,top2;
    TwoStacks(int n)
    {
        cap=n;
        top1=-1;
        top2=cap-1;
        arr=new int[cap];
    }
    void push1(int n)
    {
        if(top1<top2)
        {
            top1++;
            arr[top1]=n;
        }
    }
    void push2(int n)
    {
        if(top1<top2)
        {
            top2--;
            arr[top2]=n;
        }
    }
    int pop1(){
        if(top1>=0)
        {
            int x=arr[top1];
            top1--;
            return x;
        }
        else 
        {
            return -1;
        }
    }
    int pop2(){
        if(top1<cap)
        {
            int x=arr[top2];
            top2++;
            return x;
        }
        else 
        {
           return -1;

        }
    }
}
public class implementtwostackinarray {
   public static void main(String[] args) {
    TwoStacks s=new TwoStacks(10);
    s.push1(1);
    s.push2(2);
System.out.println(s.pop2());
   }
}
