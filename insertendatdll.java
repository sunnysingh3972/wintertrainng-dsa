class node{
    int data;
    node next;
    node prev;
    node(int x)
    {
        data=x;
    }
}
public class insertendatdll {
    static node insertend(node head ,int x)
    {
        node temp=new node(x);
        if(head==null)
        return temp;
        node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }
    static void print(node head)
    {
        if(head==null)
        return;
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static void main(String[] args) {
        node head=null;
        head=insertend(head, 40);
        head=insertend(head, 50);
        head=insertend(head, 60);
        head=insertend(head, 70);
        print(head);
    }
}
