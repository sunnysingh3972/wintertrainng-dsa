import java.util.*;
class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class maximumwidthofbinarytree {
    static int getMaxWidth(node root) {
        if(root==null)
        return 0;
        Queue<node> q=new LinkedList<>();
        q.add(root);
        int res=0;
        while(!q.isEmpty())
        {
            int cnt=q.size();
            res=Math.max(res,cnt);
            for(int i=0;i<cnt;i++)
            {
                node curr=q.poll();
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
        }
        return res;
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
        System.out.println(getMaxWidth(root));
    }
}
