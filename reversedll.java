class node{
    int data;
    node next;
    node prev;
    node(int d)
    {
        data=d;
    }
}
public class reversedll {
    static void print(node head)
    {
        if(head==null)
        return;
        System.out.print(head.data+" ");
        print(head.next);
    }
    static node reversedll1(node head)
    {
        if(head==null||head.next==null)
        return head;
        node prev=null,curr=head;
        while(curr!=null)
        {
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.prev=head;
        head.next.next.prev=head.next;
        head=reversedll1(head);
        print(head);
    }
}
