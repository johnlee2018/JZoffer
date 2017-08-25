/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。 
 * @author HP
 *
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class MirrorTree {
    public void Mirror(TreeNode root) {
    	//root为空，root不为空，root的左右为空，不处理
        if(!(root==null ||((root.left==null)&&(root.right==null))))
        {
            TreeNode tmp;
            tmp=root.right;
            root.right=root.left;
            root.left=tmp;
            if(root.left!=null)
            	Mirror(root.left);
            if(root.right!=null)
            	Mirror(root.right);
        }
    }
}
