package question_3;


public class Q3 {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val){
			this.val = val;
			left = null;
			right = null;
		}
	}
	
	public static TreeNode addNode(TreeNode root, int val) {
		if(root == null) return new TreeNode(val);
		
		if(val < root.val) {
			root.left = addNode(root.left, val);
		} else {
			root.right = addNode(root.right, val);
		}
		
		return root;
	}
	
	public static int depth(TreeNode root) {
		if(root == null) return -1;
		int l = depth(root.left);
		int r = depth(root.right);
		return Math.max(l, r) + 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = null;
		
		root = addNode(root, 30);
		root = addNode(root, 70);
		root = addNode(root, 10);
		root = addNode(root, 40);
		root = addNode(root, 50);
		root = addNode(root, 20);
		root = addNode(root, 60);
		
		int ans = depth(root);
		
		System.out.println("depth :" + ans);

	}

}
