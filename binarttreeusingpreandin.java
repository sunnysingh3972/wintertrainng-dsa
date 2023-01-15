class node{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.data=data;
    }
}
public class binarttreeusingpreandin {
    static int preIndex=0;
    
    static node Ctree(int in[],int pre[],int is,int ie)

    {
        if(is>ie)
        return null;
        node root=new node(pre[preIndex++]);
        int inIndex=0;
        for(int i=is;i<=ie;i++)
        {
            if(in[i]==root.data)
            {
                inIndex=i;
                break;
            }
        } 
        root.left=Ctree(in,pre,is,inIndex-1);
        root.right=Ctree(in,pre,inIndex+1,ie);
        return root;
    }
    static void traversed(node root)
    {
        if(root==null)
        return;
        traversed(root.left);
       
        traversed(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int in[]={10,1,30,40,20};
        int pre[]={1,10,20,30,40};
        node root=Ctree(in, pre, 0, in.length-1);
        traversed(root);
    }
}
