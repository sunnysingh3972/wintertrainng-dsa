class node{
    int data;
    node next;
    node(int d)
    {
        data=d;
    }
}
public class sortedinsertinalinkedlist {
    static node sortedinsert(node head,int x)
    {
        node temp=new node(x);
        if(head==null)
        return temp;
        if(x<head.data)
        {
            temp.next=head;
            return temp;
        }
        node curr=head;
        while(curr.next!=null&&curr.next.data<x)
        {
            curr=curr.next;

        }
        temp.next=curr.next;
        curr.next=temp;
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
        
        sortedinsert(head, 35);
        print(head);

    }
}
