package question_2;


public class Q2 {
	
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
	
	public static int search(TreeNode root, int target) {
		if(root == null) return -1;
		if(root.val == target) return root.val;
		if(target < root.val) {
			return search(root.left, target);
		} else {
			return search(root.right, target);
		}
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
		
		int ans = search(root, 40);
		if(ans >= 0) {
			System.out.println("Found"); 
		} else  {
			System.out.println("Not found");
		}
		 
	}

}
