import java.util.Stack;//两个栈实现一个队列

public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();//存放栈数据
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {//队列push进来，同时也push到stack1，作为原始数据保存；
        stack1.push(node);
    }
    
    public int pop() {//队列pop操作，是FIFO,借助第二个栈，具体如下
    	stack2.empty();//第一个栈的数据存放顺序是和队列一样，但是pop的顺序正好相反，
    	while(!stack1.isEmpty())//所以队列每次pop动作，把Stack1弹出压入stack2，从stack2弹出的刚好是先进来的那个
    	{
    		stack2.push(stack1.pop());
    	}
    	int r=stack2.pop();
    	while(!stack2.isEmpty())
    	{
    		stack1.push(stack2.pop());
    	}
    	return r;
    }
  
}
