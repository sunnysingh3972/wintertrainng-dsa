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
    static int inIndex=0;
    static node Ctree(int in[],int pre[],int is,int ie)

    {
        if(is>ie)
        return null;
        node root=new node(pre[preIndex++]);
        
        for(int i=is;i<ie;i++)
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
        System.out.print(root.data+" ");
        traversed(root.right);
    }
    public static void main(String[] args) {
        int in[]={20,10,30};
        int pre[]={10,20,30};
        node root=Ctree(in, pre, 0, in.length-1);
        traversed(root);
    }
}
