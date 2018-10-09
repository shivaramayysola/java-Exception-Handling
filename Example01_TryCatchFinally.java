class Example01_TryCatchFinally
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("In Try");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("In catch");
		}
		finally
		{
			System.out.println("In finally");
		}
		System.out.println("after try/catch/finally");
	}
	
}