class Example_UnreachableStatement
{
	public static void main(String[] args)
	{
			
			System.out.println(m1());
	}
	static void m1()
	{
			try
			{
				System.out.println("In Try");
				System.out.println(10/0);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("In catch");
			}
				finally
				{
					System.out.println("In finally");
					
				}
				System.out.println("After try.catch/finally"); //CE: UNREACHABLE STATEMENT
				
	}
}