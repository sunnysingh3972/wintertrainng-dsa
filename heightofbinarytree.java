class node{
    node left;
    node right;
    int data;
    node(int k)
    {
        this.data=k;
    }
}
public class heightofbinarytree {
    static int height(node root)
    {
        if(root==null)
        return 0;
        else
        return Math.max(height(root.left),height(root.right))+1;
    }
   public static void main(String[] args) {
    node root=new node(1);
    root.left=new node(2);
    root.right=new node(3);
    root.left.left=new node(4);
    System.out.println("Height of this tree is : "+height(root));
   } 
}
