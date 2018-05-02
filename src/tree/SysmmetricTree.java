package tree;

import java.util.LinkedList;
import java.util.Queue;

public class SysmmetricTree {

	public static boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		return isSame(root.left, root.right);
	}

	public static boolean isSame(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if (left == null || right == null) {
			return false;
		} else if (left.val != right.val) {
			return false;
		}
		return isSame(left.left, right.right) && isSame(left.right, right.left);
	}
	
	public static boolean isSymmetric_2(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root == null) {
			return true;
		}
		q.add(root.left);
		q.add(root.right);
		while(q.size() > 1) {
			TreeNode left = q.poll();
			TreeNode right = q.poll();
			if(left == null && right == null) {
				continue;
			} else if(left == null || right == null) {
				return false;
			} else if(left.val != right.val) {
				return false;
			}
			q.add(left.left);
			q.add(right.right);
			q.add(left.right);
			q.add(right.left);
		}
		return true;
	} 
}
