import java.util.LinkedList;
import java.util.Queue;

class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class levelordretraversallinebyline1 {
    static void printlevelorderline(node root)
    {
        if(root==null)
        return;
        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1)
        {
            node curr=q.poll();
            if(curr==null)
            {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
    static void printlevelorderline2(node root)
    {
        if(root==null)
        return;
        Queue<node> q=new LinkedList<>();
        q.add(root);
      
        while(!q.isEmpty())
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
            }
            System.out.println();
        }
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
        printlevelorderline2(root);

    }
}
