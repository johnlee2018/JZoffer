/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 * 源程序import导入了Stack，故而使用辅助栈，记录最小的值。
 */
import java.util.Stack;

public class Stack1 {
	Stack<Integer> stack = new Stack<Integer>();//使用Integer 不是int
	Stack<Integer> min= new Stack<Integer>();//辅助栈，定义泛型时，只能使用对象，不能使用基本数据类型
	   public void push(int node) {
	        stack.push(node);
	        if(min.isEmpty())
	        	min.push(node);
	        else
	        	if (node<min.peek())
	        		min.push(node);
	    }
	    
	    public void pop() {
	       int popValue= stack.pop();
	       if(min.peek()==popValue)
	       {
	    	   min.pop();
	       }
	    }
	    
	    public int top() {
	        int top=(int) stack.peek();
	        return top;
	    }
	    
	    public int min() {
	        return min.peek();
	    }

}
