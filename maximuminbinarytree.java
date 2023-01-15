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
public class maximuminbinarytree {
    //rerucrsive solution...
    static int getmax(node root)
    {
        if(root==null)
        return Integer.MIN_VALUE;
        else
        return Math.max(root.data,Math.max(getmax(root.left),getmax(root.right)));
    }
    //iterative solution...
    static int gettmax(node root)
    {
        if(root==null)
        return Integer.MIN_VALUE;
        Queue<node> q=new LinkedList<>();
        q.add(root);
        int res=Integer.MIN_VALUE;
        while(q.isEmpty()==false)
        {
            node curr=q.poll();
            if(res<curr.data)
            res=curr.data;
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
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
        System.out.println("Maxium in binary tree : "+getmax(root));
        System.out.println("Maxium in binary tree : "+gettmax(root));
    }
}
