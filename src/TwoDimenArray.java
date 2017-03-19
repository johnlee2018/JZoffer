import java.math.BigInteger;

public class TwoDimenArray  {
	
    public static int Find(int[][] array) {
        int lenOfList=array.length;
        int lenOfRow=array[0].length;
        int len=array.length*array[0].length;
        int nums=0;
        int count=1;
        for (;nums<=len;count++ )
        {
        	nums+=count;
        }
        //System.out.println(count);
        return count-1;
    }
    public static void main(String[] args) { 
    	int[][] array={{1,3,5},{7,8,11},{12}};
    	int count=Find(array);
    }

}
