//package DSA.gfg.tree;

class node {
    node left;
    node right;
    int data;

    node(int k) {
        this.data = k;
    }
}

public class inorder {
    static void Inorder(node root) {
        if (root != null) {
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);

        }
    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        Inorder(root);
    }
}
