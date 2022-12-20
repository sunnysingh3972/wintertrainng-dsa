class node {
    int data;
    node next;

    node(int x) {
        data = x;
        next = null;
    }
}

public class palindeomelinkedlist {
    static boolean ispalindrome(node head) {
        if (head == null)
            return true;
        node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node rev = reverselist(slow.next);
        node curr = head;
        while (rev!= null) {
            if (rev.data != curr.data)
                return false;
            rev = rev.next;
            curr = curr.next;
        }
        return true;

    }

    static node reverselist(node head) {
        node curr = head;
        node prev = null;
        while (curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }

    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(30);
        head.next.next.next = new node(20);
        head.next.next.next.next = new node(10);
        System.out.println(ispalindrome(head));
    }
}
