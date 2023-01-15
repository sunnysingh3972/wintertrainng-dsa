class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class sizeofbinarytree {
    static int getsize(node root )
    {
        if(root==null)
        return 0;
        else
        return 1+getsize(root.left)+getsize(root.right);
    }
    public static void main(String[] args) {
        node root=new node(10);
        root.left=new node(20);
        root.left.left=new node(40);
        root.left.right=new node(50);
        root.right=new node(30);
        root.right.right=new node(60);
        root.right.right.right=new node(80);
        root.right.right.left=new node(70);
        System.out.println("Size of this binary tree : "+getsize(root));
    }
}
