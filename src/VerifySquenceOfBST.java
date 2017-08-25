/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 实现思路：1.数组最后一个是根，{4,8,6,12,16,14,10}，10根，
 * 大于10的第一位是右子树，即从12开始，小于10的是左子树，2.验证左子树
 * 都小于根10，右子树都大于根10
 * 
 * */
public class VerifySquenceOfBST {
  
	public static boolean VerifySquenceOfBST(int [] sequence) {
    	boolean result=false;
        int len=sequence.length;
        if(len==0)
        	return result;
        if(len==1)
        	return !result;
   	
        int rootPlace=GetRootPlace(sequence);
        int [] leftSequence = new int[rootPlace];
        int [] rightSequence = new int[len-rootPlace-1];
		for(int i=0;i<rootPlace;i++)
		{
			leftSequence[i]=sequence[i];
			if(leftSequence[i]>sequence[len-1])
				return result;
		}
		for(int i=rootPlace;i<len-1;i++)
		{
			rightSequence[i-rootPlace]=sequence[i];
			if(rightSequence[i-rootPlace]<sequence[len-1])
				return result;
		}
        if((leftSequence.length>0)&&(rightSequence.length>0))
        	result=VerifySquenceOfBST(rightSequence)&&VerifySquenceOfBST(leftSequence);
        else if(leftSequence.length==0) 
        	result=VerifySquenceOfBST(rightSequence);
        else 
        	result=VerifySquenceOfBST(leftSequence);        
        return result;
    }
        
    private static int GetRootPlace(int [] sequence)
    {
    	for(int i=0;i<sequence.length-1;i++)

    		if (sequence[i]>sequence[sequence.length-1])
    			return i;
    	return sequence.length-1;
    }
    public static void main(String[] args) { 
    	int [] sequence={4,8,6,12,16,14,10};
    	int [] sequence1={7,4,6,5};
    	//[4,8,6,12,16,14,10]
    	boolean result =VerifySquenceOfBST(sequence);
    }
}
