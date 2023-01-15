class node {
    node left;
    node right;
    int data;

    node(int data) {
        this.data = data;
    }
}

public class checkforbst {
    static node prev = null;

    public static void main(String[] args) {
        node root = new node(50);
        root.left = new node(10);
        root.right = new node(70);
        root.right.left = new node(20);
        root.right.right = new node(80);
        System.out.println(isBst(root));
    }

    static boolean isBst(node root) {
        if (root != null) {
            if (!isBst(root.left))
                return false;
            if (prev != null && root.data <= prev.data)
                return false;
            prev = root;
            return isBst(root.right);

        }
        return true;
    }

}
