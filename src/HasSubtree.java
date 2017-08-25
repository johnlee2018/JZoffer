import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * root2的根节点使用广度搜索，相同之后，再使用先序遍历
 */


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class HasSubtree {
	
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	boolean result=false;
    	//主要定义root的走向，如何扫描，先序遍历
        if((root2==null) || (root1==null))
        	return result;
        if(root1.val==root2.val)
           result=DoHaveSubtree(root1,root2);
        if(!result)
            result=HasSubtree(root1.left, root2);
           
        if(!result)
           result=HasSubtree(root1.right, root2);
        return result;
    }

	private boolean DoHaveSubtree(TreeNode root1, TreeNode root2) {
		// 一旦根节点的值相等了 ，验证其他的节点相同
		boolean result=false;
		if(root2==null)
			return !result;
		if(root1==null)
			return result;
		if(root1.val!=root2.val)
			return result;
		
		result=(DoHaveSubtree(root1.left, root2.left)&&DoHaveSubtree(root1.right, root2.right));
		return result;
	}

}



