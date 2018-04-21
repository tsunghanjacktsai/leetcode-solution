package tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		level(list, root, 0);
		return list;
	}
	public void level(List<List<Integer>> list, TreeNode root, int level) {
		if(root == null) {
			return;
		}
		if(level >= list.size()) {
			list.add(0, new LinkedList<Integer>());
		}
		level(list, root.left, level + 1);
		level(list, root.right, level + 1);
		list.get(list.size() - level - 1).add(root.val);
	}
}
