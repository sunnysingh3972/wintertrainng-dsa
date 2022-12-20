class node {
    int data;
    node next;

    node(int d) {
        data = d;
    }
}

public class reversealinkedlistingroups {
    static node reversed(node head, int k) {
        if(head == null)
          return null;
        node current = head;
        node next = null;
        node prev = null;
 
        int count = 0;
 
        
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
 
        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
        if (next != null)
            head.next = reversed(next, k);
 
       
        return prev;
    }
    

    static void print(node heead) {
        node curr = heead;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20); 
        head.next.next = new node(30);
        head.next.next.next = new node(40);
        head.next.next.next.next = new node(50);
        reversed(head, 2);
        print(head);
    }
}
