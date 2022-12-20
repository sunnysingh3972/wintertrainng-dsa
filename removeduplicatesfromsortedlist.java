class node{
    int data;
    node next;
    node(int d)
    {
        data=d;
    }
}
public class removeduplicatesfromsortedlist {
    static void removedups(node head)
    {
        node curr=head;
        while(curr!=null&&curr.next!=null)
        {
            if(curr.data==curr.next.data)
            {
                curr.next=curr.next.next;
            }
            else
            curr=curr.next;
        }
    }
    static void print(node heead)
    {
        node curr=heead;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(30);   
        removedups(head);
        print(head);
    }
}
