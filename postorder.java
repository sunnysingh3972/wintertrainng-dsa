//package DSA.gfg.tree;

class node {
    node left;
    node right;
    int data;

    node(int k) {
        this.data = k;
    }
}

public class postorder {
    static void Postorder(node root) {
        if (root != null) {

            Postorder(root.left);

            Postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        Postorder(root);
    }
}
