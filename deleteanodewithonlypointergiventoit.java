class node{
    int data;
    node next;
    node(int d)
    {
        data =d;
    }
}
public class deleteanodewithonlypointergiventoit {
   static void deletenode(node ptr)
   {
    ptr.data=ptr.next.data;
    ptr.next=ptr.next.next;
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
        head.next = new node(20);
        head.next.next = new node(40);
        head.next.next.next = new node(50);
        print(head);
        deletenode(head.next.next);
        System.out.println();
        print(head);
   }
}
