class node{
    int data;
    node next;
    node(int d)
    {
        data=d;
        next=null;
    }
}
public class deletekthnodeofcircularlinkedlist {
    static node deletehead(node head)
    {
        if(head==null)
        return null;
        if(head.next==null)
        return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;

    }
    static node deltekth(node head,int k)
    {
        if(head==null)
        return null;
        if(k==1)
        return deletehead(head);
        
            node curr=head;
            for(int i=0;i<k-2;i++)
            curr=curr.next;
           
            curr.next=curr.next.next;
            return head;
        
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
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=head;
        deltekth(head, 2);
        print(head);

    }
}
