/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 这是广度遍历,这个来自华为面试官的问题。使用一个队列来记录打印值，另一个队列来记录访问的节点。
 * @author HP
 *
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }

}

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> arrayList= new ArrayList<>();
    	
    	Queue queue=new ArrayDeque<TreeNode>();
    	if(root==null)
    		return null;
    	queue.add(root);
    	while(!queue.isEmpty()){
    		TreeNode temp=(TreeNode)queue.poll();
    		System.out.println(temp.val);
    		if(temp.left!=null)
    			queue.add(temp.left);
    		if(temp.right!=null)
    			queue.add(temp.right);
    		arrayList.add(temp.val);
    	}
        return arrayList;
    }

    public ArrayList<Integer> PrintFromTopToBottom1(TreeNode root) {
    	ArrayList<Integer> arrayList= new ArrayList<>();
    	ArrayList<TreeNode> arrQueue=new ArrayList<>();
        
        if(root==null)
        
        	return arrayList;
        
        arrQueue.add(root);
        while(!arrQueue.isEmpty())
        {
        	root=arrQueue.remove(0);
        	if(root.left!=null)
        		arrQueue.add(root.left);
        	if(root.right!=null)
        		arrQueue.add(root.right);
        	arrayList.add(root.val);
        }
        return arrayList;
    }

}
