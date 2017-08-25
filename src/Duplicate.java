import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
		public static boolean duplicate(int numbers[],int length,int [] duplication) {
			/**	
			//方法1：使用Arrays.sort排序整形数组，使用的是快速排序，那么时间复杂度是O(nlog(n))
				if(numbers == null || numbers.length == 0) return false;
				Arrays.sort(numbers);
				int flag = 0;//做标记
				for(int i=0;i<length-1;i++) {
					if(numbers[i] == numbers[i+1]) {
						duplication[0] = numbers[i];
						flag = 1;
						break;
					}
				}
				return flag == 1? true:false;
				
		//方法2：
			
				HashSet<Integer> hs = new HashSet<>();
				for(int i=0;i<length;i++) {
					if(!hs.add(numbers[i])) {
						duplication[0]=numbers[i];
						return true;
					}
				}
				return false;
			
			}
			*/
		//方法3：
			boolean flag=false;
			for(int j=0;j<length;j++)
			{
				///while(flag==true)
				
				for (int i=j;flag!=true;)
				{
					System.out.println("i "+numbers[i]);
					if(numbers[i]==i)
					{
						flag=true;
						System.out.println("if ");
					}
					else if (numbers[i]==numbers[numbers[i]])
						{
						duplication[0]=numbers[i];
						System.out.println(" else if ");
						return true;
						}
					else {
						int temp=numbers[i];
						int temp1=numbers[numbers[i]];
						numbers[numbers[i]]=temp;
						numbers[i]=temp1;
						for (int k=0;k<numbers.length;k++)
							System.out.print(" "+numbers[k]);
						System.out.println(" else ");
					}
				  }		
			}
			return false;
		}
		public static void main(String[] args)
		{
		  int[] numbers={2,1,3,1,4};
		  int[] duplication=new int[numbers.length];
		  System.out.println(duplicate(numbers,numbers.length,duplication));
		}
}
