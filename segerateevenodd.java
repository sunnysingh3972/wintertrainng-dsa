class node{
    int data;
    node next;
    node(int d)
    {
        data=d;
    }

}
public class segerateevenodd {
    static node segerate(node head)
    {
        node es=null,eE=null,os=null,oe=null;
        for(node curr=head;curr!=null;curr=curr.next)
        {
            int x=curr.data;
            if(x%2==0)
            {
                if(es==null)
                {
                    es=curr;
                    eE=es;
                }
                else
                {
                    eE.next=curr;
                    eE=eE.next;
                }

            }
            else
            {
                if(os==null)
                {
                    os=curr;
                    oe=os;
                }
                else
                {
                    oe.next=curr;
                    oe=oe.next;
                }

            }
        }
        if(os==null||es==null)
        return head;
        eE.next=os;
        oe.next=null;
        return es;
    }
    static void print(node head)
    {
     node curr=head;
     while(curr!=null)
     {
         System.out.print(curr.data+" ");
         curr=curr.next;
     }
    }
    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(25);
        head.next.next = new node(200);
        head.next.next.next = new node(50);
        head=segerate(head);
        print(head);
        
    }

}
