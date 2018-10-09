class Example03_TryCatchFinally
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("In Try");
			System.out.println(10/0);
		}
		catch(NullPointerException npe)
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