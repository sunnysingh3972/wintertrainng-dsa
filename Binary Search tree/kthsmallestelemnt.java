class node{
    node left;
    node right;
    int data;
    int lcount;
    node(int data)
    {
        this.data=data;
    }
}
public class kthsmallestelemnt {
    static node insert(node root,int x)
    {
        if(root==null)
        return new node(x);
        if(root.data>x)
        {
            root.left=insert(root.left, x);
            root.lcount++;
        }
        else if(root.data<x){
            root.right=insert(root.right, x);
        }
        return root;
    }
    //eficient method
    static node kthsmallest(node root ,int k)
    {
        if(root==null)
        return null;
        int count=root.lcount+1;
        if(count==k)
        return root;
        if(count>k)
        return kthsmallest(root.left, k);
        else
        return kthsmallest(root.right, k-count);
    }
    static int count=0;
    //naive
    static void kthsmall(node root,int k)
    {
        if(root!=null)
        {
kthsmall(root.left, k);
count++;
if(count==k)
{
    System.out.println(root.data);
    return;
}  
kthsmall(root.right, k);      }
    }
    public static void main(String[] args) {
        node root=null;
        root=insert(root, 10);
        root=insert(root, 5);
        root=insert(root, 15);
        root=insert(root, 20);
        root=insert(root, 2);
System.out.println(kthsmallest(root, 3).data);
kthsmall(root, 3);

    }
}
