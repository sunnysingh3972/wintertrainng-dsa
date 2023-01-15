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
public class printleftviewofbinarytree {
    static int max=0;
    static void printleftview(node root,int level)
    {
        if(root==null)
        return;
        if(max<level)
        {
            System.out.print(root.data+" ");
            max=level;
        }
        printleftview(root.left, level+1);
        printleftview(root.right, level+1);

    }
    static void leftview(node root)
    {
        if(root==null)
        return;
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int cnt=q.size();
            for(int i=0;i<cnt;i++)
            {
                node curr=q.poll();
                if(i==0)
                {
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
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
        printleftview(root, 1);
        System.out.println();
        leftview(root);

    }
}
