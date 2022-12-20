class node{
    int data;
    node prev;
    node next;
    node(int d)
    {
        data=d;
    }

}
public class insertatbeginningofDLL {
    static node insertatbeg(node head,int data)
    {
        node temp=new node(data);
        temp.next=head;
        if(head!=null)
        head.prev=temp;
        return temp;
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
        head=insertatbeg(head, 5);
        head=insertatbeg(head, 10);
        head=insertatbeg(head, 29);
        head=insertatbeg(head, 50);
        print(head);
    }
}
