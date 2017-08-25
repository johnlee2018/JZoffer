/**
 * FindKthToTail输入一个链表，输出该链表中倒数第k个结点。
 * 
 * @author HP
 *
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
    void put(int val,ListNode next)
    {
    	
    }
 }
public class FindKthToTail {
public  ListNode FindKthToTail1 (ListNode head,int k) {
	if(head==null)
		return null;
	int count=1;
	ListNode h=head;
	while(head.next!=null)
	{
		head=head.next;
		count++;
	}
	if(k>count)
		return null;
	for(int i=0;i<count-k;i++)
	{
		h=h.next;
	}
	return h;
	}

public static  ListNode FindKthToTail2 (ListNode head,int k) {
	if(head==null)
		return null;
	int aPoint=1;
	int bPoint=1;
	ListNode KNode=head;
	while(head!=null)
	{ 
		head=head.next;
		if(bPoint-aPoint==k-1)
		{
			if(head==null)
				return KNode;
			else
			{
				aPoint++;
				bPoint++;
				KNode=KNode.next;
			}
		}
		else 
			if (head==null)
				return null;
			else
			    bPoint++;
		
	}
	return null;
 }

public static  ListNode FindKthToTail (ListNode head,int k) {
	if(k<1)
		return null;
	ListNode p1=head;
	ListNode p2=head;
	for(int i=0;i<k-1&&p1!=null;i++)
	{
		p1=p1.next;
	}
	if(p1==null)
		return null;
	while(p1.next!=null)
	{
		p1=p1.next;
		p2=p2.next;
	}
	return p2;
}
	public static void main(String[] args){
		ListNode head=new ListNode(4);
		head.next=new ListNode(3);
		head.next.next=new ListNode(2);
		//head.next.next.next=new ListNode(1);
		System.out.print(FindKthToTail(head,1).val);
	}
}
