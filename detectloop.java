import java.util.HashSet;

class node {
    int data;
    node next;

    node(int d) {
        data = d;
    }
}

public class detectloop {
    //using floyd's cycle detection
    static Boolean Isloop(node head)
    {
        node slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
    }
    
    // hashing
    static Boolean isloop(node head) {
        HashSet<node> s = new HashSet<node>();
        for (node curr = head; curr != null; curr = curr.next) {
            if (s.contains(curr))
                return true;
            s.add(curr);

        }
        return false;
    }

    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(40);
        head.next.next.next = new node(50);
        head.next.next.next = head.next.next;
        System.out.println(isloop(head));
        
        System.out.println(Isloop(head));
       
    }

}
