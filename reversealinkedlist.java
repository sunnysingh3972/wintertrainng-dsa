class node{
    int data;
    node next;
    node(int d)
    {
        data=d;
    }
}
public class reversealinkedlist {
    static node reverseI(node head)
    {
        node curr=head;
        node prev=null;
        while(curr!=null)
        {
            node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }
    static node reverseRI(node head)
    {
        if(head==null||head.next==null)
        return head;
        node rest_head=reverseRI(head.next);
        node rest_tail=head.next;
       rest_tail.next=head;
       head.next=null;
       return rest_head;

    }
    // static node reverseRII(node head, node prev)
    // {
    //     if(head==null)
    //     return prev;
    //     node next=head.next;
    //     head.next=prev;
    //     return reverseRII(next, prev);

    // }
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
        head=reverseI(head);
        print(head);
       System.out.println();
        head=reverseRI(head);
        print(head);
        System.out.println();
        
       
        
    }
}
