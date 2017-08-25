/**
 * 
 * 我碰到这题 毫无思路，不过，可以归纳总结，归纳总结 是针对  斐波那契数列  最好的解决方式
 *
 *当target=0时，指的是，没有面积，当然，返回0
 *当target=1时，目标是2*n的大矩形，即n=1，那么只有一种覆盖方式，
 *当target=2时，目标是2*2的大矩形，放第一个2*1矩形的时候，有两种，竖放和横放，1.竖放第一块之后，
 *第二块，只能竖放，2.横放第一块之后，第二块，只能横放，，一共2种方式。
 *当target=3时，目标是2*3的大矩形，放第一块2*1矩形的时候，有两种方式，1.竖放，那种剩下的是2*2的矩形，
 *即，target=2的那种，共两种。2.横着放，放在上边和下边一样，那么剩下的是2*1，只有一种，是target=1的情况
 *所以，目前可以看出来 斐波那契数列。
 *
 */

public class RectCover {

    public int RectCover(int target) {

    				if (target < 1) {
    					return 0;
    				} else if (target == 1 || target == 2) {
    					return target;
    				} else {
    					return RectCover(target-1) + RectCover(target-2);
    					}

    }

}
