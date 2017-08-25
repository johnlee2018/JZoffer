/**
 * 
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * 保证是弹出序列的要求:比头一个输入大的数顺序随意，但是比第一个小的是数的输出顺序必须是倒叙。
 */

import java.util.ArrayList;

public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> arrPop=new ArrayList<Integer>();
        boolean result=false;
        if (pushA.length==0 && popA.length==0)
        	return !result;
        for (int i:pushA)
        	arr.add(i);
        for (int i:popA)//先保证两个ArrayList里边的值都是一样的
        {
        	if(!arr.contains(i))
        		return result;
        	arrPop.add(i);
        }
        int firstPlace=arr.indexOf(popA[0]);
        if(firstPlace==0 )
        	return !result;
        else
        	for(Integer i=0;i<firstPlace && i+1<firstPlace;i++)
        	{
        		if(arrPop.indexOf(arr.get(i))<arrPop.get(arr.get(i+1)))
        			return result;
        	}
        return !result;
       		
    }
}
