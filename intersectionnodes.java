class node{
    int data;
    node next;
    node(int d)
    {
        data =d;
    }
}
public class intersectionnodes {
    static int getcount(node head)
    {
        node curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;
    }
    static int getintersectionnodes(node n1,node n2)
    {
        int c1=getcount(n1);
        int c2=getcount(n2);
        int d=Math.abs(c1-c2);
        node curr1=n1,curr2=n2;
        if(c1>c2)
        {
            for(int i=0;i<d;i++)
            {
                if(curr1==null)
                return -1;
                curr1=curr1.next;
            }

        }
        else
        {
            for(int i=0;i<d;i++)
            {
                if(curr2==null)
                return -1;
                curr2=curr2.next;
            }
        }
        while(curr1!=null&&curr2!=null)
        {
            if(curr1==curr2)
            return curr1.data;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        node head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=new node(50);
        node temp1=new node(60);
        temp1=head.next;
        System.out.println(getintersectionnodes(head, temp1));
    }
}
