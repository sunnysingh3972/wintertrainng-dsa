class node {
    int data;
    node prev;
    node next;

    node(int d) {
        data = d;

    }

}

public class circulardoublylinkedlist {
    static node inserthead(node head, int x) {
        node temp = new node(x);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        return temp;
    }

    static node insertEnd(node head, int x) {
        node temp = new node(x);
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        temp.next = head;
        head.prev.next = temp;
        head.prev = temp;
        return head;
    }

    static void print(node head) {
        if (head == null)
            return;
        node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;

        } while (curr != head);
    }

    public static void main(String[] args) {
        node head = null;
        head = inserthead(head, 10);
        head = inserthead(head, 20);
        head = insertEnd(head, 30);
        head = insertEnd(head, 40);

        print(head);
    }
}
