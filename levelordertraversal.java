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
public class levelordertraversal {
    static void levelorder(node root)
    {
        if(root==null)
        return;
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        }
    }
    public static void main(String[] args) {
        node root=new node(1);
    root.left=new node(2);
    root.right=new node(3);
    root.left.left=new node(4);
    levelorder(root);
    }
}
