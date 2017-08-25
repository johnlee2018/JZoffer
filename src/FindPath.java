/**
 * 虽然代码报错，但是并没有问题
 * 
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * 
 * 利用前序遍历，寻找先遍历，走到根节点，如果叶子节点不合适，退到上一个节点
 * 寻找右子树，右子树不合适，继续往上退。
 */

import java.util.ArrayList;

class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}

	public class FindPath {
	    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
		private ArrayList<Integer> list = new ArrayList<Integer>();
		public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
			if(root == null) 
				return listAll;
			list.add(root.val);
			target -= root.val;
			if(target == 0 && root.left == null && root.right == null) 
				listAll.add(new ArrayList<Integer>(list));
			FindPath(root.left, target);
			FindPath(root.right, target);
			list.remove(list.size()-1);
			return listAll;
	    }
	}
