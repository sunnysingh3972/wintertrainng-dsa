class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class deletioninbinarysearchtree {
    static node delnode(node root,int x)
    {
        if(root==null)
        {
            return null;

        }
        if(root.data>x)
        {
            root.left=delnode(root.left,x);
        }
        else if(root.data<x)
        {
            root.right=delnode(root.right, x);
        }
        else
        {
            if(root.left==null)
            return root.right;
            else if(root.right==null)
            return root.left;
            else{
            node succ=getsucc(root);
            root.data=succ.data;
            root.right=delnode(root.right, succ.data);
            }
        }
        return root;
    }
     static node getsucc(node root) {
       
        node curr=root.right;
        while(curr!=null&&curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;

    }
    static void inorder(node root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(20);
        root.left.right=new node(40);
        root.right=new node(70);
        root.right.left=new node(60);
        root.right.right=new node(80);
        root=delnode(root, 40);
        inorder(root);

    }
}
