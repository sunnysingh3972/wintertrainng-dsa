class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class countnodesincompletebinarytree {
    public static void main(String[] args) {
        node root=new node(10);
        root.left=new node(20);
        root.right=new node(30);
        root.left.left=new node(40);
        root.left.right=new node(50);
        System.out.println("Number of Nodes : "+countNode(root));
        System.out.println("Efificent ");
        System.out.println("Number of Nodes : "+countnode(root));

    }
//naive O(n)..
    private static int countNode(node root) {
        if(root==null)
        return 0;
        else
        return 1+countNode(root.left)+countNode(root.right);
    }
    public static int countnode(node root)
    {
        int lh=0;int rh=0;
        node curr=root;
        while(curr!=null)
        {
            lh++;
            curr=curr.left;
        }
        curr=root;
        while(curr!=null)
        {
            rh++;
            curr=curr.right;
        }
        if(lh==rh)
        {
           return (int)Math.pow(2,lh)-1; 
        }
        else
        {
            return 1+countnode(root.left)+countnode(root.right);
        }

    }
}
