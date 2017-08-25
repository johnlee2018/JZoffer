/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author HP
 *
 */
public class NumberOf1 {

    public int NumberOf1(int n) {
    	int count=0;
    	char [] chArr=Integer.toBinaryString(n).toCharArray();
    	for(char ch:chArr)
    	{
    		if(ch=='1')
    		{
    			count++;
    		}
    	}
    	return count;
    }

}
