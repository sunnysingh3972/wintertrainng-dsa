class node{
    int data;
    node next;
    node(int d)
    {
        data=d;
    }
}
public class findnthnodefromendoflinkedlist {
    static void printnthfromend(node head ,int x)
    {
        if(head==null)
        return;
        node first=head;
        for(int i=0;i<x;i++)
        {
            if(first==null)
            return;
            first=first.next;
        }
        node second=head;
        while(first!=null)
        {
            first=first.next;
            second=second.next;
        }
        System.out.println(second.data);

    } public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        printnthfromend(head, 3);
        
    }

}
