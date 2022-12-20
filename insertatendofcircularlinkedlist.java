class node{
    int data;
    node next;
    node(int d)
    {
        data=d;
        next=null;
    }
}
public class insertatendofcircularlinkedlist {
    static node insertatend(node head,int x)
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
            int p=temp.data;
            temp.data=head.data;
            head.data=p;
            return temp;
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
        head=insertatend(head, 10);
        head=insertatend(head, 20);
        head=insertatend(head, 30);
        print(head);

    }
}
