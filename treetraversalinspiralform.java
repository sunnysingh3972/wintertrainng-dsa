import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class node {
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class treetraversalinspiralform {
    //using one stack..
    static void printspiral(node root)
    {
if(root==null)
return;
Queue<node> q=new LinkedList<>();
Stack<Integer> s=new Stack<>();
boolean reverse=false;
q.add(root);
while(!q.isEmpty())
{
    int cnt=q.size();
    for(int  i=0;i<cnt;i++)
    {
        node curr=q.poll();
        if(reverse)
        {
            s.push(curr.data);
        }
        else
        {
            System.out.print(curr.data+" ");
        }
        if(curr.left!=null)q.add(curr.left);
        if(curr.right!=null)q.add(curr.right);
    }
    if(reverse)
    {
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
    reverse=!reverse;
}
    }
    static void printspiral1(node root)
    //using two stack..
    {
        if (root == null)
        return; // NULL check

    // Create two stacks to store alternate levels
    // For levels to be printed from right to left
    Stack<node> s1 = new Stack<node>();
    // For levels to be printed from left to right
    Stack<node> s2 = new Stack<node>();

    // Push first level to first stack 's1'
    s1.push(root);

    // Keep printing while any of the stacks has some
    // nodes
    while (!s1.empty() || !s2.empty()) {
        // Print nodes of current level from s1 and push
        // nodes of next level to s2
        while (!s1.empty()) {
            node temp = s1.peek();
            s1.pop();
            System.out.print(temp.data + " ");

            // Note that is right is pushed before left
            if (temp.right != null)
                s2.push(temp.right);

            if (temp.left != null)
                s2.push(temp.left);
        }

        // Print nodes of current level from s2 and push
        // nodes of next level to s1
        while (!s2.empty()) {
            node temp = s2.peek();
            s2.pop();
            System.out.print(temp.data + " ");

            // Note that is left is pushed before right
            if (temp.left != null)
                s1.push(temp.left);
            if (temp.right != null)
                s1.push(temp.right);
        }
    }
}
    


    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.left.right=new node(5);
        root.left.left=new node(4);
        root.left.left.left=new node(8);
        root.right=new node(3);
        root.right.left=new node(6);
        root.right.left.left=new node(10);
        root.right.right=new node(7);
        printspiral(root);
    }
}
