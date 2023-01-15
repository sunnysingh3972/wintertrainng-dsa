class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}

public class floorofbst {

    static node floor(node root,int x)
    {
        node res=null;
        while(root!=null)
        {
            if(root.data==x)
            return root;
            else if(root.data>x)
            root=root.left;
            else
            {
                res=root;
                root=root.right;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(20);
        root.left.right=new node(40);
        root.right=new node(70);
        root.right.left=new node(60);
        root.right.right=new node(80);
        System.out.println(floor(root, 100).data);
        
    }
}
