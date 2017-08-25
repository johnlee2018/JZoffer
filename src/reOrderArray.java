import java.net.PasswordAuthentication;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author HP
 *像这种没有输出的，最后的结果，一定要赋给开始的变量
 */
public class reOrderArray {
    public void reOrderArray(int [] array) {
        if (array.length>0)
        {
        	int[] oddArray=new int[array.length];
        	int[] evenArray=new int[array.length];
        	int oddCount=0;
        	int evenCount=0;
        	for (int i:array)
        	{
        		if(i%2==1)//odd
        		{
        			oddArray[oddCount]=i;
        			oddCount++;
        		}
        		else
        		{
        			evenArray[evenCount]=i;
        			evenCount++;
        		}
        	}
        	for(int i=0;i<oddCount;i++)
        	{
        		array[i]=oddArray[i];
        	}
        	for(int i=0;i<evenCount;i++)
        	{
        		array[oddCount+i]=evenArray[i];
        	}

        }
        		
    }

}
