class node{
    int data;
    node next;
    node(int d)
    {
        data=d;
        next=null;
    }
}
public class insertatbeginningofcircularlinkedlist {
    static node insertatbeg(node head,int x)
    {
        node temp=new node(x);
        if(head==null)
        {
            temp.next=temp;
            return temp;
        }
        else
        {
            temp.next=head.next;
            head.next=temp;
            int p=head.data;
            head.data=temp.data;
            temp.data=p;
            return head;
        }
        
    }
    static void print(node head)
    {
        if(head==null)
        return;
        node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;

        }while(curr!=head);
    }
    public static void main(String[] args) {
        node head=null;
        head=insertatbeg(head, 10);
        head=insertatbeg(head, 20);
        head=insertatbeg(head, 30);
        print(head);

    }
}
