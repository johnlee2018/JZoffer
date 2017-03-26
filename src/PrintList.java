import java.util.ArrayList;
public class PrintList {
//该类为了保持文档正确，没有实际用处，下边类是功能实现类
}


class ListNode {
     int val;
     ListNode next = null;
     ListNode(int val) {
           this.val = val;
     }
  }

class Solution {
   		ArrayList<Integer> arrayList=new ArrayList<Integer>(){};
        
 	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
		  if(listNode!=null)
		  {
			  this.printListFromTailToHead(listNode.next);
		  	  arrayList.add(listNode.val);
		  }	
		  return arrayList;
	}
}