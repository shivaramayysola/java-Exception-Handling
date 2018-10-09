class TestCase_01
{
	void m1()
	{
			
	}
	public static void main(String[] args)
	{
		System.out.println("1");
		try
		{
			System.out.println("2");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("4");
			System.out.println("10/0");
			System.out.println("5");
		}
		System.out.println("6");
	}	
}