class node{
    int data; node next;
    node(int d)
    {
        data=d;
    }
}
public class middleofalinkedlist {
   static void printmiddle(node head)
   {
    if(head==null)
    return;
    node slow=head;
    node fast=head;
    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    System.out.print(slow.data);
   } 
   public static void main(String[] args) {
    node head=new node(10);
    head.next=new node(20);
    head.next.next=new node(30);
    head.next.next.next=new node(40);
    
    printmiddle(head);

}
}
