class node {
    node left;
    node right;
    int data;

    node(int data) {
        this.data = data;
    }
}
class pair{
    int height;
    int diameter;
}


public class diameterofbinarytree {
    static int res=0;
    // naive approach
    static int diameter(node root) {
        if (root == null) {
            return 0;
        }
        int d1 = 1+height(root.left) + height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1, Math.max(d2, d3));

    }
//efficient approach
static int diameter11(node root)
{
    if(root==null)
    {
        return 0;
    }
    int lh=diameter11(root.left);
    int rh=diameter11(root.right);
    res=Math.max(res,(1+lh +rh));
    return 1+Math.max(lh, rh);

}
//efficient approach..
static pair diameter1(node root) {
    if (root == null) {
        pair output=new pair();
        output.height=0;
        output.diameter=0;
        return output;
    }
    pair lo=diameter1(root.left);
    pair ro=diameter1(root.right);
int height=1+Math.max(lo.height,ro.height);
    int d1 = 1+lo.height+ro.height;
    int d2 = lo.diameter;
    int d3 = ro.diameter;
    pair output=new pair();
    output.height=height;
    output.diameter=Math.max(d1, Math.max(d2, d3));
    return output;

}
    static int height(node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.right.left = new node(40);
        root.right.left.left = new node(60);
        root.right.right = new node(50);
        System.out.println(diameter(root));
        System.out.println(diameter1(root).diameter);
        System.out.println(diameter11(root));
        System.out.println(res);

    }
}
