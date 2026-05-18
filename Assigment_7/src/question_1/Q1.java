package question_1;

public class Q1 {
	static class TreeNode {
		TreeNode left;
		TreeNode right;
		int val;
		
		TreeNode(int val){
			this.val = val;
			left=null;
			right = null;
		}
	}
	
	
	public static TreeNode addNode(TreeNode root, int key) {
		if(root == null) return new TreeNode(key);
		if(key > root.val) {
			root.right = addNode(root.right, key);
		} else {
			root.left = addNode(root.left, key);
		}
		return root;
	}
	
	public static TreeNode findSuccessor(TreeNode root) {
		root= root.right;
		while(root != null && root.left != null) {
			root = root.left;
		}
		return root;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = null;
		root = addNode(root, 4);
		root = addNode(root, 2);
		root = addNode(root, 3);
		root = addNode(root, 6);
		root = addNode(root, 5);
		root = addNode(root, 7);
		root = addNode(root, 1);
		
		TreeNode q1 = findSuccessor(root);
		System.out.println(q1.val);

	}

}
