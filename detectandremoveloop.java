class node {
    int data;
    node next;

    node(int d) {
        data = d;

    }
}

public class detectandremoveloop {
    static Boolean isloop(node head)
    {
        node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
            return true;
        }
        return false;
    }
    static void detectremoveloop(node head) {
        node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        if (slow != fast)
            return;
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;

    }

    public static void main(String[] args) {

        node head = new node(10);
        head.next = new node(20);
        head.next.next = new node(40);
        head.next.next.next = new node(50);
        head.next.next.next = head.next.next;
        System.out.println(isloop(head));
        detectremoveloop(head);
        System.out.println(isloop(head));

    }
}
