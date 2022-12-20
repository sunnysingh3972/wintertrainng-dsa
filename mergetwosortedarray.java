import javax.print.event.PrintEvent;

class node{
    int data;
    node next;
    node(int x)
    {
        data=x;
    }
}
public class mergetwosortedarray {
    static node sortedmerge(node a,node b)
    {
        if(a==null) return b;
        if(b==null) return a;
        node head=null,tail=null;
        if(a.data<=b.data)
        {
            head=tail=a;
            a=a.next;
        }
        else
        {
            head=tail=b;
            b=b.next;

        }
        while(a!=null&&b!=null)
        {
            if(a.data<=b.data)
            {
                tail.next=a;
                tail=a;
                a=a.next;
            }
            else
            {
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null)
        tail.next=b;
        else
        tail.next=a;
        return head;
    }
    static void print(node head)
    {
        node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        node a=new node(10);
        a.next=new node(20);
        a.next.next=new node(25);
        node b=new node(5);
        b.next=new node(15);
        b.next.next=new node(30);
        node merge=sortedmerge(a, b);
        print(merge);
    }
}
