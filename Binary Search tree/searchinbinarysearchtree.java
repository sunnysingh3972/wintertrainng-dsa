class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}

public class searchinbinarysearchtree {
    static boolean search(node root,int x)
    {
        if(root==null)
        return false;
        else if(root.data==x)
        return true;
        else if(root.data>x)
        return search(root.left, x);
        else
        return search(root.right, x);
    }
    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(20);
        root.left.right=new node(40);
        root.right=new node(70);
        root.right.left=new node(60);
        root.right.right=new node(80);
        System.out.println(search(root, 20));
        
    }
}
