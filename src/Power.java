/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author HP
 *
 */
public class Power {
    public double Power(double base, int exponent) {
        double result=1;
        
        if (base==0 && exponent>=0)
        	return 0;
        if (base==0)
        	return (Double) null;
        
        if(exponent>0)
        	while(exponent>0)
        	{
        		result*=base;
        		exponent--;
        	}
        else
        	while(exponent<0)
        	{
        		result/=base;
        		exponent++;
        	}
        return result;
  }

}
