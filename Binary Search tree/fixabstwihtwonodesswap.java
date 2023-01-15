class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class fixabstwihtwonodesswap {
    static node prev=null;
    static node first=null;
    static node second=null;

   public static void main(String[] args) {
    node root=new node(20);
    root.left=new node(50);
    root.left.left=new node(4);
    root.left.right=new node(10);
    root.right=new node(80);
    root.right.left=new node(8);
    root.right.right=new node(100);
    inoder(root);
    correctBST(root);
    System.out.println();
    inoder(root);


   }
   static void inoder(node root)
   {
    if(root==null)
    return;
    inoder(root.left);
    System.out.print(root.data+" ");
    inoder(root.right);
   }

 static void fixbst(node root) {
    if(root==null)
    return;
    fixbst(root.left);
    if(prev!=null&&root.data<prev.data)
    {
        if(first==null)
        first=prev;
        second=root;
    }
    prev=root;
    fixbst(root.right);
} 
static void correctBST( node root )
    {
        // Initialize pointers needed
        // for correctBSTUtil()
        
 
        // Set the pointers to find out
        // two nodes
        fixbst(root);
 
        // Fix (or correct) the tree
        if( first != null && second != null )
        {
            int temp = first.data;
            first.data = second.data;
        second.data = temp;
        }
        
 
        // else nodes have not been swapped,
        // passed tree is really BST.
    }
}
