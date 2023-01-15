import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
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

public class verticalviewofbinarytree {
    static ArrayList<Integer> verticalview(node root) {
        TreeMap<Integer, ArrayList<Integer>> t = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(0, root));
        while (!q.isEmpty()) {
            pair curr = q.poll();
            if (t.containsKey(curr.hd))
                t.get(curr.hd).add(curr.root.data);
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(curr.root.data);
                t.put(curr.hd, temp);
            }
            if (curr.root.left != null) {
                q.add(new pair(curr.hd - 1, curr.root.left));
            }
            if (curr.root.right != null) {
                q.add(new pair(curr.hd + 1, curr.root.right));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> e:t.entrySet())
        ans.addAll(e.getValue());
        return ans;

    }

    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(20);
        root.right = new node(30);
        root.left.left = new node(40);
        root.left.right = new node(50);
        root.right.left = new node(60);
        root.right.right = new node(70);
        ArrayList<Integer> l1 = verticalview(root);
        System.out.println(l1);
    }
}
