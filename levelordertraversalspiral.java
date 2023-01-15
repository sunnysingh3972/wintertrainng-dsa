import java.util.*;
class Node{
    Node left;
    Node right;
    int data;
    Node(int data)
    {
        this.data=data;
    }
}
public class levelordertraversalspiral {
    static void findSpiral(Node root) 
    {
     if(root==null)
        return ;
        Deque<Node> q=new LinkedList<>();
        q.addLast(root);
    int direction=0;
      while(!q.isEmpty())
        {
            int cnt=q.size();
            for(int i=0;i<cnt;i++)
            {
                if(direction==0)
                {
                    Node curr=q.pollLast();
                    System.out.print(curr.data+" ");
                    if(curr.right!=null)q.addFirst(curr.right);
                    if(curr.left!=null)q.addFirst(curr.left);
                 
                }
                else
                {
                    Node curr=q.pollFirst();
                    System.out.print(curr.data+" ");
                    if(curr.left!=null)q.addLast(curr.left);
                    if(curr.right!=null)q.addLast(curr.right);
                }
                
            }
            direction=1-direction;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right=new Node(30);
        root.right.right=new Node(60);
        root.right.right.right=new Node(80);
        root.right.right.left=new Node(70);
        findSpiral(root);
    }
}

