
class node{
    node left;
    node right;
    int data;
    node(int k)
    {
        this.data=k;
    }
}
public class constructor {
   public static void main(String[] args) {
    node root=new node(1);
    root.left=new node(2);
    root.right=new node(3);
    root.left.left=new node(4);
   } 
}
