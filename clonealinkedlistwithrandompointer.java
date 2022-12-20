class node{
    int data;
    node next,random;
    node(int x)
    {
        data=x;
    }
}
public class clonealinkedlistwithrandompointer {
    static node clone1(node head)
    {
        node curr=head,temp=null;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=new node(curr.data);
            curr.next.next=temp;
            curr=temp;
        }
        curr=head;
        while(curr!=null)
        {
            if(curr.next!=null)
            curr.next.random=(curr.random!=null)?curr.random.next:null;
            curr=curr.next.next;
        }
        node original=head,copy=head.next;
        temp=copy;
        while(original!=null)
        {
            original.next=original.next.next;
            copy.next=(copy.next!=null)?copy.next.next:null;
            original=original.next;
            copy=copy.next;
        }
        return temp;
    }
    static void print(node head)
    {
        node curr=head;
        while(curr!=null)
        {
            System.out.println("DATA = "+curr.data+" Random = "+curr.random.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.random=head.next.next;
        head.next.random=head;
        head.next.next.random=head.next.next.next;
        head.next.next.next.random=head;
        print(head);
        System.out.println("After cloning ");
        head=clone1(head);
        print(head);
    }

}
