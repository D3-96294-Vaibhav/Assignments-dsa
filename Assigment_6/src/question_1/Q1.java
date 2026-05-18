package question_1;

public class Q1 {
	
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
		
		
		
	}

}
