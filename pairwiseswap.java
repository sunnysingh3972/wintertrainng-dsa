class node {
    int data;
    node next;
    node(int d)
    {
        data=d;
    }
}
public class pairwiseswap {
    static node pairwiseswaap(node head)
    {
        if(head==null||head.next==null)
        return head;
        node curr=head.next.next;
        node prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null&&curr.next!=null)
        {
            prev.next=curr.next;
            prev=curr;
            node next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;
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
        head.next.next.next=new node(40);
        head=pairwiseswaap(head);
        print(head);

    }

}
