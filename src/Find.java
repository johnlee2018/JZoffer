class Find
{
	/*
	 * 从开头到结尾循环查找法 复杂度为o(n^2)
	 * 
	 * */
    public static boolean Find2(int target, int [][] array) {
        int lenOfarray=array.length;
        int lenOfRow=array[0].length;
        Boolean flag=true;
		for (int i=0;flag && i<lenOfarray;i++)
		{
			for (int j=0;flag && j<lenOfRow;j++)
			{
				
				if (array[i][j]==target)
				{
					flag=false;
				}
			}
		}
		return !flag;
    }
	/*
	 * 从开头到结尾循环查找法 复杂度为o(n^2)
	 * 
	 * */

    public static boolean Find1(int target, int [][] array) {
        int lenOfarray=array.length;
        int lenOfRow=array[0].length;
        Boolean flag=true;
        outside:
		for (int i=0;i<lenOfarray;i++)
		{
			for (int j=0;j<lenOfRow;j++)
			{
				if (array[i][j]==target)
				{
					flag=false;
					break outside;
				}
			}
		}
		return !flag;
    }
	/*
	 * BD算法
	 * 
	 * */

    public static boolean Find3(int target, int [][] array) {
    	return false;
    }
    public static void main(String[] args) { 
    	int target=7; 
    	int [][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
    	Boolean result = Find1(target,array);
    	System.out.println(result);
    	Double ddata=200.5;
    	System.out.println(Math.sqrt(ddata));
    }
}