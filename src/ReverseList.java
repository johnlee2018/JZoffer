/**
 * 输入一个链表，反转链表
 * @author HP
 *
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    public ListNode ReverseList(ListNode head) {
        ListNode headRer=null;//这是反向链表的头结点
        ListNode pre=null;//可以通过head取到next，但是取不到pre前一个，所以此处设置一个pre来存放前一个节点。
        if(head==null)
            return null;
        while(head!=null)//实际上 ，这部分要做的就是，每次向后移动一个，
        	//反转指向箭头，类似ABC(head的前一个，head，head后一个)三个数，相互交换位置
        {
        	//ListNode tmp=null;//设置一个用于交换的中间变量
            // headRer=head;//先把当前节点取出来，暂存
             //tmp=head.next;//将当前head的next取出来，暂存
            // headRer.next=pre;//当前节点指向前一个节点（放心，这步之前，当前节点的next已经放在tmp,\
             				 // ）
            // pre=head;//更新前一个节点为当前节点，为一次做准备
            // head=tmp;//更新当前结点，为下次做准备。
             pre=headRer;//存储pre
             headRer=head;//更新headRer
             head=head.next;//更新head    
             headRer.next=pre;//链接pre 
        }

        return headRer;
    }
}