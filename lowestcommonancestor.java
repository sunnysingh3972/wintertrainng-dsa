import java.util.ArrayList;

class Node{
    Node left;
    Node right;
    int data;
    Node(int data)
    {
        this.data=data;
    }
}
public class lowestcommonancestor {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(50);
        root.right.left.left=new Node(70);
        root.right.right=new Node(60);    
        root.right.right.right=new Node(90);
        root.right.right.left=new Node(80);
        root.right.right.right.right=new Node(40);
        System.out.println(lca(root,60,70));
        System.out.println(lca11(root, 10, 4).data);
    }

     static Node lca(Node root,int n1,int n2) {
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();
        if((findPath(root,path1,n1))==false||(findPath(root,path2,n2)==false))
        return null;
        for(int i=0;i<path1.size()&&i<path2.size();i++)
        {
            if(!path1.get(i).equals(path2.get(i)))
            return path1.get(i-1);
        }
        return null;
        
    }

     static boolean findPath(Node root, ArrayList<Node> path, int n) {
        if(root==null)
        return false;
        if(root.data==n)
        return true;
        if(findPath(root.left, path, n)||findPath(root.right, path, n))
        return true;
        if(path.size()>1)
        path.remove(path.size()-1);
        return false;

    }
    //efficient solution
    static Node lca11(Node root,int n1,int n2)
    {
        if(root==null)
        return null;
        if(root.data==n1||root.data==n2)
        return root;
        Node lca1=lca11(root.left, n1, n2);
        Node lca2=lca11(root.right, n1, n2);
        if(lca1!=null&&lca2!=null)
        return root;
        if(lca1!=null)
        return lca1;
        else
        return lca2;
    }

}
