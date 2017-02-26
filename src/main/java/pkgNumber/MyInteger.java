package pkgNumber;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) 
	{
		super();
		setiValue(iValue);
	}

	public int getiValue() 
	{
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public static boolean isEven(int iValue) 
	{
		return (iValue%2==0);
	}
	
	public static boolean isEven(MyInteger iValue) 
	{
		return isEven(iValue.getiValue());
	}
	
	public boolean isEven() 
	{
	return MyInteger.isEven(getiValue());
	}

	public static boolean isOdd(int iValue) 
	{
		return (iValue%2!=0);
	}
	
	public static boolean isOdd(MyInteger iValue) 
	{
		return isOdd(iValue.getiValue());
	}
	
	public boolean isOdd() 
	{
		return isOdd(getiValue());
	}
	
	public static boolean isPrime(int iValue) 
	{	
		for (int i=2; i<= Math.ceil(Math.sqrt(iValue)); i++)
		{
			if (iValue%i==0)
				return false;
		}
		return true;
	}
	
	public static boolean isPrime(MyInteger iValue) 
	{	
		return isPrime(iValue.getiValue());
	}
	
	public boolean isPrime()
	{	
		return isPrime(getiValue());
	}
	
	public boolean equals(int iValue)
	{ 
		return (getiValue()==iValue);
	}
	
	public boolean equals(MyInteger iValue)
	{ 
		return equals(iValue.getiValue());
	}
}
