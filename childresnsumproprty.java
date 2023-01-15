import java.util.LinkedList;
import java.util.Queue;

class node{
    node left;
    node right;
    int data;
    node(int k)
    {
        this.data=k;
    }
}
public class childresnsumproprty {
    //recursive solution..
    static boolean isCsum(node root)
    {
        if(root==null)
        return true;
        if(root.left==null&&root.right==null)
        return true;
        int sum=0;
        if(root.left!=null)sum+=root.left.data;
        if(root.right!=null)sum+=root.right.data;
        return (root.data==sum&&isCsum(root.left)&&isCsum(root.right));
    }
    static boolean iscsum(node root)
    {
        if(root==null)
        return true;
       Queue<node> q=new LinkedList<>();
       q.add(root);
       while(!q.isEmpty())
       {
        node curr=q.poll();
        if(curr.left!=null&&curr.right!=null)
        {
            if(curr.data!=curr.left.data+curr.right.data)
            return false;
            q.add(curr.left);
            q.add(curr.right);
        }
       else if(curr.left==null&&curr.right!=null)
        {
            if(curr.data!=curr.right.data)
            return false;
            
            q.add(curr.right);
        }
        if(curr.left!=null&&curr.right==null)
        {
            if(curr.data!=curr.left.data)
            return false;
            q.add(curr.left);
            
        }
       }
       return true;
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
        System.out.println(isCsum(root));
        System.out.println(iscsum(root));
    }
}
