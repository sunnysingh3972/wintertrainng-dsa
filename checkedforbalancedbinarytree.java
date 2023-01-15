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
public class checkedforbalancedbinarytree {
    static int checkforbst(node root)
    {
        if(root==null)
        return 0;
        int lh=checkforbst(root.left);
        if(lh==-1)
        return -1;
        int rh=checkforbst(root.right);
        if(rh==-1)
        return -1;
        if(Math.abs(lh-rh)>1)
        return -1;
        else return Math.max(lh,rh)+1;
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
    System.out.println(checkforbst(root));
    }
}
