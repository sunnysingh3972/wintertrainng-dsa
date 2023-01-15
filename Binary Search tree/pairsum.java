import java.util.HashSet;

class node {
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class pairsum {
    public static void main(String[] args) {
        node root=new node(10);
        root.left=new node(8);
        root.left.left=new node(4);
        root.left.right=new node(9);
        root.right=new node(20);
        root.right.left=new node(11);
        root.right.right=new node(30);
        root.right.right.left=new node(25);
        System.out.println(isPairSum(root,33,new HashSet<>()));
    }

    static boolean isPairSum(node root, int sum,HashSet<Integer> s) {
        if(root==null)
        return false;
        if(isPairSum(root.left, sum, s)==true)
        return true;
        if(s.contains(sum-root.data))
        return true;
        else
        s.add(root.data);

        return isPairSum(root.right, sum,s);
    }
    
}
