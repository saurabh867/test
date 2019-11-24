package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(12345));
	}
	private static int squareRoot(int a,float b)
	{
		int value = (int) (a*a+b*b+2*a*b);
		return value;
	}
	private static boolean isPrime(int number)
	{
		boolean result=true;
		int k;
		for(int i=number-1;i>1;i--)
		{
			if((number%i)==0)
				return false;
		}
		return result;
	}
	private static int sumOfDigits(int number)
	{
		int remain,sum=0;
		do
		{
			remain=number%10;
			sum=sum+remain;
			number = number/10;
		}while(number>9);
		return sum+number;
	}

}
