// Java code to implement the approach

class Burnabinarytree {

	// Driver code
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.left.left.left = new Node(8);
		root.left.right.left = new Node(9);
		root.left.right.right = new Node(10);
		root.left.right.left.left = new Node(11);
		Distance dist = new Distance(-1);
		int target = 11;

		burnTime(root, target, dist);
		System.out.print(res);
	}

	static int res = 0;

	// Function to find the time to burn
	public static int burnTime(Node root, int leaf,
							Distance dist)
	{
		if (root == null)
			return 0;
		if (root.key == leaf) {
			dist.val = 0;
			return 1;
		}
		Distance ldist = new Distance(-1),
				rdist = new Distance(-1);
		int lh = burnTime(root.left, leaf, ldist);
		int rh = burnTime(root.right, leaf, rdist);

		if (ldist.val != -1) {
			dist.val = ldist.val + 1;
			res = Math.max(res, dist.val + rh);
		}
		else if (rdist.val != -1) {
			dist.val = rdist.val + 1;
			res = Math.max(res, dist.val + lh);
		}
		return Math.max(lh, rh) + 1;
	}
}

// Class to define a node of the tree
class Node {
	int key;
	Node left;
	Node right;
	Node(int k)
	{
		key = k;
		left = right = null;
	}
}

class Distance {
	int val;
	Distance(int d) { val = d; }
}
