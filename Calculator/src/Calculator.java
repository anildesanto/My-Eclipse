
public class Calculator 
{
	public String multiplier(int a,int b,int c)
	
	{
		String result = "Result is ";
		//string division
		String divisionOperator= "/";
		String multiplyOperator= "x";
		// a check
		result += multiply(a,b,c,multiplyOperator);
		result += divide(a,b,c,divisionOperator);
		
		// b check
		result += multiply(b,c,a,multiplyOperator);
		result += divide(b,a,c,divisionOperator);
		
		//c check
		result += multiply(c,b,a,multiplyOperator);
		result += divide(c,a,b,divisionOperator);
		
		return result;
	}
	public String multiply(int first, int second, int third, String multiply)
	{
		String result1 = "";
		if (first*second==third) 
		{
			result1 += stringResult(first, second, third, multiply);
		}
		if (first*third==second)
		{
			result1 +=  stringResult( first,  third, second, multiply);	
		}
		return result1;
	}
	public String divide(int first, int second, int third, String devide)
	{
		String result1 = "";
		if (first/second==third) 
		{
			result1 += stringResult(first, second, third, devide);
		}
		if (first/third==second)
		{
			result1 +=  stringResult( first,  third, second, devide);	
		}
		return result1;
	}
	public String stringResult(int number1, int number2, int number3, String operator)
	{
		return "\n" + number1 + operator+  number2 + " = " + number3;
	}
}
