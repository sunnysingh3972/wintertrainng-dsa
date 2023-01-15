class node{
    node left;
    node right;
    int data;
    node(int k)
    {
        this.data=k;
    }
}

public class printknodes {
    static void printKnode(node root,int k)
    {
        if(root==null)
        return;
        if(k==0)
        System.out.print(root.data+" ");
        printKnode(root.left, k-1);
        printKnode(root.right, k-1);
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        printKnode(root, 2);
    }
}
