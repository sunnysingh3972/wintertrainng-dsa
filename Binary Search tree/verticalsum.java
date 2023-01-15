
import java.util.Map;

import java.util.TreeMap;

class node {
    node left;
    node right;

    int data;

    node(int data) {
        this.data = data;
    }
}

class pair {
    int hd;
    node root;

    pair(int hd, node root) {
        this.hd = hd;
        this.root = root;
    }
}

public class verticalsum {

    static void vsum(node root, int hd, TreeMap<Integer, Integer> m) {
        if (root == null)
            return;
        vsum(root.left, hd - 1, m);
        int psum = (m.get(hd) == null) ? 0 : m.get(hd);
        m.put(hd, psum + root.data);
        vsum(root.right, hd + 1, m);

    }

    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.left.left = new node(40);
        root.left.right = new node(50);
        root.right.left = new node(60);
        root.right.right = new node(70);
        TreeMap<Integer, Integer> t = new TreeMap<>();
        int hd = 0;
        vsum(root, hd, t);
        for (Map.Entry<Integer, Integer> e : t.entrySet()) {
            System.out.println(e.getValue());
        }
    }
}
