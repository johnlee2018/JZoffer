
public class Fibonacci {
    public int Fibonacci(int n) {
    	if(n==0 )
    	{
    		return 0;
    	}
        if(n==1||n==2)
            {
            return 1;
        }
    	int [] FiArray=new int[n+1];
    	FiArray[0]=0;
    	FiArray[1]=1;
        FiArray[2]=1;
    	for(int i=3;i<=n;i++)
    	{
    		FiArray[i]=FiArray[i-1]+FiArray[i-2];
    		
    	}
    	return FiArray[n];
    }
}
