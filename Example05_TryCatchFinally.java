class Example05_TryCatchFinally
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("In Try");
			System.out.println(10/0);
		}
		finally
		{
			System.out.println("In finally");
		}
		System.out.println("after try/finally");
	}
	
}