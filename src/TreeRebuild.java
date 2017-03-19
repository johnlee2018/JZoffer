/**
 * Definition for binary tree
 * 
 * */

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class Solution {
	
	//private static TreeNode treeNode=null;
	//static TreeNode root=null;
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	int len=pre.length;
    	TreeNode root=null;
    	if ((len==0))
        {
        	return null;
        }
    	root=getTree(pre,in);
    	return root;
		
		
    }
	//int [] pre={1,2,3,4,5,6,7};
	//int [] in={3,2,4,1,6,5,7};

    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
	private static TreeNode getTree(int[] pre, int[] in) {
		int prank=0;
		TreeNode treeNode= new TreeNode(pre[prank]);//通过前序找好子树根节点
		if (pre.length==1)
		{
			treeNode.left=null;
			treeNode.right=null;
			return treeNode;
		}
		System.out.println("&&&&&&&&");
		System.out.println(in.length);
		System.out.println(pre.length);
		int irank=getIrank(prank,pre,in);//中序的下标
		System.out.println(irank);
		if ((irank>0)&(irank<pre.length-1))
		{
			int[] plow=new int[irank];
			int[] ilow=new int[irank];
			int[] ihigh=new int[in.length-irank-1];
			int[] phigh=new int[in.length-irank-1];
			ilow://根据子树跟节点切分中序得到左边部分
			for (int i=0;i<irank;i++ )
			{
				ilow[i]=in[i];
			}
	
			plow://根据子树跟节点切分前序得到左边部分
			for (int i=0;i<irank;i++ )
			{
				plow[i]=pre[i+1];
			}
	
			treeNode.left=getTree(plow,ilow);
			
			ihigh://根据子树跟节点切分中序得到右边部分
			for (int i=irank+1;i<in.length;i++ )
			{
				ihigh[i-irank-1]=in[i];
			}
	
			phigh://根据子树跟节点切分中序得到右边部分
			for (int i=irank+1;i<pre.length;i++ )
			{
				phigh[i-irank-1]=pre[i];
			}
			treeNode.right=getTree(phigh,ihigh);
		}
		else if(irank>0)
		{
			int[] plow=new int[irank];
			int[] ilow=new int[irank];
			ilow://根据子树跟节点切分中序得到左边部分
			for (int i=0;i<irank;i++ )
			{
				ilow[i]=in[i];
			}
	
			plow://根据子树跟节点切分前序得到左边部分
			for (int i=0;i<irank;i++ )
			{
				plow[i]=pre[i+1];
			}
			treeNode.right=null;
			treeNode.left=getTree(plow,ilow);
		}
		else if(irank<pre.length-1)
		{
			//int[] plow=new int[irank];
			//int[] ilow=new int[irank];
			int[] ihigh=new int[in.length-irank-1];
			int[] phigh=new int[in.length-irank-1];

			ihigh://根据子树跟节点切分中序得到右边部分
			for (int i=irank+1;i<in.length;i++ )
			{
				ihigh[i-irank-1]=in[i];
			}
	
			phigh://根据子树跟节点切分中序得到右边部分
			for (int i=irank+1;i<pre.length;i++ )
			{
				phigh[i-irank-1]=pre[i];
			}
			treeNode.left=null;
			treeNode.right=getTree(phigh,ihigh);
			
		}
		return treeNode;
	}
	
	private static int getIrank(int prank,int[] pre, int[] in)
	{
		for (int i=0;i<in.length;i++)
		{
			if(pre[prank]==in[i])
			{
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) { 
    	int [] pre={1,2,3,4,5,6,7};
    	int [] in={3,2,4,1,6,5,7};
    	reConstructBinaryTree(pre,in);
    }
}



public class Solution1 {	///重建的另一种方法
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) 
	{
		TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);//启动
		return root;    
		
	}
	//前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}    
	private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) 
	{
		if(startPre>endPre||startIn>endIn)
			return null;
		TreeNode root=new TreeNode(pre[startPre]);//每次都是用原来的pre，而我的是每次都生成一个新的，这个更好
		for(int i=startIn;i<=endIn;i++)//还存在子树
			if(in[i]==pre[startPre])//找到根节点位置i
			{
				root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);//这一步，锁定下一次循环的前序和中序序列
				root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
			}
			return root;
			}
	}
