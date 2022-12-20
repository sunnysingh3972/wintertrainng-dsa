class node{
    int data;
    node prev;
    node next;
    node(int d)
    {
        data=d;
    }

}
public class deleteheadofdll {
    static node deletehead(node head)
    {
        if(head==null) return null;
        if(head.next==null) return null;
        head=head.next;
        head.prev=null;
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
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.prev=head;
        head.next.next.prev=head.next;
        head=deletehead(head);
        print(head);
    }
}
