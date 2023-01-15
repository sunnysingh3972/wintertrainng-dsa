class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}

public class insertinbinarysearchtree {
    ///recursive
    static node insert(node root,int x)
    {
        if (root==null)
        return new node(x);
        else if(root.data>x)
        root.left=insert(root.left, x);
        else if(root.data<x)
        root.right=insert(root.right, x);
        return root;

    }
    //iterative
    static node inserT(node root,int x)
    {
        node temp=new node(x);
        node parent=null,curr=root;
        while(curr!=null)
        {
            parent=curr;
            if(curr.data<x)
            curr=curr.right;
            else if(curr.data>x)
            curr=curr.left;
            else
            return root;

        }
        if(parent==null)
        return temp;
        else if(parent.data>x)
        parent.left=temp;
        else
        parent.right=temp;
        return root;
    }
    static void inorder(node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
       node root=insert(null, 10);
       root=insert(root, 5);
       root=insert(root, 15);
       root=insert(root, 12);
       root=insert(root, 18);
       root=insert(root, 20);

       inorder(root);
       
    }
}
